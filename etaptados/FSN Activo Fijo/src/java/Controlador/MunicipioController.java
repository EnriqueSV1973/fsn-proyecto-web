package Controlador;

import BEAN.MunicipioFacade;
import Controlador.util.JsfUtil;
import Controlador.util.JsfUtil.PersistAction;
import Modelo.Departamento;
import Modelo.Municipio;
import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

@Named("municipioController")
@SessionScoped
public class MunicipioController implements Serializable {

    @EJB
    private BEAN.MunicipioFacade ejbFacade;
    private List<Municipio> items = null;
    private Municipio selected;

    public MunicipioController() {
    }

    public Municipio getSelected() {
        return selected;
    }

    public void setSelected(Municipio selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private MunicipioFacade getFacade() {
        return ejbFacade;
    }

    private MunicipioFacade getFacadeMunicipio() {
        return ejbFacade;
    }

    public Municipio prepareCreate() {
        selected = new Municipio();
        initializeEmbeddableKey();
        return selected;
    }

// Modificada para rechazar los nombres iguales en el mismo departamento
    public void create() {
        String nmbmunicipio = selected.getNmbmunicipio().toUpperCase();
        Integer iddpto = selected.getIddpto().getIddpto();
        boolean evaluacion = ejbFacade.findDuplicados(nmbmunicipio, iddpto);
        if (evaluacion) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("MunicipioCreatedError")));
        } else {
            persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("MunicipioCreated"));
            if (!JsfUtil.isValidationFailed()) {
                items = null;    // Invalidate list of items to trigger re-query.
            }
        }
    }

    public void update() {
        String nmbmunicipio = selected.getNmbmunicipio().toString();
        Integer iddpto = selected.getIddpto().getIddpto();
        Integer idmunicipio = selected.getIdmunicipio();
        boolean evaluacion = ejbFacade.findDuplicados(nmbmunicipio, iddpto, idmunicipio);
        if (evaluacion) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(ResourceBundle.getBundle("/Bundle").getString("MunicipioUpdateError")));
            items = null;
        } else {
            persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("MunicipioUpdated"));
        }
    }
    /*public void update() {
     persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("MunicipioUpdated"));
     }*/

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("MunicipioDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Municipio> getItems() {
        if (items == null) {
            items = getFacade().findAll("Municipio.findAll");
        }
        return items;
    }

    public void setItems(List<Municipio> lista) {
        items = lista;
    }

public void idDeptoChangeListener(AjaxBehaviorEvent event) {
        Integer idpto = 0;
        FacesContext context = FacesContext.getCurrentInstance();
        Departamento departamento = (Departamento) event.getComponent().getAttributes().get("value");
        idpto = departamento.getIddpto();
        setItems(getFacade().findAllbyone("Municipio.findAllPorIddepto", "iddepto", idpto));
    }
    
     private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Municipio getMunicipio(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Municipio> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }
    public List<Municipio> getItemsAvailableSelectOne() {
          if (items == null) {
            items = getFacade().findAll("Municipio.findAll");
        }
          else {
              //No se ejecuta cuando items diferente a null
              Integer idpto = 0;
          }
        return items;
  }

    @FacesConverter(forClass = Municipio.class)
public static class MunicipioControllerConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0) {
            return null;
        }
        MunicipioController controller = (MunicipioController) facesContext.getApplication().getELResolver().
                getValue(facesContext.getELContext(), null, "municipioController");
        return controller.getMunicipio(getKey(value));
    }

    java.lang.Integer getKey(String value) {
        java.lang.Integer key;
        key = Integer.valueOf(value);
        return key;
    }

    String getStringKey(java.lang.Integer value) {
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Municipio) {
            Municipio o = (Municipio) object;
            return getStringKey(o.getIdmunicipio());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Municipio.class.getName()});
            return null;
        }
    }

}

}

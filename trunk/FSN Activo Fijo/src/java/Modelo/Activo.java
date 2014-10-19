package Modelo;
// Generated 10-18-2014 09:44:40 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Activo generated by hbm2java
 */
public class Activo  implements java.io.Serializable {


     private String idactivo;
     private Ubicacionfisica ubicacionfisica;
     private Tipoestado tipoestado;
     private Tipoactivo tipoactivo;
     private Tipomodalidad tipomodalidad;
     private Categoria categoria;
     private Empleado empleado;
     private Persona persona;
     private String nmbactivo;
     private String dscactivo;
     private String obsactivo;
     private String marcaactivo;
     private String modeloactivo;
     private Date fechaAdquisicion;
     private int estadoactivo;
     private BigDecimal costoadquicision;
     private BigDecimal valorresidual;
     private char nuevo;
     private Set mantenimientos = new HashSet(0);
     private Set inventarios = new HashSet(0);
     private Set transferencias = new HashSet(0);
     private Set especificacionactivos = new HashSet(0);

    public Activo() {
    }

	
    public Activo(String idactivo, Ubicacionfisica ubicacionfisica, Tipoestado tipoestado, Categoria categoria, String nmbactivo, String dscactivo, String obsactivo, String marcaactivo, String modeloactivo, Date fechaAdquisicion, int estadoactivo, BigDecimal costoadquicision, BigDecimal valorresidual, char nuevo) {
        this.idactivo = idactivo;
        this.ubicacionfisica = ubicacionfisica;
        this.tipoestado = tipoestado;
        this.categoria = categoria;
        this.nmbactivo = nmbactivo;
        this.dscactivo = dscactivo;
        this.obsactivo = obsactivo;
        this.marcaactivo = marcaactivo;
        this.modeloactivo = modeloactivo;
        this.fechaAdquisicion = fechaAdquisicion;
        this.estadoactivo = estadoactivo;
        this.costoadquicision = costoadquicision;
        this.valorresidual = valorresidual;
        this.nuevo = nuevo;
    }
    public Activo(String idactivo, Ubicacionfisica ubicacionfisica, Tipoestado tipoestado, Tipoactivo tipoactivo, Tipomodalidad tipomodalidad, Categoria categoria, Empleado empleado, Persona persona, String nmbactivo, String dscactivo, String obsactivo, String marcaactivo, String modeloactivo, Date fechaAdquisicion, int estadoactivo, BigDecimal costoadquicision, BigDecimal valorresidual, char nuevo, Set mantenimientos, Set inventarios, Set transferencias, Set especificacionactivos) {
       this.idactivo = idactivo;
       this.ubicacionfisica = ubicacionfisica;
       this.tipoestado = tipoestado;
       this.tipoactivo = tipoactivo;
       this.tipomodalidad = tipomodalidad;
       this.categoria = categoria;
       this.empleado = empleado;
       this.persona = persona;
       this.nmbactivo = nmbactivo;
       this.dscactivo = dscactivo;
       this.obsactivo = obsactivo;
       this.marcaactivo = marcaactivo;
       this.modeloactivo = modeloactivo;
       this.fechaAdquisicion = fechaAdquisicion;
       this.estadoactivo = estadoactivo;
       this.costoadquicision = costoadquicision;
       this.valorresidual = valorresidual;
       this.nuevo = nuevo;
       this.mantenimientos = mantenimientos;
       this.inventarios = inventarios;
       this.transferencias = transferencias;
       this.especificacionactivos = especificacionactivos;
    }
   
    public String getIdactivo() {
        return this.idactivo;
    }
    
    public void setIdactivo(String idactivo) {
        this.idactivo = idactivo;
    }
    public Ubicacionfisica getUbicacionfisica() {
        return this.ubicacionfisica;
    }
    
    public void setUbicacionfisica(Ubicacionfisica ubicacionfisica) {
        this.ubicacionfisica = ubicacionfisica;
    }
    public Tipoestado getTipoestado() {
        return this.tipoestado;
    }
    
    public void setTipoestado(Tipoestado tipoestado) {
        this.tipoestado = tipoestado;
    }
    public Tipoactivo getTipoactivo() {
        return this.tipoactivo;
    }
    
    public void setTipoactivo(Tipoactivo tipoactivo) {
        this.tipoactivo = tipoactivo;
    }
    public Tipomodalidad getTipomodalidad() {
        return this.tipomodalidad;
    }
    
    public void setTipomodalidad(Tipomodalidad tipomodalidad) {
        this.tipomodalidad = tipomodalidad;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getNmbactivo() {
        return this.nmbactivo;
    }
    
    public void setNmbactivo(String nmbactivo) {
        this.nmbactivo = nmbactivo;
    }
    public String getDscactivo() {
        return this.dscactivo;
    }
    
    public void setDscactivo(String dscactivo) {
        this.dscactivo = dscactivo;
    }
    public String getObsactivo() {
        return this.obsactivo;
    }
    
    public void setObsactivo(String obsactivo) {
        this.obsactivo = obsactivo;
    }
    public String getMarcaactivo() {
        return this.marcaactivo;
    }
    
    public void setMarcaactivo(String marcaactivo) {
        this.marcaactivo = marcaactivo;
    }
    public String getModeloactivo() {
        return this.modeloactivo;
    }
    
    public void setModeloactivo(String modeloactivo) {
        this.modeloactivo = modeloactivo;
    }
    public Date getFechaAdquisicion() {
        return this.fechaAdquisicion;
    }
    
    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }
    public int getEstadoactivo() {
        return this.estadoactivo;
    }
    
    public void setEstadoactivo(int estadoactivo) {
        this.estadoactivo = estadoactivo;
    }
    public BigDecimal getCostoadquicision() {
        return this.costoadquicision;
    }
    
    public void setCostoadquicision(BigDecimal costoadquicision) {
        this.costoadquicision = costoadquicision;
    }
    public BigDecimal getValorresidual() {
        return this.valorresidual;
    }
    
    public void setValorresidual(BigDecimal valorresidual) {
        this.valorresidual = valorresidual;
    }
    public char getNuevo() {
        return this.nuevo;
    }
    
    public void setNuevo(char nuevo) {
        this.nuevo = nuevo;
    }
    public Set getMantenimientos() {
        return this.mantenimientos;
    }
    
    public void setMantenimientos(Set mantenimientos) {
        this.mantenimientos = mantenimientos;
    }
    public Set getInventarios() {
        return this.inventarios;
    }
    
    public void setInventarios(Set inventarios) {
        this.inventarios = inventarios;
    }
    public Set getTransferencias() {
        return this.transferencias;
    }
    
    public void setTransferencias(Set transferencias) {
        this.transferencias = transferencias;
    }
    public Set getEspecificacionactivos() {
        return this.especificacionactivos;
    }
    
    public void setEspecificacionactivos(Set especificacionactivos) {
        this.especificacionactivos = especificacionactivos;
    }




}



package Modelo;
// Generated 10-18-2014 09:44:40 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Departamento generated by hbm2java
 */
public class Departamento  implements java.io.Serializable {


     private int iddpto;
     private String nmbdpto;
     private String obsdpto;
     private Set municipios = new HashSet(0);
     private Set ubicacionfisicas = new HashSet(0);

    public Departamento() {
    }

	
    public Departamento(int iddpto, String nmbdpto, String obsdpto) {
        this.iddpto = iddpto;
        this.nmbdpto = nmbdpto;
        this.obsdpto = obsdpto;
    }
    public Departamento(int iddpto, String nmbdpto, String obsdpto, Set municipios, Set ubicacionfisicas) {
       this.iddpto = iddpto;
       this.nmbdpto = nmbdpto;
       this.obsdpto = obsdpto;
       this.municipios = municipios;
       this.ubicacionfisicas = ubicacionfisicas;
    }
   
    public int getIddpto() {
        return this.iddpto;
    }
    
    public void setIddpto(int iddpto) {
        this.iddpto = iddpto;
    }
    public String getNmbdpto() {
        return this.nmbdpto;
    }
    
    public void setNmbdpto(String nmbdpto) {
        this.nmbdpto = nmbdpto;
    }
    public String getObsdpto() {
        return this.obsdpto;
    }
    
    public void setObsdpto(String obsdpto) {
        this.obsdpto = obsdpto;
    }
    public Set getMunicipios() {
        return this.municipios;
    }
    
    public void setMunicipios(Set municipios) {
        this.municipios = municipios;
    }
    public Set getUbicacionfisicas() {
        return this.ubicacionfisicas;
    }
    
    public void setUbicacionfisicas(Set ubicacionfisicas) {
        this.ubicacionfisicas = ubicacionfisicas;
    }




}



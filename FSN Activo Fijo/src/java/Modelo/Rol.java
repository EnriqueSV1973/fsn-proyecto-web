package Modelo;
// Generated 10-20-2014 02:19:12 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private int idrol;
     private String nmbtipousuario;
     private String dsctipousuario;
     private Set plantillaactividads = new HashSet(0);
     private Set usuarios = new HashSet(0);

    public Rol() {
    }

	
    public Rol(int idrol, String nmbtipousuario) {
        this.idrol = idrol;
        this.nmbtipousuario = nmbtipousuario;
    }
    public Rol(int idrol, String nmbtipousuario, String dsctipousuario, Set plantillaactividads, Set usuarios) {
       this.idrol = idrol;
       this.nmbtipousuario = nmbtipousuario;
       this.dsctipousuario = dsctipousuario;
       this.plantillaactividads = plantillaactividads;
       this.usuarios = usuarios;
    }
   
    public int getIdrol() {
        return this.idrol;
    }
    
    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }
    public String getNmbtipousuario() {
        return this.nmbtipousuario;
    }
    
    public void setNmbtipousuario(String nmbtipousuario) {
        this.nmbtipousuario = nmbtipousuario;
    }
    public String getDsctipousuario() {
        return this.dsctipousuario;
    }
    
    public void setDsctipousuario(String dsctipousuario) {
        this.dsctipousuario = dsctipousuario;
    }
    public Set getPlantillaactividads() {
        return this.plantillaactividads;
    }
    
    public void setPlantillaactividads(Set plantillaactividads) {
        this.plantillaactividads = plantillaactividads;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


package Modelo;
// Generated 10-18-2014 09:44:40 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Tipodesafectacion generated by hbm2java
 */
public class Tipodesafectacion  implements java.io.Serializable {


     private int idtipodesafectacion;
     private String nmbdesafectacion;
     private String dscdesafectacion;
     private Set desafectacions = new HashSet(0);

    public Tipodesafectacion() {
    }

	
    public Tipodesafectacion(int idtipodesafectacion, String nmbdesafectacion) {
        this.idtipodesafectacion = idtipodesafectacion;
        this.nmbdesafectacion = nmbdesafectacion;
    }
    public Tipodesafectacion(int idtipodesafectacion, String nmbdesafectacion, String dscdesafectacion, Set desafectacions) {
       this.idtipodesafectacion = idtipodesafectacion;
       this.nmbdesafectacion = nmbdesafectacion;
       this.dscdesafectacion = dscdesafectacion;
       this.desafectacions = desafectacions;
    }
   
    public int getIdtipodesafectacion() {
        return this.idtipodesafectacion;
    }
    
    public void setIdtipodesafectacion(int idtipodesafectacion) {
        this.idtipodesafectacion = idtipodesafectacion;
    }
    public String getNmbdesafectacion() {
        return this.nmbdesafectacion;
    }
    
    public void setNmbdesafectacion(String nmbdesafectacion) {
        this.nmbdesafectacion = nmbdesafectacion;
    }
    public String getDscdesafectacion() {
        return this.dscdesafectacion;
    }
    
    public void setDscdesafectacion(String dscdesafectacion) {
        this.dscdesafectacion = dscdesafectacion;
    }
    public Set getDesafectacions() {
        return this.desafectacions;
    }
    
    public void setDesafectacions(Set desafectacions) {
        this.desafectacions = desafectacions;
    }




}



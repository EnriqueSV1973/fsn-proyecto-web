package Modelo;
// Generated 10-20-2014 02:19:12 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Cargo generated by hbm2java
 */
public class Cargo  implements java.io.Serializable {


     private int idcargo;
     private String nmbcargo;
     private String dsccargo;
     private Set empleados = new HashSet(0);

    public Cargo() {
    }

	
    public Cargo(int idcargo, String nmbcargo, String dsccargo) {
        this.idcargo = idcargo;
        this.nmbcargo = nmbcargo;
        this.dsccargo = dsccargo;
    }
    public Cargo(int idcargo, String nmbcargo, String dsccargo, Set empleados) {
       this.idcargo = idcargo;
       this.nmbcargo = nmbcargo;
       this.dsccargo = dsccargo;
       this.empleados = empleados;
    }
   
    public int getIdcargo() {
        return this.idcargo;
    }
    
    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
    }
    public String getNmbcargo() {
        return this.nmbcargo;
    }
    
    public void setNmbcargo(String nmbcargo) {
        this.nmbcargo = nmbcargo;
    }
    public String getDsccargo() {
        return this.dsccargo;
    }
    
    public void setDsccargo(String dsccargo) {
        this.dsccargo = dsccargo;
    }
    public Set getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set empleados) {
        this.empleados = empleados;
    }




}



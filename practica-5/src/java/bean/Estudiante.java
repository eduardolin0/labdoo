/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Lino
 */
public class Estudiante {
    private String nombre;
    private String carrera;
    private String fechanac;
    private String contra;
    private String correoe;

    public Estudiante(String nombre, String carrera, String fechanac, String contra, String correoe) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.fechanac = fechanac;
        this.contra = contra;
        this.correoe = correoe;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCorreoe() {
        return correoe;
    }

    public void setCorreoe(String correoe) {
        this.correoe = correoe;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.actividad03_03.modelo;

import java.time.LocalDate;

/**
 *
 * @author jenniferzumba
 */
public class Proveedor {
    private String cedula;
    private String nombre;
    private String direccion;
    

    public Proveedor(String cedula, String nombre, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

    @Override
    public String toString() {
        return "Proveedor{" + "cedula=" + cedula + ", nombre=" + nombre 
                + ", ruta=" + direccion + '}';
    }
    
    
    
}

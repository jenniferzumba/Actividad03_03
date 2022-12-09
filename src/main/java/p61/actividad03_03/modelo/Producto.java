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
public class Producto {
    private int codigo; 
    private String nombre; 
    private int cantidad;
    private double precio;
    private Proveedor nombreProveedor;
    private String tipoProducto;
    
    public Producto(int codigo, String nombre, int cantidad, double precio,Proveedor nombreProveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombreProveedor = nombreProveedor;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre 
                + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }

    
    
    
    
}

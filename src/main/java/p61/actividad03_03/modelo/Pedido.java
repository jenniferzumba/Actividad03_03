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
public class Pedido {
    private int codigoPedido; 
    private Proveedor nombreProveedor; 
    private String tipoDeMercaderia;
    private Producto Producto;

    public Pedido(int codigoPedido, Proveedor nombreProveedor, String tipoDeMercaderia, Producto Producto) {
        this.codigoPedido = codigoPedido;
        this.nombreProveedor = nombreProveedor;
        this.tipoDeMercaderia = tipoDeMercaderia;
        this.Producto = Producto;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public Proveedor getNombreProveedor() {
        return nombreProveedor;
    }

    public String getTipoDeMercaderia() {
        return tipoDeMercaderia;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public void setNombreProveedor(Proveedor nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public void setTipoDeMercaderia(String tipoDeMercaderia) {
        this.tipoDeMercaderia = tipoDeMercaderia;
    }

    public void setProducto(Producto Producto) {
        this.Producto = Producto;
    }
   
   
   


   

    @Override
    public String toString() {
        return "Pedido{" + "codigoPedido=" + codigoPedido + ", nombreContador="  +  '}';
    }
  
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.actividad03_03.controlador;

import java.time.LocalDate;
import java.util.List;
import p61.actividad03_03.modelo.Producto;
import p61.actividad03_03.servicio.ProductoServicioImpl;

/**
 *
 * @author jenniferzumba
 */
public class ProductoControl {
    private ProductoServicioImpl productoServiceImpl = new ProductoServicioImpl();

    public void crearProducto(String[] dataProducto) {

        var retorno = ("No se pudo crear el Producto");
        var valida = true;
        var codigo = Integer.valueOf(dataProducto[0]).intValue();
        var nombre = dataProducto[1];
        var cantidad = Integer.valueOf(dataProducto[2]).intValue();
        var precio = Double.valueOf(dataProducto[3]).doubleValue();

        if (validaCodigo(codigo) == false) {
            retorno += "\n Codigo Incorrecto";
            valida = false;
        }

        if (validaPrecio(precio) == false) {
            retorno += "\n Precio incorrecto";
            valida = false;
        }

       
    }

    public boolean validaCodigo(int codigo) {

        var retorno = false;

        String numCadena = String.valueOf(codigo);
        String cadena = numCadena;

        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
            } else {
                return retorno;
            }
        }

        var cod = Integer.valueOf(codigo).intValue();

        if (cod > 0) {
            retorno = true;
        }

        return retorno;

    }


    public boolean validaPrecio(double precio) {

        var retorno = false;

        String numCadena = String.valueOf(precio);
        String cadena = numCadena;

        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
            } else {
                return retorno;
            }
        }

        var costoF = Double.valueOf(precio).intValue();

        if (costoF > 0 && costoF < 10000) {
            retorno = true;
        }

        return retorno;

    }

    
  public List<Producto> listar(){
    return this.productoServiceImpl.listar();
    
}
    
    
    
}

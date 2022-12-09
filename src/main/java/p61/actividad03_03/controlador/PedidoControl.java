/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.actividad03_03.controlador;


import java.util.List;
import p61.actividad03_03.modelo.Pedido;
import p61.actividad03_03.modelo.Producto;
import p61.actividad03_03.servicio.PedidoServicioImpl;
import p61.actividad03_03.servicio.ProductoServicioImpl;

/**
 *
 * @author jenniferzumba
 */
public class PedidoControl {
    private PedidoServicioImpl pedidoServiceImpl;
    private ProductoServicioImpl productoServiceImpl;

    public void crearPedido(String[] data, Producto producto) {

        var retorno = ("No se pudo crear el Pedido");
        var valida = true;
        var codigo = Integer.valueOf(data[0]).intValue();
        var nombreProveedor = data[1];
        var mercaderia=data[2];
        
       

        if (validaCodigo(codigo) == false) {
            retorno += "\n Codigo Incorrecto";
            valida = false;
        }

        if (valida==true) {         
            var pedido = new Pedido (codigo, nombreProveedor,  mercaderia);
            this.pedidoServiceImpl.crear(pedido);           
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

    public boolean validaNombre(String nombre) {
        var retorno = false;

        String cadena = nombre;
        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
                retorno = true;
                return retorno;
            }
        }

        return retorno;
    }


    public List<Pedido> listar() {
        return this.pedidoServiceImpl.listar();
    }
}

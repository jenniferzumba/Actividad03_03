/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.actividad03_03.controlador;


import java.time.LocalDate;
import java.util.List;
import p61.actividad03_03.modelo.Proveedor;
import p61.actividad03_03.servicio.ProveedorServicioImpl;

/**
 *
 * @author jenniferzumba
 */
public class ProveedorControl {
    
    private ProveedorServicioImpl proveedorServiceImpl = new ProveedorServicioImpl();

    public String crearProveedor(String[] dataProveedor) {

        var retorno = ("No se pudo crear el Producto");
        var valida = true;
        var cedula = dataProveedor[0];
        var nombre = dataProveedor[1];
        var direccion = dataProveedor[2];
        

        if (validaCedula(cedula) != 10) {
            retorno += "\n Cedula incorrecta";
            valida = false;
        }

       


        if (valida == true) {
            var proveedor = new Proveedor(cedula, nombre, direccion);
            this.proveedorServiceImpl.crear(proveedor);
        }
        return retorno;

    }

    public int validaCedula(String cedula) {

        var retorno = 0;

        String cadena = cedula;

        char[] cadena_div = cadena.toCharArray();
        String n = "";
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                n += cadena_div[i];
                retorno = i + 1;
            }

        }
        return retorno;
    }

    
    
public List<Proveedor> listar(){
    return this.proveedorServiceImpl.listar();
}
    
    public ProveedorControl() {
        
        proveedorServiceImpl= new ProveedorServicioImpl();
    }
    
   
    
}

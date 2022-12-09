/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.actividad03_03.servicio;

import java.util.ArrayList;
import java.util.List;
import p61.actividad03_03.modelo.Producto;

/**
 *
 * @author jenniferzumba
 */
public class ProductoServicioImpl implements ProductoService {
    
    private static List<Producto> productoList = new ArrayList<>();
      
    @Override
    public void crear(Producto producto) {
    this.productoList.add(producto);
          
    }

    @Override
    public List<Producto> listar() {
        return this.productoList;
        
    }
   
   
    
    
}

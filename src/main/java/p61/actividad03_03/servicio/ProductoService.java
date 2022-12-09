/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p61.actividad03_03.servicio;

import java.util.List;
import p61.actividad03_03.modelo.Producto;

/**
 *
 * @author jenniferzumba
 */
public interface ProductoService {
    
    public void crear(Producto producto);
    public List<Producto> listar();
   
    
}

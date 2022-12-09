/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.actividad03_03.servicio;

import java.util.ArrayList;
import java.util.List;
import p61.actividad03_03.modelo.Proveedor;

/**
 *
 * @author jenniferzumba
 */
public class ProveedorServicioImpl implements ProveedorService {
    
    private static List<Proveedor> proveedorList = new ArrayList<>();
    
    
    @Override
    public void crear(Proveedor proveedor) {
        this.proveedorList.add(proveedor);
        
    }

    @Override
    public List<Proveedor> listar() {
        return this.proveedorList;
        
    }
    
    
}

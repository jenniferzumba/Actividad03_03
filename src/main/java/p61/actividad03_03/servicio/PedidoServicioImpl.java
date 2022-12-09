/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.actividad03_03.servicio;

import java.util.ArrayList;
import java.util.List;
import p61.actividad03_03.modelo.Pedido;

/**
 *
 * @author jenniferzumba
 */
public class PedidoServicioImpl  implements PedidoService{
    private List<Pedido> pedidoList;

    public PedidoServicioImpl(List<Pedido> pedidoList) {
        this.pedidoList = new ArrayList<>();
    }
            
    @Override
    public void crear(Pedido pedido) {
        this.pedidoList.add(pedido);
        
    }

    @Override
    public List<Pedido> listar() {
       return this.pedidoList;
    }
    
}

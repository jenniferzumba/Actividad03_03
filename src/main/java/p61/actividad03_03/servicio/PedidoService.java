/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p61.actividad03_03.servicio;

import java.util.List;
import p61.actividad03_03.modelo.Pedido;

/**
 *
 * @author jenniferzumba
 */
public interface PedidoService {
    
  public void crear(Pedido pedido);
    public List<Pedido> listar();

    
}

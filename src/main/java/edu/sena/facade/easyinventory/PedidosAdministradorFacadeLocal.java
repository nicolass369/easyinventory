/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.PedidosAdministrador;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kubit
 */
@Local
public interface PedidosAdministradorFacadeLocal {

    void create(PedidosAdministrador pedidosAdministrador);

    void edit(PedidosAdministrador pedidosAdministrador);

    void remove(PedidosAdministrador pedidosAdministrador);

    PedidosAdministrador find(Object id);

    List<PedidosAdministrador> findAll();

    List<PedidosAdministrador> findRange(int[] range);

    int count();
    
}

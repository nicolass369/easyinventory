/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.GeneracionVenta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kubit
 */
@Local
public interface GeneracionVentaFacadeLocal {

    void create(GeneracionVenta generacionVenta);

    void edit(GeneracionVenta generacionVenta);

    void remove(GeneracionVenta generacionVenta);

    GeneracionVenta find(Object id);

    List<GeneracionVenta> findAll();

    List<GeneracionVenta> findRange(int[] range);

    int count();
    
}

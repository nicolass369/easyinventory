/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.OfertaMateriales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kubit
 */
@Local
public interface OfertaMaterialesFacadeLocal {

    void create(OfertaMateriales ofertaMateriales);

    void edit(OfertaMateriales ofertaMateriales);

    void remove(OfertaMateriales ofertaMateriales);

    OfertaMateriales find(Object id);

    List<OfertaMateriales> findAll();

    List<OfertaMateriales> findRange(int[] range);

    int count();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.OrdenesTrabajo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kubit
 */
@Local
public interface OrdenesTrabajoFacadeLocal {

    void create(OrdenesTrabajo ordenesTrabajo);

    void edit(OrdenesTrabajo ordenesTrabajo);

    void remove(OrdenesTrabajo ordenesTrabajo);

    OrdenesTrabajo find(Object id);

    List<OrdenesTrabajo> findAll();

    List<OrdenesTrabajo> findRange(int[] range);

    int count();
    
}

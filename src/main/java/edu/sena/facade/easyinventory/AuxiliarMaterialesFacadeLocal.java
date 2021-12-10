/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.AuxiliarMateriales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kubit
 */
@Local
public interface AuxiliarMaterialesFacadeLocal {

    void create(AuxiliarMateriales auxiliarMateriales);

    void edit(AuxiliarMateriales auxiliarMateriales);

    void remove(AuxiliarMateriales auxiliarMateriales);

    AuxiliarMateriales find(Object id);

    List<AuxiliarMateriales> findAll();

    List<AuxiliarMateriales> findRange(int[] range);

    int count();
    
}

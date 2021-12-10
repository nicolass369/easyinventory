/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.MediosPago;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kubit
 */
@Local
public interface MediosPagoFacadeLocal {

    void create(MediosPago mediosPago);

    void edit(MediosPago mediosPago);

    void remove(MediosPago mediosPago);

    MediosPago find(Object id);

    List<MediosPago> findAll();

    List<MediosPago> findRange(int[] range);

    int count();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.Bodegas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kubit
 */
@Local
public interface BodegasFacadeLocal {

    void create(Bodegas bodegas);

    void edit(Bodegas bodegas);

    void remove(Bodegas bodegas);

    Bodegas find(Object id);

    List<Bodegas> findAll();

    List<Bodegas> findRange(int[] range);

    int count();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.Materiales;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kubit
 */
@Local
public interface MaterialesFacadeLocal {

    void create(Materiales materiales);

    void edit(Materiales materiales);

    void remove(Materiales materiales);

    Materiales find(Object id);

    List<Materiales> findAll();

    List<Materiales> findRange(int[] range);

    int count();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.JefesEnsamblaje;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kubit
 */
@Local
public interface JefesEnsamblajeFacadeLocal {

    void create(JefesEnsamblaje jefesEnsamblaje);

    void edit(JefesEnsamblaje jefesEnsamblaje);

    void remove(JefesEnsamblaje jefesEnsamblaje);

    JefesEnsamblaje find(Object id);

    List<JefesEnsamblaje> findAll();

    List<JefesEnsamblaje> findRange(int[] range);

    int count();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.Contratos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kubit
 */
@Local
public interface ContratosFacadeLocal {

    void create(Contratos contratos);

    void edit(Contratos contratos);

    void remove(Contratos contratos);

    Contratos find(Object id);

    List<Contratos> findAll();

    List<Contratos> findRange(int[] range);

    int count();
    
}

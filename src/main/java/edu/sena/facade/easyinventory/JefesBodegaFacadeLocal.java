/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.JefesBodega;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kubit
 */
@Local
public interface JefesBodegaFacadeLocal {

    void create(JefesBodega jefesBodega);

    void edit(JefesBodega jefesBodega);

    void remove(JefesBodega jefesBodega);

    JefesBodega find(Object id);

    List<JefesBodega> findAll();

    List<JefesBodega> findRange(int[] range);

    int count();
    
}

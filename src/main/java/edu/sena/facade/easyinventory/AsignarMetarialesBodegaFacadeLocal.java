/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.AsignarMetarialesBodega;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kubit
 */
@Local
public interface AsignarMetarialesBodegaFacadeLocal {

    void create(AsignarMetarialesBodega asignarMetarialesBodega);

    void edit(AsignarMetarialesBodega asignarMetarialesBodega);

    void remove(AsignarMetarialesBodega asignarMetarialesBodega);

    AsignarMetarialesBodega find(Object id);

    List<AsignarMetarialesBodega> findAll();

    List<AsignarMetarialesBodega> findRange(int[] range);

    int count();
    
}

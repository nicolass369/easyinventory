/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.AsignarMaterialesTrabajos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kubit
 */
@Local
public interface AsignarMaterialesTrabajosFacadeLocal {

    void create(AsignarMaterialesTrabajos asignarMaterialesTrabajos);

    void edit(AsignarMaterialesTrabajos asignarMaterialesTrabajos);

    void remove(AsignarMaterialesTrabajos asignarMaterialesTrabajos);

    AsignarMaterialesTrabajos find(Object id);

    List<AsignarMaterialesTrabajos> findAll();

    List<AsignarMaterialesTrabajos> findRange(int[] range);

    int count();
    
}

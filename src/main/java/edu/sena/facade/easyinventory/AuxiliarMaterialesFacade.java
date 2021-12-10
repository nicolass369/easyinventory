/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.AuxiliarMateriales;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kubit
 */
@Stateless
public class AuxiliarMaterialesFacade extends AbstractFacade<AuxiliarMateriales> implements AuxiliarMaterialesFacadeLocal {

    @PersistenceContext(unitName = "up_easyinventory")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AuxiliarMaterialesFacade() {
        super(AuxiliarMateriales.class);
    }
    
}

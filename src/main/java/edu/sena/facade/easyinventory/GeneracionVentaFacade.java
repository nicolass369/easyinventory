/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.GeneracionVenta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kubit
 */
@Stateless
public class GeneracionVentaFacade extends AbstractFacade<GeneracionVenta> implements GeneracionVentaFacadeLocal {

    @PersistenceContext(unitName = "up_easyinventory")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GeneracionVentaFacade() {
        super(GeneracionVenta.class);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.facade.easyinventory;

import edu.sena.entity.easyinventory.Usuarios;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Kubit
 */
@Stateless
public class UsuariosFacade extends AbstractFacade<Usuarios> implements UsuariosFacadeLocal {

    @PersistenceContext(unitName = "up_easyinventory")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuariosFacade() {
        super(Usuarios.class);
    }
    
    @Override
    public List<Usuarios> verUsu(){
        em.getEntityManagerFactory().getCache().evictAll();
        Query pru=em.createQuery("SELECT c FROM Usuarios c");
        return pru.getResultList();
    }
    
    @Override
    public Usuarios inicioSesion(String usuarioIn, String claveIn){
        try {
            Query in=em.createQuery("SELECT u FROM Usuarios u WHERE u.nomUsuario = :usuarioIn AND u.contraseña = :claveIn");
            in.setParameter("usuarioIn", usuarioIn);
            in.setParameter("claveIn", claveIn);
            return (Usuarios) in.getSingleResult();
        } catch (Exception e) {
            return null;
        }
        
    }
    
}

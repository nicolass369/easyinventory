/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.controller.easyinventory;

import edu.sena.entity.easyinventory.Administradores;
import edu.sena.facade.easyinventory.AdministradoresFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Kubit
 */
@Named(value = "administradoresSession")
@SessionScoped
public class AdministradoresSession implements Serializable {
    @EJB
    AdministradoresFacadeLocal administradoresFacadeLocal;
    /**
     * Creates a new instance of UsuarioSession
     */
    public AdministradoresSession() {
    }
    
    public List<Administradores> leerTodo(){
        return administradoresFacadeLocal.findAll();
        
    }
}

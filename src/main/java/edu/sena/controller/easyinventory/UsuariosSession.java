/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.controller.easyinventory;

import edu.sena.entity.easyinventory.Usuarios;
import edu.sena.facade.easyinventory.UsuariosFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Kubit
 */
@Named(value = "usuariosSession")
@SessionScoped
public class UsuariosSession implements Serializable {
    
    @EJB
    UsuariosFacadeLocal usuariosFacadeLocal;

    /**
     * Creates a new instance of UsuariosSession
     */
    public UsuariosSession() {
    }
    
    public List<Usuarios> verUsu(){
        return usuariosFacadeLocal.verUsu();
    }
}

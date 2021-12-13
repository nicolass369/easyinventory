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
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

/**
 *
 * @author Kubit
 */
@Named(value = "usuariosSession")
@SessionScoped
public class UsuariosSession implements Serializable {
    
    @EJB
    UsuariosFacadeLocal usuariosFacadeLocal;
    @EJB
    private Usuarios usuLogin = new Usuarios();
    private String usuarioIn = "";
    private String claveIn = "";

    /**
     * Creates a new instance of UsuariosSession
     */
    public UsuariosSession() {
    }
    
    public List<Usuarios> verUsu(){
        return usuariosFacadeLocal.verUsu();
    }
    
    public void validarUsuario(){
        try {
            usuLogin = usuariosFacadeLocal.inicioSesion(usuarioIn, claveIn);
            if(usuLogin != null){
                FacesContext fc = FacesContext.getCurrentInstance();
                fc.getExternalContext().redirect("../index.xhtml");
            }else{
                PrimeFaces.current().executeScript("alert('No se ha encontrado el usuario')");
            }
        } catch (Exception e) {
        }
    }

    public String getUsuarioIn() {
        return usuarioIn;
    }

    public void setUsuarioIn(String usuarioIn) {
        this.usuarioIn = usuarioIn;
    }

    public String getClaveIn() {
        return claveIn;
    }

    public void setClaveIn(String claveIn) {
        this.claveIn = claveIn;
    }

    public Usuarios getUsuLogin() {
        return usuLogin;
    }

    public void setUsuLogin(Usuarios usuLogin) {
        this.usuLogin = usuLogin;
    }
}

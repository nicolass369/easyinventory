/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.entity.easyinventory;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Kubit
 */
@Entity
@Table(name = "administradores")
@NamedQueries({
    @NamedQuery(name = "Administradores.findAll", query = "SELECT a FROM Administradores a")})
public class Administradores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Administrador")
    private Integer idAdministrador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAdministrador", fetch = FetchType.LAZY)
    private Collection<GeneracionVenta> generacionVentaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAdministrador", fetch = FetchType.LAZY)
    private Collection<PedidosAdministrador> pedidosAdministradorCollection;
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empleados idUsuario;

    public Administradores() {
    }

    public Administradores(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Integer getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Integer idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Collection<GeneracionVenta> getGeneracionVentaCollection() {
        return generacionVentaCollection;
    }

    public void setGeneracionVentaCollection(Collection<GeneracionVenta> generacionVentaCollection) {
        this.generacionVentaCollection = generacionVentaCollection;
    }

    public Collection<PedidosAdministrador> getPedidosAdministradorCollection() {
        return pedidosAdministradorCollection;
    }

    public void setPedidosAdministradorCollection(Collection<PedidosAdministrador> pedidosAdministradorCollection) {
        this.pedidosAdministradorCollection = pedidosAdministradorCollection;
    }

    public Empleados getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Empleados idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdministrador != null ? idAdministrador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administradores)) {
            return false;
        }
        Administradores other = (Administradores) object;
        if ((this.idAdministrador == null && other.idAdministrador != null) || (this.idAdministrador != null && !this.idAdministrador.equals(other.idAdministrador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.Administradores[ idAdministrador=" + idAdministrador + " ]";
    }
    
}

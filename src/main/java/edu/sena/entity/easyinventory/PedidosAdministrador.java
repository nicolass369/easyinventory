/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.entity.easyinventory;

import java.io.Serializable;
import javax.persistence.Basic;
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
import javax.persistence.Table;

/**
 *
 * @author Kubit
 */
@Entity
@Table(name = "pedidos_administrador")
@NamedQueries({
    @NamedQuery(name = "PedidosAdministrador.findAll", query = "SELECT p FROM PedidosAdministrador p")})
public class PedidosAdministrador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Asignacion")
    private Integer idAsignacion;
    @JoinColumn(name = "Id_Administrador", referencedColumnName = "Id_Administrador")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Administradores idAdministrador;
    @JoinColumn(name = "Id_Pedido", referencedColumnName = "Id_Pedido")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pedidos idPedido;

    public PedidosAdministrador() {
    }

    public PedidosAdministrador(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public Integer getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public Administradores getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Administradores idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Pedidos getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedidos idPedido) {
        this.idPedido = idPedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsignacion != null ? idAsignacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidosAdministrador)) {
            return false;
        }
        PedidosAdministrador other = (PedidosAdministrador) object;
        if ((this.idAsignacion == null && other.idAsignacion != null) || (this.idAsignacion != null && !this.idAsignacion.equals(other.idAsignacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.PedidosAdministrador[ idAsignacion=" + idAsignacion + " ]";
    }
    
}

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
@Table(name = "generacion_venta")
@NamedQueries({
    @NamedQuery(name = "GeneracionVenta.findAll", query = "SELECT g FROM GeneracionVenta g")})
public class GeneracionVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Generacion")
    private Integer idGeneracion;
    @JoinColumn(name = "Id_Administrador", referencedColumnName = "Id_Administrador")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Administradores idAdministrador;
    @JoinColumn(name = "Id_Venta", referencedColumnName = "Id_Venta")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ventas idVenta;

    public GeneracionVenta() {
    }

    public GeneracionVenta(Integer idGeneracion) {
        this.idGeneracion = idGeneracion;
    }

    public Integer getIdGeneracion() {
        return idGeneracion;
    }

    public void setIdGeneracion(Integer idGeneracion) {
        this.idGeneracion = idGeneracion;
    }

    public Administradores getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Administradores idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public Ventas getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Ventas idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGeneracion != null ? idGeneracion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeneracionVenta)) {
            return false;
        }
        GeneracionVenta other = (GeneracionVenta) object;
        if ((this.idGeneracion == null && other.idGeneracion != null) || (this.idGeneracion != null && !this.idGeneracion.equals(other.idGeneracion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.GeneracionVenta[ idGeneracion=" + idGeneracion + " ]";
    }
    
}

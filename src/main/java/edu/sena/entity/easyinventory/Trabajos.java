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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Kubit
 */
@Entity
@Table(name = "trabajos")
@NamedQueries({
    @NamedQuery(name = "Trabajos.findAll", query = "SELECT t FROM Trabajos t")})
public class Trabajos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Trabajo")
    private Integer idTrabajo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Estado_Trabajo")
    private String estadoTrabajo;
    @JoinColumn(name = "Id_Bodega", referencedColumnName = "Id_Bodega")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Bodegas idBodega;
    @JoinColumn(name = "Id_Orden", referencedColumnName = "Id_Orden")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OrdenesTrabajo idOrden;

    public Trabajos() {
    }

    public Trabajos(Integer idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public Trabajos(Integer idTrabajo, String estadoTrabajo) {
        this.idTrabajo = idTrabajo;
        this.estadoTrabajo = estadoTrabajo;
    }

    public Integer getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(Integer idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public String getEstadoTrabajo() {
        return estadoTrabajo;
    }

    public void setEstadoTrabajo(String estadoTrabajo) {
        this.estadoTrabajo = estadoTrabajo;
    }

    public Bodegas getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(Bodegas idBodega) {
        this.idBodega = idBodega;
    }

    public OrdenesTrabajo getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(OrdenesTrabajo idOrden) {
        this.idOrden = idOrden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTrabajo != null ? idTrabajo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajos)) {
            return false;
        }
        Trabajos other = (Trabajos) object;
        if ((this.idTrabajo == null && other.idTrabajo != null) || (this.idTrabajo != null && !this.idTrabajo.equals(other.idTrabajo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.Trabajos[ idTrabajo=" + idTrabajo + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.entity.easyinventory;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Kubit
 */
@Entity
@Table(name = "ordenes_trabajo")
@NamedQueries({
    @NamedQuery(name = "OrdenesTrabajo.findAll", query = "SELECT o FROM OrdenesTrabajo o")})
public class OrdenesTrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Orden")
    private Integer idOrden;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Materiales_Usar")
    private String materialesUsar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrden", fetch = FetchType.LAZY)
    private Collection<Trabajos> trabajosCollection;
    @JoinColumn(name = "Id_Venta", referencedColumnName = "Id_Venta")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ventas idVenta;

    public OrdenesTrabajo() {
    }

    public OrdenesTrabajo(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public OrdenesTrabajo(Integer idOrden, String materialesUsar, Date fechaEntrega) {
        this.idOrden = idOrden;
        this.materialesUsar = materialesUsar;
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public String getMaterialesUsar() {
        return materialesUsar;
    }

    public void setMaterialesUsar(String materialesUsar) {
        this.materialesUsar = materialesUsar;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Collection<Trabajos> getTrabajosCollection() {
        return trabajosCollection;
    }

    public void setTrabajosCollection(Collection<Trabajos> trabajosCollection) {
        this.trabajosCollection = trabajosCollection;
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
        hash += (idOrden != null ? idOrden.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenesTrabajo)) {
            return false;
        }
        OrdenesTrabajo other = (OrdenesTrabajo) object;
        if ((this.idOrden == null && other.idOrden != null) || (this.idOrden != null && !this.idOrden.equals(other.idOrden))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.OrdenesTrabajo[ idOrden=" + idOrden + " ]";
    }
    
}

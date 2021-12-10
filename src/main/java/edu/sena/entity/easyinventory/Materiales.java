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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Kubit
 */
@Entity
@Table(name = "materiales")
@NamedQueries({
    @NamedQuery(name = "Materiales.findAll", query = "SELECT m FROM Materiales m")})
public class Materiales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Materiales")
    private Integer idMateriales;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "Nom_Materiales")
    private String nomMateriales;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Tipo_Material")
    private String tipoMaterial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Dimensiones")
    private String dimensiones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMeteriales", fetch = FetchType.LAZY)
    private Collection<AsignarMetarialesBodega> asignarMetarialesBodegaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMateriales", fetch = FetchType.LAZY)
    private Collection<Bodegas> bodegasCollection;

    public Materiales() {
    }

    public Materiales(Integer idMateriales) {
        this.idMateriales = idMateriales;
    }

    public Materiales(Integer idMateriales, String nomMateriales, int cantidad, String tipoMaterial, String dimensiones) {
        this.idMateriales = idMateriales;
        this.nomMateriales = nomMateriales;
        this.cantidad = cantidad;
        this.tipoMaterial = tipoMaterial;
        this.dimensiones = dimensiones;
    }

    public Integer getIdMateriales() {
        return idMateriales;
    }

    public void setIdMateriales(Integer idMateriales) {
        this.idMateriales = idMateriales;
    }

    public String getNomMateriales() {
        return nomMateriales;
    }

    public void setNomMateriales(String nomMateriales) {
        this.nomMateriales = nomMateriales;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Collection<AsignarMetarialesBodega> getAsignarMetarialesBodegaCollection() {
        return asignarMetarialesBodegaCollection;
    }

    public void setAsignarMetarialesBodegaCollection(Collection<AsignarMetarialesBodega> asignarMetarialesBodegaCollection) {
        this.asignarMetarialesBodegaCollection = asignarMetarialesBodegaCollection;
    }

    public Collection<Bodegas> getBodegasCollection() {
        return bodegasCollection;
    }

    public void setBodegasCollection(Collection<Bodegas> bodegasCollection) {
        this.bodegasCollection = bodegasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateriales != null ? idMateriales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materiales)) {
            return false;
        }
        Materiales other = (Materiales) object;
        if ((this.idMateriales == null && other.idMateriales != null) || (this.idMateriales != null && !this.idMateriales.equals(other.idMateriales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.Materiales[ idMateriales=" + idMateriales + " ]";
    }
    
}

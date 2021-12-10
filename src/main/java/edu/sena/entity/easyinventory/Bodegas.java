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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Kubit
 */
@Entity
@Table(name = "bodegas")
@NamedQueries({
    @NamedQuery(name = "Bodegas.findAll", query = "SELECT b FROM Bodegas b")})
public class Bodegas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Bodega")
    private Integer idBodega;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Nombre_Bod")
    private String nombreBod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Stock")
    private long stock;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idBodega", fetch = FetchType.LAZY)
    private Collection<Trabajos> trabajosCollection;
    @JoinColumn(name = "Id_Jefe_Bod", referencedColumnName = "Id_Jefe_Bod")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private JefesBodega idJefeBod;
    @JoinColumn(name = "Id_Materiales", referencedColumnName = "Id_Materiales")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Materiales idMateriales;

    public Bodegas() {
    }

    public Bodegas(Integer idBodega) {
        this.idBodega = idBodega;
    }

    public Bodegas(Integer idBodega, String nombreBod, String direccion, long stock) {
        this.idBodega = idBodega;
        this.nombreBod = nombreBod;
        this.direccion = direccion;
        this.stock = stock;
    }

    public Integer getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(Integer idBodega) {
        this.idBodega = idBodega;
    }

    public String getNombreBod() {
        return nombreBod;
    }

    public void setNombreBod(String nombreBod) {
        this.nombreBod = nombreBod;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public Collection<Trabajos> getTrabajosCollection() {
        return trabajosCollection;
    }

    public void setTrabajosCollection(Collection<Trabajos> trabajosCollection) {
        this.trabajosCollection = trabajosCollection;
    }

    public JefesBodega getIdJefeBod() {
        return idJefeBod;
    }

    public void setIdJefeBod(JefesBodega idJefeBod) {
        this.idJefeBod = idJefeBod;
    }

    public Materiales getIdMateriales() {
        return idMateriales;
    }

    public void setIdMateriales(Materiales idMateriales) {
        this.idMateriales = idMateriales;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBodega != null ? idBodega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bodegas)) {
            return false;
        }
        Bodegas other = (Bodegas) object;
        if ((this.idBodega == null && other.idBodega != null) || (this.idBodega != null && !this.idBodega.equals(other.idBodega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.Bodegas[ idBodega=" + idBodega + " ]";
    }
    
}

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
@Table(name = "oferta_materiales")
@NamedQueries({
    @NamedQuery(name = "OfertaMateriales.findAll", query = "SELECT o FROM OfertaMateriales o")})
public class OfertaMateriales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Oferta")
    private Integer idOferta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Valor_Oferta")
    private int valorOferta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Lista_Materiales")
    private String listaMateriales;
    @JoinColumn(name = "Id_Auxiliar", referencedColumnName = "Id_Auxiliar")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private AuxiliarMateriales idAuxiliar;
    @JoinColumn(name = "Id_Proveedor", referencedColumnName = "Id_Proveedor")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Proveedores idProveedor;

    public OfertaMateriales() {
    }

    public OfertaMateriales(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public OfertaMateriales(Integer idOferta, int valorOferta, String listaMateriales) {
        this.idOferta = idOferta;
        this.valorOferta = valorOferta;
        this.listaMateriales = listaMateriales;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public int getValorOferta() {
        return valorOferta;
    }

    public void setValorOferta(int valorOferta) {
        this.valorOferta = valorOferta;
    }

    public String getListaMateriales() {
        return listaMateriales;
    }

    public void setListaMateriales(String listaMateriales) {
        this.listaMateriales = listaMateriales;
    }

    public AuxiliarMateriales getIdAuxiliar() {
        return idAuxiliar;
    }

    public void setIdAuxiliar(AuxiliarMateriales idAuxiliar) {
        this.idAuxiliar = idAuxiliar;
    }

    public Proveedores getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedores idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOferta != null ? idOferta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OfertaMateriales)) {
            return false;
        }
        OfertaMateriales other = (OfertaMateriales) object;
        if ((this.idOferta == null && other.idOferta != null) || (this.idOferta != null && !this.idOferta.equals(other.idOferta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.OfertaMateriales[ idOferta=" + idOferta + " ]";
    }
    
}

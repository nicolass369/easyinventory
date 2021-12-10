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

/**
 *
 * @author Kubit
 */
@Entity
@Table(name = "auxiliar_materiales")
@NamedQueries({
    @NamedQuery(name = "AuxiliarMateriales.findAll", query = "SELECT a FROM AuxiliarMateriales a")})
public class AuxiliarMateriales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Auxiliar")
    private Integer idAuxiliar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Oferta")
    private int idOferta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAuxiliar", fetch = FetchType.LAZY)
    private Collection<AsignarMetarialesBodega> asignarMetarialesBodegaCollection;
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empleados idUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAuxiliar", fetch = FetchType.LAZY)
    private Collection<OfertaMateriales> ofertaMaterialesCollection;

    public AuxiliarMateriales() {
    }

    public AuxiliarMateriales(Integer idAuxiliar) {
        this.idAuxiliar = idAuxiliar;
    }

    public AuxiliarMateriales(Integer idAuxiliar, int idOferta) {
        this.idAuxiliar = idAuxiliar;
        this.idOferta = idOferta;
    }

    public Integer getIdAuxiliar() {
        return idAuxiliar;
    }

    public void setIdAuxiliar(Integer idAuxiliar) {
        this.idAuxiliar = idAuxiliar;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public Collection<AsignarMetarialesBodega> getAsignarMetarialesBodegaCollection() {
        return asignarMetarialesBodegaCollection;
    }

    public void setAsignarMetarialesBodegaCollection(Collection<AsignarMetarialesBodega> asignarMetarialesBodegaCollection) {
        this.asignarMetarialesBodegaCollection = asignarMetarialesBodegaCollection;
    }

    public Empleados getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Empleados idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Collection<OfertaMateriales> getOfertaMaterialesCollection() {
        return ofertaMaterialesCollection;
    }

    public void setOfertaMaterialesCollection(Collection<OfertaMateriales> ofertaMaterialesCollection) {
        this.ofertaMaterialesCollection = ofertaMaterialesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAuxiliar != null ? idAuxiliar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AuxiliarMateriales)) {
            return false;
        }
        AuxiliarMateriales other = (AuxiliarMateriales) object;
        if ((this.idAuxiliar == null && other.idAuxiliar != null) || (this.idAuxiliar != null && !this.idAuxiliar.equals(other.idAuxiliar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.AuxiliarMateriales[ idAuxiliar=" + idAuxiliar + " ]";
    }
    
}

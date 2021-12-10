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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Kubit
 */
@Entity
@Table(name = "asignar_metariales_bodega")
@NamedQueries({
    @NamedQuery(name = "AsignarMetarialesBodega.findAll", query = "SELECT a FROM AsignarMetarialesBodega a")})
public class AsignarMetarialesBodega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Materiales_Bod")
    private Integer idMaterialesBod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Bodega")
    private int idBodega;
    @JoinColumn(name = "Id_Auxiliar", referencedColumnName = "Id_Auxiliar")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private AuxiliarMateriales idAuxiliar;
    @JoinColumn(name = "Id_Meteriales", referencedColumnName = "Id_Materiales")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Materiales idMeteriales;

    public AsignarMetarialesBodega() {
    }

    public AsignarMetarialesBodega(Integer idMaterialesBod) {
        this.idMaterialesBod = idMaterialesBod;
    }

    public AsignarMetarialesBodega(Integer idMaterialesBod, int idBodega) {
        this.idMaterialesBod = idMaterialesBod;
        this.idBodega = idBodega;
    }

    public Integer getIdMaterialesBod() {
        return idMaterialesBod;
    }

    public void setIdMaterialesBod(Integer idMaterialesBod) {
        this.idMaterialesBod = idMaterialesBod;
    }

    public int getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(int idBodega) {
        this.idBodega = idBodega;
    }

    public AuxiliarMateriales getIdAuxiliar() {
        return idAuxiliar;
    }

    public void setIdAuxiliar(AuxiliarMateriales idAuxiliar) {
        this.idAuxiliar = idAuxiliar;
    }

    public Materiales getIdMeteriales() {
        return idMeteriales;
    }

    public void setIdMeteriales(Materiales idMeteriales) {
        this.idMeteriales = idMeteriales;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMaterialesBod != null ? idMaterialesBod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsignarMetarialesBodega)) {
            return false;
        }
        AsignarMetarialesBodega other = (AsignarMetarialesBodega) object;
        if ((this.idMaterialesBod == null && other.idMaterialesBod != null) || (this.idMaterialesBod != null && !this.idMaterialesBod.equals(other.idMaterialesBod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.AsignarMetarialesBodega[ idMaterialesBod=" + idMaterialesBod + " ]";
    }
    
}

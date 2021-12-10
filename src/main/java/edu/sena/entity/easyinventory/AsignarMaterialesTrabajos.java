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

/**
 *
 * @author Kubit
 */
@Entity
@Table(name = "asignar_materiales_trabajos")
@NamedQueries({
    @NamedQuery(name = "AsignarMaterialesTrabajos.findAll", query = "SELECT a FROM AsignarMaterialesTrabajos a")})
public class AsignarMaterialesTrabajos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Materiales_Bod")
    private Integer idMaterialesBod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Auxiliar")
    private int idAuxiliar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Bodega")
    private int idBodega;
    @JoinColumn(name = "Id_Jefe_Bod", referencedColumnName = "Id_Jefe_Bod")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private JefesBodega idJefeBod;
    @JoinColumn(name = "Id_Jefe_Ens", referencedColumnName = "Id_Jefe_Ens")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private JefesEnsamblaje idJefeEns;

    public AsignarMaterialesTrabajos() {
    }

    public AsignarMaterialesTrabajos(Integer idMaterialesBod) {
        this.idMaterialesBod = idMaterialesBod;
    }

    public AsignarMaterialesTrabajos(Integer idMaterialesBod, int idAuxiliar, int idBodega) {
        this.idMaterialesBod = idMaterialesBod;
        this.idAuxiliar = idAuxiliar;
        this.idBodega = idBodega;
    }

    public Integer getIdMaterialesBod() {
        return idMaterialesBod;
    }

    public void setIdMaterialesBod(Integer idMaterialesBod) {
        this.idMaterialesBod = idMaterialesBod;
    }

    public int getIdAuxiliar() {
        return idAuxiliar;
    }

    public void setIdAuxiliar(int idAuxiliar) {
        this.idAuxiliar = idAuxiliar;
    }

    public int getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(int idBodega) {
        this.idBodega = idBodega;
    }

    public JefesBodega getIdJefeBod() {
        return idJefeBod;
    }

    public void setIdJefeBod(JefesBodega idJefeBod) {
        this.idJefeBod = idJefeBod;
    }

    public JefesEnsamblaje getIdJefeEns() {
        return idJefeEns;
    }

    public void setIdJefeEns(JefesEnsamblaje idJefeEns) {
        this.idJefeEns = idJefeEns;
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
        if (!(object instanceof AsignarMaterialesTrabajos)) {
            return false;
        }
        AsignarMaterialesTrabajos other = (AsignarMaterialesTrabajos) object;
        if ((this.idMaterialesBod == null && other.idMaterialesBod != null) || (this.idMaterialesBod != null && !this.idMaterialesBod.equals(other.idMaterialesBod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.AsignarMaterialesTrabajos[ idMaterialesBod=" + idMaterialesBod + " ]";
    }
    
}

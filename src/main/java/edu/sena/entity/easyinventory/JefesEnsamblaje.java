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

/**
 *
 * @author Kubit
 */
@Entity
@Table(name = "jefes_ensamblaje")
@NamedQueries({
    @NamedQuery(name = "JefesEnsamblaje.findAll", query = "SELECT j FROM JefesEnsamblaje j")})
public class JefesEnsamblaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Jefe_Ens")
    private Integer idJefeEns;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJefeEns", fetch = FetchType.LAZY)
    private Collection<AsignarMaterialesTrabajos> asignarMaterialesTrabajosCollection;
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empleados idUsuario;

    public JefesEnsamblaje() {
    }

    public JefesEnsamblaje(Integer idJefeEns) {
        this.idJefeEns = idJefeEns;
    }

    public Integer getIdJefeEns() {
        return idJefeEns;
    }

    public void setIdJefeEns(Integer idJefeEns) {
        this.idJefeEns = idJefeEns;
    }

    public Collection<AsignarMaterialesTrabajos> getAsignarMaterialesTrabajosCollection() {
        return asignarMaterialesTrabajosCollection;
    }

    public void setAsignarMaterialesTrabajosCollection(Collection<AsignarMaterialesTrabajos> asignarMaterialesTrabajosCollection) {
        this.asignarMaterialesTrabajosCollection = asignarMaterialesTrabajosCollection;
    }

    public Empleados getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Empleados idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJefeEns != null ? idJefeEns.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JefesEnsamblaje)) {
            return false;
        }
        JefesEnsamblaje other = (JefesEnsamblaje) object;
        if ((this.idJefeEns == null && other.idJefeEns != null) || (this.idJefeEns != null && !this.idJefeEns.equals(other.idJefeEns))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.JefesEnsamblaje[ idJefeEns=" + idJefeEns + " ]";
    }
    
}

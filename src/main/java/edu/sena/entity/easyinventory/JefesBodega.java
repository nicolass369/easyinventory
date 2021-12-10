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
@Table(name = "jefes_bodega")
@NamedQueries({
    @NamedQuery(name = "JefesBodega.findAll", query = "SELECT j FROM JefesBodega j")})
public class JefesBodega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Jefe_Bod")
    private Integer idJefeBod;
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Empleados idUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJefeBod", fetch = FetchType.LAZY)
    private Collection<AsignarMaterialesTrabajos> asignarMaterialesTrabajosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJefeBod", fetch = FetchType.LAZY)
    private Collection<Bodegas> bodegasCollection;

    public JefesBodega() {
    }

    public JefesBodega(Integer idJefeBod) {
        this.idJefeBod = idJefeBod;
    }

    public Integer getIdJefeBod() {
        return idJefeBod;
    }

    public void setIdJefeBod(Integer idJefeBod) {
        this.idJefeBod = idJefeBod;
    }

    public Empleados getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Empleados idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Collection<AsignarMaterialesTrabajos> getAsignarMaterialesTrabajosCollection() {
        return asignarMaterialesTrabajosCollection;
    }

    public void setAsignarMaterialesTrabajosCollection(Collection<AsignarMaterialesTrabajos> asignarMaterialesTrabajosCollection) {
        this.asignarMaterialesTrabajosCollection = asignarMaterialesTrabajosCollection;
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
        hash += (idJefeBod != null ? idJefeBod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JefesBodega)) {
            return false;
        }
        JefesBodega other = (JefesBodega) object;
        if ((this.idJefeBod == null && other.idJefeBod != null) || (this.idJefeBod != null && !this.idJefeBod.equals(other.idJefeBod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.JefesBodega[ idJefeBod=" + idJefeBod + " ]";
    }
    
}

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
@Table(name = "empleados")
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Empleado")
    private Integer idEmpleado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private Collection<AuxiliarMateriales> auxiliarMaterialesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private Collection<JefesBodega> jefesBodegaCollection;
    @JoinColumn(name = "Id_Contrato", referencedColumnName = "Id_Contrato")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Contratos idContrato;
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Rol idUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private Collection<JefesEnsamblaje> jefesEnsamblajeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private Collection<Administradores> administradoresCollection;

    public Empleados() {
    }

    public Empleados(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Collection<AuxiliarMateriales> getAuxiliarMaterialesCollection() {
        return auxiliarMaterialesCollection;
    }

    public void setAuxiliarMaterialesCollection(Collection<AuxiliarMateriales> auxiliarMaterialesCollection) {
        this.auxiliarMaterialesCollection = auxiliarMaterialesCollection;
    }

    public Collection<JefesBodega> getJefesBodegaCollection() {
        return jefesBodegaCollection;
    }

    public void setJefesBodegaCollection(Collection<JefesBodega> jefesBodegaCollection) {
        this.jefesBodegaCollection = jefesBodegaCollection;
    }

    public Contratos getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Contratos idContrato) {
        this.idContrato = idContrato;
    }

    public Rol getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Rol idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Collection<JefesEnsamblaje> getJefesEnsamblajeCollection() {
        return jefesEnsamblajeCollection;
    }

    public void setJefesEnsamblajeCollection(Collection<JefesEnsamblaje> jefesEnsamblajeCollection) {
        this.jefesEnsamblajeCollection = jefesEnsamblajeCollection;
    }

    public Collection<Administradores> getAdministradoresCollection() {
        return administradoresCollection;
    }

    public void setAdministradoresCollection(Collection<Administradores> administradoresCollection) {
        this.administradoresCollection = administradoresCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleado != null ? idEmpleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.idEmpleado == null && other.idEmpleado != null) || (this.idEmpleado != null && !this.idEmpleado.equals(other.idEmpleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.Empleados[ idEmpleado=" + idEmpleado + " ]";
    }
    
}

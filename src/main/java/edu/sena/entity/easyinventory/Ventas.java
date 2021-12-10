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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Kubit
 */
@Entity
@Table(name = "ventas")
@NamedQueries({
    @NamedQuery(name = "Ventas.findAll", query = "SELECT v FROM Ventas v")})
public class Ventas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Venta")
    private Integer idVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Valor_Pago")
    private long valorPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Medio_Pago")
    private int idMedioPago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Pago")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVenta", fetch = FetchType.LAZY)
    private Collection<GeneracionVenta> generacionVentaCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ventas", fetch = FetchType.LAZY)
    private MediosPago mediosPago;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVenta", fetch = FetchType.LAZY)
    private Collection<OrdenesTrabajo> ordenesTrabajoCollection;
    @JoinColumn(name = "Id_Pedido", referencedColumnName = "Id_Pedido")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pedidos idPedido;

    public Ventas() {
    }

    public Ventas(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Ventas(Integer idVenta, long valorPago, Date fechaEntrega, int idMedioPago, Date fechaPago) {
        this.idVenta = idVenta;
        this.valorPago = valorPago;
        this.fechaEntrega = fechaEntrega;
        this.idMedioPago = idMedioPago;
        this.fechaPago = fechaPago;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public long getValorPago() {
        return valorPago;
    }

    public void setValorPago(long valorPago) {
        this.valorPago = valorPago;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getIdMedioPago() {
        return idMedioPago;
    }

    public void setIdMedioPago(int idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Collection<GeneracionVenta> getGeneracionVentaCollection() {
        return generacionVentaCollection;
    }

    public void setGeneracionVentaCollection(Collection<GeneracionVenta> generacionVentaCollection) {
        this.generacionVentaCollection = generacionVentaCollection;
    }

    public MediosPago getMediosPago() {
        return mediosPago;
    }

    public void setMediosPago(MediosPago mediosPago) {
        this.mediosPago = mediosPago;
    }

    public Collection<OrdenesTrabajo> getOrdenesTrabajoCollection() {
        return ordenesTrabajoCollection;
    }

    public void setOrdenesTrabajoCollection(Collection<OrdenesTrabajo> ordenesTrabajoCollection) {
        this.ordenesTrabajoCollection = ordenesTrabajoCollection;
    }

    public Pedidos getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedidos idPedido) {
        this.idPedido = idPedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenta != null ? idVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ventas)) {
            return false;
        }
        Ventas other = (Ventas) object;
        if ((this.idVenta == null && other.idVenta != null) || (this.idVenta != null && !this.idVenta.equals(other.idVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.sena.ei_mapeo.Ventas[ idVenta=" + idVenta + " ]";
    }
    
}

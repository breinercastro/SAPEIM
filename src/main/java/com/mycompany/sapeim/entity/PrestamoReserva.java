/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sapeim.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "prestamo_reserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrestamoReserva.findAll", query = "SELECT p FROM PrestamoReserva p"),
    @NamedQuery(name = "PrestamoReserva.findByIdPresRes", query = "SELECT p FROM PrestamoReserva p WHERE p.idPresRes = :idPresRes"),
    @NamedQuery(name = "PrestamoReserva.findByFechaPresre", query = "SELECT p FROM PrestamoReserva p WHERE p.fechaPresre = :fechaPresre"),
    @NamedQuery(name = "PrestamoReserva.findByFechaEntrega", query = "SELECT p FROM PrestamoReserva p WHERE p.fechaEntrega = :fechaEntrega"),
    @NamedQuery(name = "PrestamoReserva.findByFechaDevolucion", query = "SELECT p FROM PrestamoReserva p WHERE p.fechaDevolucion = :fechaDevolucion")})
public class PrestamoReserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pres_res")
    private Integer idPresRes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_presre")
    @Temporal(TemporalType.DATE)
    private Date fechaPresre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_devolucion")
    @Temporal(TemporalType.DATE)
    private Date fechaDevolucion;
    @JoinTable(name = "detalle_prestamo", joinColumns = {
        @JoinColumn(name = "id_pres_res", referencedColumnName = "id_pres_res")}, inverseJoinColumns = {
        @JoinColumn(name = "id_equipos", referencedColumnName = "id_equipo")})
    @ManyToMany
    private List<Equipos> equiposList;
    @JoinColumn(name = "documento", referencedColumnName = "documento")
    @ManyToOne(optional = false)
    private Usuarios documento;

    public PrestamoReserva() {
    }

    public PrestamoReserva(Integer idPresRes) {
        this.idPresRes = idPresRes;
    }

    public PrestamoReserva(Integer idPresRes, Date fechaPresre, Date fechaEntrega, Date fechaDevolucion) {
        this.idPresRes = idPresRes;
        this.fechaPresre = fechaPresre;
        this.fechaEntrega = fechaEntrega;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getIdPresRes() {
        return idPresRes;
    }

    public void setIdPresRes(Integer idPresRes) {
        this.idPresRes = idPresRes;
    }

    public Date getFechaPresre() {
        return fechaPresre;
    }

    public void setFechaPresre(Date fechaPresre) {
        this.fechaPresre = fechaPresre;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @XmlTransient
    public List<Equipos> getEquiposList() {
        return equiposList;
    }

    public void setEquiposList(List<Equipos> equiposList) {
        this.equiposList = equiposList;
    }

    public Usuarios getDocumento() {
        return documento;
    }

    public void setDocumento(Usuarios documento) {
        this.documento = documento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPresRes != null ? idPresRes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrestamoReserva)) {
            return false;
        }
        PrestamoReserva other = (PrestamoReserva) object;
        if ((this.idPresRes == null && other.idPresRes != null) || (this.idPresRes != null && !this.idPresRes.equals(other.idPresRes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.sapeim.entity.PrestamoReserva[ idPresRes=" + idPresRes + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sapeim.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "equipos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipos.findAll", query = "SELECT e FROM Equipos e"),
    @NamedQuery(name = "Equipos.findByIdEquipo", query = "SELECT e FROM Equipos e WHERE e.idEquipo = :idEquipo"),
    @NamedQuery(name = "Equipos.findBySerial", query = "SELECT e FROM Equipos e WHERE e.serial = :serial")})
public class Equipos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_equipo")
    private Integer idEquipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "serial")
    private String serial;
    @ManyToMany(mappedBy = "equiposList")
    private List<PrestamoReserva> prestamoReservaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipo")
    private List<Novedades> novedadesList;
    @JoinColumn(name = "id_tipo_equip", referencedColumnName = "id_tipo_equipo")
    @ManyToOne(optional = false)
    private TipoEquipo idTipoEquip;
    @JoinColumn(name = "id_disponibilidad", referencedColumnName = "id_disponibilidad")
    @ManyToOne(optional = false)
    private Disponibilidad idDisponibilidad;
    @JoinColumn(name = "id_estado", referencedColumnName = "id_estado")
    @ManyToOne(optional = false)
    private EstadoEquipo idEstado;
    @JoinColumn(name = "id_marca", referencedColumnName = "id_marca")
    @ManyToOne(optional = false)
    private Marca idMarca;

    public Equipos() {
    }

    public Equipos(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Equipos(Integer idEquipo, String serial) {
        this.idEquipo = idEquipo;
        this.serial = serial;
    }

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @XmlTransient
    public List<PrestamoReserva> getPrestamoReservaList() {
        return prestamoReservaList;
    }

    public void setPrestamoReservaList(List<PrestamoReserva> prestamoReservaList) {
        this.prestamoReservaList = prestamoReservaList;
    }

    @XmlTransient
    public List<Novedades> getNovedadesList() {
        return novedadesList;
    }

    public void setNovedadesList(List<Novedades> novedadesList) {
        this.novedadesList = novedadesList;
    }

    public TipoEquipo getIdTipoEquip() {
        return idTipoEquip;
    }

    public void setIdTipoEquip(TipoEquipo idTipoEquip) {
        this.idTipoEquip = idTipoEquip;
    }

    public Disponibilidad getIdDisponibilidad() {
        return idDisponibilidad;
    }

    public void setIdDisponibilidad(Disponibilidad idDisponibilidad) {
        this.idDisponibilidad = idDisponibilidad;
    }

    public EstadoEquipo getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(EstadoEquipo idEstado) {
        this.idEstado = idEstado;
    }

    public Marca getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Marca idMarca) {
        this.idMarca = idMarca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipo != null ? idEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipos)) {
            return false;
        }
        Equipos other = (Equipos) object;
        if ((this.idEquipo == null && other.idEquipo != null) || (this.idEquipo != null && !this.idEquipo.equals(other.idEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.sapeim.entity.Equipos[ idEquipo=" + idEquipo + " ]";
    }
    
}

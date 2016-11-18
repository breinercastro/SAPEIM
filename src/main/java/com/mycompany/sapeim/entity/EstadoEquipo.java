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
@Table(name = "estado_equipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoEquipo.findAll", query = "SELECT e FROM EstadoEquipo e"),
    @NamedQuery(name = "EstadoEquipo.findByIdEstado", query = "SELECT e FROM EstadoEquipo e WHERE e.idEstado = :idEstado"),
    @NamedQuery(name = "EstadoEquipo.findByDescEstado", query = "SELECT e FROM EstadoEquipo e WHERE e.descEstado = :descEstado")})
public class EstadoEquipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estado")
    private Integer idEstado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "desc_estado")
    private String descEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstado")
    private List<Equipos> equiposList;

    public EstadoEquipo() {
    }

    public EstadoEquipo(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public EstadoEquipo(Integer idEstado, String descEstado) {
        this.idEstado = idEstado;
        this.descEstado = descEstado;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescEstado() {
        return descEstado;
    }

    public void setDescEstado(String descEstado) {
        this.descEstado = descEstado;
    }

    @XmlTransient
    public List<Equipos> getEquiposList() {
        return equiposList;
    }

    public void setEquiposList(List<Equipos> equiposList) {
        this.equiposList = equiposList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstado != null ? idEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoEquipo)) {
            return false;
        }
        EstadoEquipo other = (EstadoEquipo) object;
        if ((this.idEstado == null && other.idEstado != null) || (this.idEstado != null && !this.idEstado.equals(other.idEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.sapeim.entity.EstadoEquipo[ idEstado=" + idEstado + " ]";
    }
    
}

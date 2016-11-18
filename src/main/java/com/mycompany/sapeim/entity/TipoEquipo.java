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
@Table(name = "tipo_equipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoEquipo.findAll", query = "SELECT t FROM TipoEquipo t"),
    @NamedQuery(name = "TipoEquipo.findByIdTipoEquipo", query = "SELECT t FROM TipoEquipo t WHERE t.idTipoEquipo = :idTipoEquipo"),
    @NamedQuery(name = "TipoEquipo.findByDescTipo", query = "SELECT t FROM TipoEquipo t WHERE t.descTipo = :descTipo")})
public class TipoEquipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_equipo")
    private Integer idTipoEquipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "desc_tipo")
    private String descTipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoEquip")
    private List<Equipos> equiposList;

    public TipoEquipo() {
    }

    public TipoEquipo(Integer idTipoEquipo) {
        this.idTipoEquipo = idTipoEquipo;
    }

    public TipoEquipo(Integer idTipoEquipo, String descTipo) {
        this.idTipoEquipo = idTipoEquipo;
        this.descTipo = descTipo;
    }

    public Integer getIdTipoEquipo() {
        return idTipoEquipo;
    }

    public void setIdTipoEquipo(Integer idTipoEquipo) {
        this.idTipoEquipo = idTipoEquipo;
    }

    public String getDescTipo() {
        return descTipo;
    }

    public void setDescTipo(String descTipo) {
        this.descTipo = descTipo;
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
        hash += (idTipoEquipo != null ? idTipoEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEquipo)) {
            return false;
        }
        TipoEquipo other = (TipoEquipo) object;
        if ((this.idTipoEquipo == null && other.idTipoEquipo != null) || (this.idTipoEquipo != null && !this.idTipoEquipo.equals(other.idTipoEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.sapeim.entity.TipoEquipo[ idTipoEquipo=" + idTipoEquipo + " ]";
    }
    
}

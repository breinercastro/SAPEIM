/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sapeim.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "novedades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Novedades.findAll", query = "SELECT n FROM Novedades n"),
    @NamedQuery(name = "Novedades.findByIdNovedad", query = "SELECT n FROM Novedades n WHERE n.idNovedad = :idNovedad"),
    @NamedQuery(name = "Novedades.findByDescNovedad", query = "SELECT n FROM Novedades n WHERE n.descNovedad = :descNovedad"),
    @NamedQuery(name = "Novedades.findByFechaNovedad", query = "SELECT n FROM Novedades n WHERE n.fechaNovedad = :fechaNovedad")})
public class Novedades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_novedad")
    private Integer idNovedad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "desc_novedad")
    private String descNovedad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_novedad")
    @Temporal(TemporalType.DATE)
    private Date fechaNovedad;
    @JoinColumn(name = "documento", referencedColumnName = "documento")
    @ManyToOne(optional = false)
    private Usuarios documento;
    @JoinColumn(name = "id_equipo", referencedColumnName = "id_equipo")
    @ManyToOne(optional = false)
    private Equipos idEquipo;

    public Novedades() {
    }

    public Novedades(Integer idNovedad) {
        this.idNovedad = idNovedad;
    }

    public Novedades(Integer idNovedad, String descNovedad, Date fechaNovedad) {
        this.idNovedad = idNovedad;
        this.descNovedad = descNovedad;
        this.fechaNovedad = fechaNovedad;
    }

    public Integer getIdNovedad() {
        return idNovedad;
    }

    public void setIdNovedad(Integer idNovedad) {
        this.idNovedad = idNovedad;
    }

    public String getDescNovedad() {
        return descNovedad;
    }

    public void setDescNovedad(String descNovedad) {
        this.descNovedad = descNovedad;
    }

    public Date getFechaNovedad() {
        return fechaNovedad;
    }

    public void setFechaNovedad(Date fechaNovedad) {
        this.fechaNovedad = fechaNovedad;
    }

    public Usuarios getDocumento() {
        return documento;
    }

    public void setDocumento(Usuarios documento) {
        this.documento = documento;
    }

    public Equipos getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Equipos idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNovedad != null ? idNovedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Novedades)) {
            return false;
        }
        Novedades other = (Novedades) object;
        if ((this.idNovedad == null && other.idNovedad != null) || (this.idNovedad != null && !this.idNovedad.equals(other.idNovedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.sapeim.entity.Novedades[ idNovedad=" + idNovedad + " ]";
    }
    
}

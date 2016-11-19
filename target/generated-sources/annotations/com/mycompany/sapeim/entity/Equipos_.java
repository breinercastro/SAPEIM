package com.mycompany.sapeim.entity;

import com.mycompany.sapeim.entity.Disponibilidad;
import com.mycompany.sapeim.entity.EstadoEquipo;
import com.mycompany.sapeim.entity.Marca;
import com.mycompany.sapeim.entity.Novedades;
import com.mycompany.sapeim.entity.PrestamoReserva;
import com.mycompany.sapeim.entity.TipoEquipo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-18T22:16:51")
@StaticMetamodel(Equipos.class)
public class Equipos_ { 

    public static volatile SingularAttribute<Equipos, Integer> idEquipo;
    public static volatile SingularAttribute<Equipos, EstadoEquipo> idEstado;
    public static volatile SingularAttribute<Equipos, TipoEquipo> idTipoEquip;
    public static volatile SingularAttribute<Equipos, String> serial;
    public static volatile ListAttribute<Equipos, Novedades> novedadesList;
    public static volatile ListAttribute<Equipos, PrestamoReserva> prestamoReservaList;
    public static volatile SingularAttribute<Equipos, Disponibilidad> idDisponibilidad;
    public static volatile SingularAttribute<Equipos, Marca> idMarca;

}
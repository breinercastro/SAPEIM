package com.mycompany.sapeim.entity;

import com.mycompany.sapeim.entity.Equipos;
import com.mycompany.sapeim.entity.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-18T22:16:51")
@StaticMetamodel(PrestamoReserva.class)
public class PrestamoReserva_ { 

    public static volatile SingularAttribute<PrestamoReserva, Date> fechaPresre;
    public static volatile SingularAttribute<PrestamoReserva, Integer> idPresRes;
    public static volatile SingularAttribute<PrestamoReserva, Date> fechaDevolucion;
    public static volatile ListAttribute<PrestamoReserva, Equipos> equiposList;
    public static volatile SingularAttribute<PrestamoReserva, Date> fechaEntrega;
    public static volatile SingularAttribute<PrestamoReserva, Usuarios> documento;

}
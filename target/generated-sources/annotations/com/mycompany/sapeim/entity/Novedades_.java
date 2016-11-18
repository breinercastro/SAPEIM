package com.mycompany.sapeim.entity;

import com.mycompany.sapeim.entity.Equipos;
import com.mycompany.sapeim.entity.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-18T11:22:20")
@StaticMetamodel(Novedades.class)
public class Novedades_ { 

    public static volatile SingularAttribute<Novedades, Equipos> idEquipo;
    public static volatile SingularAttribute<Novedades, Integer> idNovedad;
    public static volatile SingularAttribute<Novedades, String> descNovedad;
    public static volatile SingularAttribute<Novedades, Usuarios> documento;
    public static volatile SingularAttribute<Novedades, Date> fechaNovedad;

}
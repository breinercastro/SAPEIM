package com.mycompany.sapeim.entity;

import com.mycompany.sapeim.entity.Novedades;
import com.mycompany.sapeim.entity.PrestamoReserva;
import com.mycompany.sapeim.entity.Roles;
import com.mycompany.sapeim.entity.TipoDocumento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-18T22:16:51")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> clave;
    public static volatile SingularAttribute<Usuarios, Roles> idRol;
    public static volatile ListAttribute<Usuarios, Novedades> novedadesList;
    public static volatile SingularAttribute<Usuarios, String> apellido;
    public static volatile SingularAttribute<Usuarios, String> correo;
    public static volatile SingularAttribute<Usuarios, TipoDocumento> idTipoDocumento;
    public static volatile ListAttribute<Usuarios, PrestamoReserva> prestamoReservaList;
    public static volatile SingularAttribute<Usuarios, Integer> documento;
    public static volatile SingularAttribute<Usuarios, Integer> telefono;
    public static volatile SingularAttribute<Usuarios, String> nombre;

}
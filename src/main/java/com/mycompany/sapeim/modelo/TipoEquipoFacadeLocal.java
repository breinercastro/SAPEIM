/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sapeim.modelo;

import com.mycompany.sapeim.entity.TipoEquipo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface TipoEquipoFacadeLocal {

    void create(TipoEquipo tipoEquipo);

    void edit(TipoEquipo tipoEquipo);

    void remove(TipoEquipo tipoEquipo);

    TipoEquipo find(Object id);

    List<TipoEquipo> findAll();

    List<TipoEquipo> findRange(int[] range);

    int count();
    
}

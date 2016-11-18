/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sapeim.modelo;

import com.mycompany.sapeim.entity.PrestamoReserva;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface PrestamoReservaFacadeLocal {

    void create(PrestamoReserva prestamoReserva);

    void edit(PrestamoReserva prestamoReserva);

    void remove(PrestamoReserva prestamoReserva);

    PrestamoReserva find(Object id);

    List<PrestamoReserva> findAll();

    List<PrestamoReserva> findRange(int[] range);

    int count();
    
}

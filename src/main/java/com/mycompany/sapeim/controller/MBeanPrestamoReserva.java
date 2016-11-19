/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sapeim.controller;

import com.mycompany.sapeim.modelo.PrestamoReservaFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author André
 */
@Named(value = "mBeanPrestamoReserva")
@SessionScoped
public class MBeanPrestamoReserva implements Serializable {

    @EJB
    private PrestamoReservaFacadeLocal prestamoReservaFacade;
    
    /**
     * Creates a new instance of MBeanPrestamoReserva
     */
    public MBeanPrestamoReserva() {
    }
    
    @PostConstruct
    public void init(){
        
    }
    
}

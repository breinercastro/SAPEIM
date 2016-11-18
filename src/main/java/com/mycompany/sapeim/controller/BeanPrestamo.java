/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sapeim.controller;

import com.mycompany.sapeim.modelo.PrestamoReservaFacadeLocal;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Usuario
 */
@Named(value = "beanPrestamo")
@Dependent
public class BeanPrestamo {

    @EJB
    private PrestamoReservaFacadeLocal prestamoReservaFacade1;

    @EJB
    private PrestamoReservaFacadeLocal prestamoReservaFacade;

    /**
     * Creates a new instance of BeanPrestamo
     */
    public BeanPrestamo() {
    }
    @PostConstruct
    public void init(){
    }
}

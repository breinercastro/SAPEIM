/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sapeim.controller;

import com.mycompany.sapeim.entity.Equipos;
import com.mycompany.sapeim.modelo.EquiposFacadeLocal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Usuario
 */
@Named(value = "beanEquipos")
@Dependent
public class BeanEquipos {

    @EJB
    private EquiposFacadeLocal equiposFacade;
    /**
     * Creates a new instance of BeanEquipos
     */
    public BeanEquipos() {
    }

    @PostConstruct
    public void init() {
    }
}

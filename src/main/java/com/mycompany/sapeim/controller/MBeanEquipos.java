/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sapeim.controller;

import com.mycompany.sapeim.modelo.EquiposFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author André
 */
@Named(value = "mBeanEquipos")
@SessionScoped
public class MBeanEquipos implements Serializable {

    @EJB
    private EquiposFacadeLocal equiposFacade;
    
    /**
     * Creates a new instance of MBeanEquipos
     */
    public MBeanEquipos() {
    }
    
    @PostConstruct
    public void init(){
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sapeim.controller;

import com.mycompany.sapeim.modelo.UsuariosFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author André
 */
@Named(value = "mBeanUsuario")
@SessionScoped
public class MBeanUsuario implements Serializable {

    @EJB
    private UsuariosFacadeLocal usuariosFacade;
    
    /**
     * Creates a new instance of MBeanUsuario
     */
    public MBeanUsuario() {
    }
    
    @PostConstruct
    public void init(){
        
    }
    
}

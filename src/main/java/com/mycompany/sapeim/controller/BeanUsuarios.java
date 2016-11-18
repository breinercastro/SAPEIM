/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sapeim.controller;

import com.mycompany.sapeim.modelo.UsuariosFacadeLocal;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Usuario
 */
@Named(value = "beanUsuarios")
@Dependent
public class BeanUsuarios {

    @EJB
    private UsuariosFacadeLocal usuariosFacade;

   

    /**
     * Creates a new instance of BeanUsuarios
     */
    public BeanUsuarios() {
    }

    @PostConstruct
    public void init() {
    }
}

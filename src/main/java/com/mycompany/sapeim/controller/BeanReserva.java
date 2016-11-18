/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sapeim.controller;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Usuario
 */
@Named(value = "beanReserva")
@Dependent
public class BeanReserva {

    /**
     * Creates a new instance of BeanReserva
     */
    public BeanReserva() {
    }
    @PostConstruct
    public void init(){
    }
}

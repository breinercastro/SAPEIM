/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sapeim.modelo;

import com.mycompany.sapeim.entity.Equipos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
@Stateless
public class EquiposFacade extends AbstractFacade<Equipos> implements EquiposFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Sapeim_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EquiposFacade() {
        super(Equipos.class);
    }
    
}

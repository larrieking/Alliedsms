/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wordify;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author golan
 */
@Stateless
public class PersonGroupsFacade extends AbstractFacade<PersonGroups> {
    @PersistenceContext(unitName = "com.mycompany_Wordify_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonGroupsFacade() {
        super(PersonGroups.class);
    }
    
}

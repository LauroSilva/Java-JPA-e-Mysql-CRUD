/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mvc.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Again
 */
public class Persistence_Geral
{
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("appPU");
    
    public  Persistence_Geral(){}
    
    public EntityManagerFactory getEntityManagerFactory(){
        return this.emf;
    }
    
}

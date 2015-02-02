/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.strategy.common;


/**
 * @author Marharyta
 *
 */
public abstract class AbstractContext {
    
    private IStrategy strategy;
    
    public void setStrategy(IStrategy s) {
        this.strategy = s;
    }
    
    public String executeStrategy() {
        return strategy.execute();
    }
    
    public abstract String showInfo();
    
}

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
public class ConcreteContextA extends AbstractContext {

    public ConcreteContextA() {
        this.setStrategy(new StrategyImplA());
    }
    
    @Override
    public String showInfo() {
        return "I'm ConcreteContextA";
    }
    
}

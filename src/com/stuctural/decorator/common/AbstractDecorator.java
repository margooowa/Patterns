/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.stuctural.decorator.common;


/**
 * @author Marharyta
 *
 */
public abstract class AbstractDecorator implements IComponent {

    IComponent component;

    public AbstractDecorator(IComponent component) {
        this.component = component;
    }    
    
    @Override
    public void doOperation() {
        component.doOperation();
    }
    
    public abstract void newOperation();
}

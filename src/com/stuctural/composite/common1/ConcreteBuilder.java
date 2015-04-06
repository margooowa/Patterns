/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.stuctural.composite.common1;


public class ConcreteBuilder extends AbstractBuilder {

    @Override
    public void buildElement1() {
        product.setComponent1("e1");        
    }

    @Override
    public void buildElement2() {
        product.setComponent2("e2");
    }
    
    
    
}

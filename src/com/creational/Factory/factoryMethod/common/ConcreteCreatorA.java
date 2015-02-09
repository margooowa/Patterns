/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creational.Factory.factoryMethod.common;


public class ConcreteCreatorA extends AbstractCreator {

    @Override
    public IProduct factoryMethod() {
        return new ConcreteProductA();
    }
    
}

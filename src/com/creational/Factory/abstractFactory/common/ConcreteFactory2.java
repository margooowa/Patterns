/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creational.Factory.abstractFactory.common;


public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public IProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public IProductB createProductB() {
        return new ConcreteProductB1();
    }
    
}

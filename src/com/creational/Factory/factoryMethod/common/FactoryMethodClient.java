/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creational.Factory.factoryMethod.common;


public class FactoryMethodClient {
    
    public static void main(String[] args) {
        
        AbstractCreator [] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};
        
        for (AbstractCreator creator : creators) {
            IProduct product = creator.factoryMethod();
            System.out.println("Product type : " + product.getClass());
        }
        
    }
    
}

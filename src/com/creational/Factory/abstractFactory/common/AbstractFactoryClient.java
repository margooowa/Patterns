/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creational.Factory.abstractFactory.common;


public class AbstractFactoryClient {
    
    public static void main(String[] args) {
        
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        ConcreteFactory2 factory2 = new ConcreteFactory2();
        
        System.out.println("ProductA type from factory1 : " + factory1.createProductA().getClass());
        System.out.println("ProductB type from factory1 : " + factory1.createProductB().getClass());
        System.out.println("ProductA type from factory2 : " + factory2.createProductA().getClass());
        System.out.println("ProductB type from factory2 : " + factory2.createProductB().getClass());
        
    }
    
}

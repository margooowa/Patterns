/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.stuctural.composite.common1;


public class BuilderClient {
    
    public static void main(String[] args) {
        
        Director director = new Director();
        AbstractBuilder builder = new ConcreteBuilder();
        director.setBuilder(builder);
        director.constructProduct();
        Product product = director.getProduct();
        
    }
    
    
    
}

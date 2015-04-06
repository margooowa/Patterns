/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.stuctural.facade.common;


public class FacadeClient {
    
    public static void main(String[] args) {
        
        FacadeAB f = new FacadeAB(new ClassA(), new ClassB());
        f.facadeOperation();
        
    }
    
}

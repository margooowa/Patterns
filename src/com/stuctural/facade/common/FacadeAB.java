/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.stuctural.facade.common;


public class FacadeAB {
    
    private ClassA instanceA;
    private ClassB instanceB;

    public FacadeAB(ClassA instanceA, ClassB instanceB) {
        this.instanceA = instanceA;
        this.instanceB = instanceB;
    }
    
    public void facadeOperation() {
        instanceA.doOperation();
        instanceB.doOperation();
    }
}

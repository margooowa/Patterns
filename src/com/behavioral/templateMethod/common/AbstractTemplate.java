/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.templateMethod.common;


public abstract class AbstractTemplate {
    
    public final void processTemplate() {
        doMandatoryStep();
        doAbstractStep();
        doStubStep();
    }
    
    public final void doMandatoryStep() {
        System.out.println("Doing mandatory step of template");
    }

    public abstract void doAbstractStep();
    
    public void doStubStep() {
        System.out.println("Default styb step, can be overloaded");
    }
    
    
    
    
}

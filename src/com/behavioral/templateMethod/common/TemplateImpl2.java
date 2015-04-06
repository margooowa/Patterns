/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.templateMethod.common;


public class TemplateImpl2 extends AbstractTemplate {

    @Override
    public void doAbstractStep() {
        System.out.println("TemplateImpl2 abstract step implementation");
    }
    
    @Override
    public void doStubStep() {
        System.out.println("TemplateImpl2 override default behaviour of stub step");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.stuctural.adapter.common;


public class TargetAdapter implements ITarget {

    Adaptee adaptee = new Adaptee();
    
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
    
    
    
}

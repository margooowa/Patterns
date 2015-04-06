/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.stuctural.adapter.common;


public class AdapterClient {

    public static void main(String[] args) {        
        
        ITarget target = new ConcreteTarget();
        ITarget targetToAdaptee = new TargetAdapter();
        target.request();
        targetToAdaptee.request();
        
    }
}

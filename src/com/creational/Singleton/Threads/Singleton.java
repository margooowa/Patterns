/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creational.Singleton.Threads;


public class Singleton {
    
    private static volatile Singleton instance;
    
    private Singleton() {
        
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }            
        }
        return instance;
    }
    
}

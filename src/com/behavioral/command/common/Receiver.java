/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.command.common;


public class Receiver {
    
    public void on() {
        System.out.println("I'm receiver, I do ON operation");
    }
    
    public void off() {
        System.out.println("I'm receiver, I do OFF operation");
    }
    
}

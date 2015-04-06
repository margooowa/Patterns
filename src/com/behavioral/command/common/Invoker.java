/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.command.common;


public class Invoker {
    
    private ICommand switchOnCommand;
    private ICommand switchOffCommand;

    public Invoker(ICommand on, ICommand off) {
        this.switchOnCommand = on;
        this.switchOffCommand = off;
    }
    
    public void swithOn() {
        switchOnCommand.execute();
    }
    
    public void switchOff() {
        switchOffCommand.execute();
    }
    
}

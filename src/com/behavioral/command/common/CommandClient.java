/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.command.common;


public class CommandClient {
    
    public static void main(String[] args) {
        
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker(new TurnOnReceiverCommand(receiver), new TurnOffReceiverCommand(receiver));
        invoker.swithOn();
        invoker.switchOff();
        
    }
    
}

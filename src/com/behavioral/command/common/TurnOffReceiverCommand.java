/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.command.common;


public class TurnOffReceiverCommand implements ICommand {

    private Receiver receiver;
    
    public TurnOffReceiverCommand(Receiver receiver) {
        this.receiver = receiver;
    }    
    
    @Override
    public void execute() {
        receiver.off();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.state.common;


public class InactiveState implements IState {

    private Widget widget;
    
    public InactiveState(Widget widget) {
        this.widget = widget;
    }    
    
    @Override
    public void start() {        
        System.out.println("Starting...");
        widget.setState(widget.getOnState());
        widget.setActivity(true);
        widget.getActivity();
        System.out.println("");
    }

    @Override
    public void stop() {
        System.out.println("Unable to stop stopped");
        widget.getActivity();
        System.out.println("");
    }
    
}

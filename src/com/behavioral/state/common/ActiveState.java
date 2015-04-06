/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.state.common;


public class ActiveState implements IState {
    
    private Widget widget;
    
    public ActiveState(Widget widget) {
        this.widget = widget;
    }

    @Override
    public void start() {        
        System.out.println("Preventing from second start...");        
        widget.getActivity();
        System.out.println("");
    }

    @Override
    public void stop() {        
        System.out.println("Shutting down...");
        widget.setState(widget.getOffState());
        widget.setActivity(false);
        widget.getActivity();
        System.out.println("");
    }
    
}

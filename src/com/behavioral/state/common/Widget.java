/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.state.common;


public class Widget {
    
    private boolean activity;
    
    private IState onState;
    private IState offState;
    
    private IState state;

    public Widget() {
        this.onState = new ActiveState(this);
        this.offState = new InactiveState(this);
        this.state = offState;
    }
    
    public void setState(IState state) {
        this.state = state;
    }
    
    public void setActivity(boolean b) {
        this.activity = b;
    }
    
    public void getActivity() {
        System.out.println("Activity: " + activity);
    }
    
    public void pressOn() {
        state.start();
    }
    
    public void pressOff() {
        state.stop();
    }
    
    public static void main(String[] args) {
        
        Widget w = new Widget();
        w.pressOff();
        w.pressOn();
        w.pressOn();
        w.pressOff();
        
    }

    public IState getOnState() {
        return onState;
    }

    public IState getOffState() {
        return offState;
    }
    
    
    
}

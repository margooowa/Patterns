/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.observer.common;

import java.util.ArrayList;


/**
 * @author Marharyta
 *
 */
public class ConcreteSubject implements Observable {

    private ArrayList<IObserver> observers;
    private int intParameter;
    private String stringParameter;

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }    
    
    @Override
    public void addObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);        
    }

    @Override
    public void notifyObservers() {
        for (IObserver o : observers) {
            o.update(this);
        }
    }

    public int getIntParameter() {
        return intParameter;
    }

    public void setIntParameter(int intParameter) {
        this.intParameter = intParameter;
        this.notifyObservers();
    }

    public String getStringParameter() {
        return stringParameter;
    }

    public void setStringParameter(String stringParameter) {
        this.stringParameter = stringParameter;
        this.notifyObservers();
    }
    
}

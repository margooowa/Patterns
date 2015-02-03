/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.observer.common;


/**
 * @author Marharyta
 *
 */
public class ConcreteObserver implements IObserver {
    
    Observable subject;    
    private int intParameter;
    private String stringParameter;
    
    public  ConcreteObserver(Observable o) {
        this.subject = o;
        o.addObserver(this);
    }

    @Override
    public void update(Observable o) {        
        if (o instanceof ConcreteSubject) {
            this.setIntParameter( ((ConcreteSubject) o).getIntParameter() );
            this.setStringParameter( ((ConcreteSubject) o).getStringParameter() );
        }
        this.display();
    }
    
    public void display() {
        System.out.println("int : " + this.getIntParameter());
        System.out.println("str : " + this.getStringParameter());
    }

    public int getIntParameter() {
        return intParameter;
    }

    public void setIntParameter(int intParameter) {
        this.intParameter = intParameter;
    }

    public String getStringParameter() {
        return stringParameter;
    }

    public void setStringParameter(String stringParameter) {
        this.stringParameter = stringParameter;
    }
    
}

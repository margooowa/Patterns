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
public class ObserverClient {
    
    public static void main(String[] args) {
        
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver(subject);
        
        observer.display();
        subject.setIntParameter(1);
        subject.setIntParameter(2);
        subject.setStringParameter("str");
        
    }
    
}

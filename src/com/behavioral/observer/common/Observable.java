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
public interface Observable {
    
    public void addObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void notifyObservers();
    
}

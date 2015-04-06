/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.stuctural.bridge.common;

/**
 *
 * @author dimon
 */
public abstract class IShape {

    IDrawer drawer;
    
    public IShape(IDrawer drawer) {
        this.drawer = drawer;
    }
    
    public abstract void draw(); 
    
}

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
public class BridgeClient {
    
    public static void main(String[] args) {
        
        IShape[] shapes = new IShape[] {new Circle(1, 2, 3, new SmallCircleDrawer()), 
                                        new Circle(2, 3, 4, new BigCircleDrawer())};
        for (IShape s : shapes) {
            s.draw();
        }
    }
    
}

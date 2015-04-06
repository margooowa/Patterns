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
public class Circle extends IShape {

    private int x;
    private int y;
    private int r;
    
    public Circle(int x, int y, int r, IDrawer drawer) {
        super(drawer);
        this.x = x;
        this.y = y;
        this.r = r;
    }
    
    @Override
    public void draw() {
        drawer.drawCircle(x, y, r);
    }
    
}

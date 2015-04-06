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
public class BigCircleDrawer implements IDrawer {

    private static final int multiplier = 10;
    
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("x = " + x + ", y = " + y + ", r = " + radius*multiplier);
    }
    
}

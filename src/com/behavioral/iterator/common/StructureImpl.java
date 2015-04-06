/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.iterator.common;


public class StructureImpl implements IStructure {
    
    private int[] array;    

    public StructureImpl(int capacity) {
        this.array = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;            
        }
    }
    
    public int[] getInstance() {
        return this.array;
    }

    @Override
    public Iterator createIterator(IStructure structure) {
        return new StructureIterator(this);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.iterator.common;

public class StructureIterator implements Iterator<Object> {
    
    private StructureImpl structureInstance;
    private int[] array;
    private int current;

    public StructureIterator(StructureImpl structureInstance) {
        this.structureInstance = structureInstance;
        this.array = structureInstance.getInstance();
    }
    
    @Override
    public boolean hasNext() {
        return current < array.length;
    }

    @Override
    public Object next() {
        return array[current++];
    }
    
}

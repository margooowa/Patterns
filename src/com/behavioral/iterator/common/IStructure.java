/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.iterator.common;


public interface IStructure {
    
    Iterator createIterator(IStructure structureInstance);
    
}

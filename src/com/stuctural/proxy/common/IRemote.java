/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.stuctural.proxy.common;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface IRemote extends Remote {
    
    public String testMethod() throws RemoteException;
    
}

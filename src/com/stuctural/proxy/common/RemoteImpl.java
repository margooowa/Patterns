/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.stuctural.proxy.common;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RemoteImpl extends UnicastRemoteObject implements IRemote {

    public RemoteImpl() throws RemoteException {
        
    }
    
    @Override
    public String testMethod() throws RemoteException {
        return "rmi_test";
    }
    
    public static void main(String[] args) {
        
        try {
            IRemote service = new RemoteImpl();
            Naming.rebind("RMI_test", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}

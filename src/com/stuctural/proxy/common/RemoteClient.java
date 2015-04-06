package com.stuctural.proxy.common;

import java.rmi.Naming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class RemoteClient {
    
    public static void main(String[] args) {
        new RemoteClient().go();
    }
    
    public void go() {
        try {
            IRemote service = (IRemote) Naming.lookup("rmi://192.168.1.252/RMI_test");
            String s = service.testMethod();
            System.out.println(s);
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}

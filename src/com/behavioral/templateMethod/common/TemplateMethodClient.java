/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.behavioral.templateMethod.common;


public class TemplateMethodClient {
    
    public static void main(String[] args) {
        
        TemplateImpl1 template1 = new TemplateImpl1();
        TemplateImpl2 template2 = new TemplateImpl2();
        
        template1.processTemplate();
        template2.processTemplate();
        
    }
    
}

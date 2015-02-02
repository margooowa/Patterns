package com.behavioral.strategy.common;

public class StrategyClient {
    
    public static void main(String[] args) {
        
        AbstractContext ctxA = new ConcreteContextA();
        AbstractContext ctxB = new ConcreteContextB();
    
        System.out.println(ctxA.showInfo() + " " + ctxA.executeStrategy());
        System.out.println(ctxB.showInfo() + " " + ctxB.executeStrategy());
        System.out.println("REVERSE");
        ctxA.setStrategy(new StrategyImplB());
        ctxB.setStrategy(new StrategyImplA());
        System.out.println(ctxA.showInfo() + " " + ctxA.executeStrategy());
        System.out.println(ctxB.showInfo() + " " + ctxB.executeStrategy());
        
    }    
    
}

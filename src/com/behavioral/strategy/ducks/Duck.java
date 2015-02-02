package com.behavioral.strategy.ducks;

public abstract class Duck {
	IFlyBehavior flyBehavior;
	IQuackBehavior quackBehavior;
 
	public Duck() {
	}
 
	public void setFlyBehavior (IFlyBehavior fb) {
		flyBehavior = fb;
	}
 
	public void setQuackBehavior(IQuackBehavior qb) {
		quackBehavior = qb;
	}
 
	abstract void display();
 
	public void performFly() {
		flyBehavior.fly();
	}
 
	public void performQuack() {
		quackBehavior.quack();
	}
 
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}

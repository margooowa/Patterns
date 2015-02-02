package com.behavioral.strategy.ducks;

public class MuteQuack implements IQuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}

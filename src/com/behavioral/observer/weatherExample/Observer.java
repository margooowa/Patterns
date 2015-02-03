package com.behavioral.observer.weatherExample;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}

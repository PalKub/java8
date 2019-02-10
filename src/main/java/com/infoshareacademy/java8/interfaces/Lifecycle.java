package com.infoshareacademy.java8.interfaces;

public interface Lifecycle {

	default String start() {
		return "Lifecycle";
	}

}

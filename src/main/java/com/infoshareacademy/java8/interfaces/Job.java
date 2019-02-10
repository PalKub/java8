package com.infoshareacademy.java8.interfaces;


public interface Job {

	default String start() {
		return "Job";
	}

}

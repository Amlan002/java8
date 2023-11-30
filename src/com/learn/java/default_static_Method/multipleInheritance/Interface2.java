package com.learn.java.default_static_Method.multipleInheritance;

public interface Interface2 extends Interface1 {
	default void methodB() {
		System.out.println("Inside Interface B from " + Interface2.class);
	}

	default void methodA() {
		System.out.println("Inside Interface A from " + Interface2.class);
	}
}

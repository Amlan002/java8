package com.learn.java.default_static_Method.multipleInheritance;

public interface Interface3 extends Interface2 {
	default void methodC() {
		System.out.println("Inside Interface C from " + Interface3.class);
	}

	default void methodB() {
		System.out.println("Inside Interface B from " + Interface3.class);
	}
}

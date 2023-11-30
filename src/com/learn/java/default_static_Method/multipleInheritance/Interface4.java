package com.learn.java.default_static_Method.multipleInheritance;

public interface Interface4 {
	default void methodA() {
		System.out.println("Inside Interface A from "+Interface4.class);
	}
}

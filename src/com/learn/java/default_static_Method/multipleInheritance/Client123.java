package com.learn.java.default_static_Method.multipleInheritance;

public class Client123 implements Interface1, Interface2, Interface3 {
	public void methodA() {
		System.out.println("Inside Interface A from " + Client123.class);
	}

	public static void main(String[] args) {
		Client123 client123 = new Client123();
		client123.methodA();
		client123.methodB();
		client123.methodC();

	}
}

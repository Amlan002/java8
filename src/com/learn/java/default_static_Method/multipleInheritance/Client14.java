package com.learn.java.default_static_Method.multipleInheritance;

public class Client14 implements Interface1, Interface4 {

	public static void main(String[] args) {
		Client14 client14 = new Client14();
		client14.methodA();
	}

	public void methodA() {
		System.out.println("Inside Interface A from " + Client14.class);
	}

}

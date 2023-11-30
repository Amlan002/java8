package com.learn.java.lambdas;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		// before java 8

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside Runnable 1");
			}
		};
		new Thread(runnable).start();

		// after java 8

		Runnable runnable2 = () -> {
			System.out.println("Inside Runnable 2");
		};
		new Thread(runnable2).start();

		// other way-- directly pass the runnable to thread
		new Thread(() -> System.out.println("Inside Runnable 3")).start();
	}

}

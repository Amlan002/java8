package com.learn.java.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		//before java 8
		Comparator<Integer> comparator=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
 				return o1.compareTo(o2);
			}
		};
		System.out.println("Result of comparator is "+comparator.compare(3, 2));
		
		//after java 8
		Comparator<Integer> comparator2=(Integer a, Integer b)->a.compareTo(b);
		System.out.println("Result of comparator2 is "+comparator2.compare(3, 4));
		System.out.println("Result of comparator2 is "+comparator2.compare(5, 4));
		System.out.println("Result of comparator2 is "+comparator2.compare(4, 4));
		
		//lambda is smart enough to know the type
		Comparator<Integer> comparator3=(x,y)->x.compareTo(y);
		System.out.println("result of comparator3 is "+comparator3.compare(55, 22));

	}
	

}

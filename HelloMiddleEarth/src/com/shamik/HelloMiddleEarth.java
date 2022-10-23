package com.shamik;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class HelloMiddleEarth {

	public static void main(String[] args) {
		
		String[] names = {"Bilbo", "Fredo", "Aragorm", "Legolas", "Gandalf", "Boromir", "Faramir"};
		
		
		// Put Some Comments ==> Developer 1
		for(String name : names)
		{
			System.out.format("Hello, %s! \n", name);
			System.out.println("How are you doing today !!");
		}
		
		// [Interface: List] extends [Interface: Iterable]
		// [Interface: Iterable] has implemented method ==> forEach
		// ==> [Interface: List] inherits it 
		List<String> list = Arrays.asList("nope", "java", "python", "ruby");
		
		/* ******************************************************************** */
		// Anonymous Inner Class
		
		System.out.println("Anonymous Inner Class");
		
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);	
			}
		});
		
		/* ******************************************************************** */
		// LAMBDA EXPRESSION
		
		System.out.println("\nLAMBDA");
		
		list.forEach(s -> System.out.println(s));
		
		/* ******************************************************************** */
		// Method Reference
		
		System.out.println("\nMethod Reference");
		
		list.forEach(System.out::println);
		
		
		/* ******************************************************************** */
	}

}

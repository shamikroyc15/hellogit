package com.shamik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class HelloGit {

	public static void main(String[] args) {
		
		//Adding a comment
		System.out.println("Hello Git !!!");

		// Further changes after - Resolving Merge Conflicts
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))		// Input Argument -- [Interface: Predicate]
		.forEach(p -> System.out.println(p.getFirstName()));
			
		// Initialize a List with Contents
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		
		// Get Filtered List
		List<String> result = getFilterOutput(lines, "mkyong");
		
		// Print Filtered List
		for(String filteredName: result)
			System.out.println(filteredName);
		
		// Function to add 2 Numbers: Change made in Git Repo
		System.out.println("Sum of 4 Numbers = " + add4Numbers(5, 6, 7, 8));
		
		// Function to add 2 Numbers: Change made in Local
		System.out.println("Sum of 2 Numbers = " + add2Numbers(5, 6));
		
		// Function to add 5 Numbers: Change made in Git Repo
		System.out.println("Sum of 5 Numbers = " + add5Numbers(5, 6, 7, 8, 9));
		
		// Function to Multiply 2 Numbers
		System.out.println("Product of 2 Numbers = " + multiply2Numbers(4, 9));
		
		// Function to Multiply 3 Numbers
		System.out.println("Product of 3 Numbers = " + multiply3Numbers(4, 9, 10));
	
	}
	
	private static List<String> getFilterOutput(List<String> lines, String filterOut)
	{
		// Declare/Initialize an Empty List
		List<String> result = new ArrayList<String>();
		
		for(String aLine: lines)
		{
			if(!aLine.equals(filterOut))
				result.add(aLine);
		}
		
		return result;

	}
	
	public static int add4Numbers(int a, int b, int c, int d)
	{
		int sum = a + b + c + d;
		   System.out.println("Sum of 4 Numbers = " + sum);
		   
		   return sum;
	}
	
	public static int add2Numbers(int a, int b)
	{
	   
	   int sum = a + b;
	   System.out.println("Sum of 2 Numbers = " + sum);
		
	   return sum;
	}
	
	public static int add5Numbers(int a, int b, int c, int d, int e)
	{
	   
	   int sum = a + b + c + d + e;
	   System.out.println("Sum of 5 Numbers = " + sum);
		
	   return sum;
	}
	
	public static int multiply2Numbers(int a, int b)
	{
	   return a*b;
	}
	
	public static int multiply3Numbers(int a, int b, int c)
	{
	   return a*b*c;
	}
	
}

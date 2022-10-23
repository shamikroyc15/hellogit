package com.shamik;

public class HelloMiddleEarth {

	public static void main(String[] args) {
		
		String[] names = {"Bilbo", "Fredo", "Aragorm", "Legolas", "Gandalf"};
		
		for(int i = 0; i < names.length; i++)
		{
			System.out.format("Hello, %s! \n", names[i]);
		}
	}

}

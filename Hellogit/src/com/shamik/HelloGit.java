package com.shamik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloGit {

	public static void main(String[] args) {
		
		//Adding a comment
		System.out.println("Hello Git !!!");
	
		// Initialize a List with Contents
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		
		// Get Filtered List
		List<String> result = getFilterOutput(lines, "mkyong");
		
		// Print Filtered List
		for(String filteredName: result)
			System.out.println(filteredName);
	
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

}

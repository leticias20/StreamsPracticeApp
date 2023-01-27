package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PracticeStream {
	
	
	public static void main(String [] args) {
		
		 List<String> names = new ArrayList<>();
	     names.add("John");
	     names.add("Jane");
	     names.add("Adam");
	     names.add("Mathew");
	     names.add("Eve");
	     names.add("Kierra");
	     names.add("Miranda");
	     names.add("Thomas");
	     names.add("Alvaro");
	     names.add("");
	     
	  // using count() to count the number of elements and 
	   // saving the result in a variable
	   long count = names.stream().count();
	   System.out.println("Count without filter: " + count);
	   
	   // count empty strings
	   long countEmpty = names.stream().filter(String:: isEmpty).count();
	   System.out.println("\nEmpty elements: " + countEmpty);
	   
	   //count with filters
	   
	   Predicate<String> nameStartWithA = ele -> ele.startsWith("A");
	   Predicate<String> nameStartWithJ = ele -> ele.startsWith("J");
	   
	   long countWithFilters = names.stream().filter(nameStartWithJ.or(nameStartWithA)).count();
	   
	   System.out.println("\nCount with filters: " + countWithFilters);
	   
		
	}

}

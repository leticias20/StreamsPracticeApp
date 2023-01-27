package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PracticeReduce {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("GFG", "Geeks", "for",
                 "GeeksQuiz", "GeeksforGeeks");
		 
		 Optional<String> longestString = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
		 
		 longestString.ifPresent(System.out :: println);
		 
		 // String array
	     String[] array = { "Geeks", "for", "Geeks" };
	     
	     Optional<String> String_combine = Arrays.stream(array).reduce((str1, str2) -> str1 + "-" + str2);
	     
	  // Displaying the combined String
	        if (String_combine.isPresent()) {
	            System.out.println(String_combine.get());
	        }
	        
	   
	        // Creating list of integers
	        List<Integer> arraySum = Arrays.asList(-2, 0, 4, 6, 8);
	        
	        
	     // Finding sum of all elements
	        int sum = arraySum.stream().reduce(0,(element1, element2) -> element1 + element2);
	  
	        // Displaying sum of all elements
	        System.out.println("The sum of all elements is " + sum);
	        
	}

}

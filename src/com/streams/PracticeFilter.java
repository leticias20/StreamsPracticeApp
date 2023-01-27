package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Filter use of streams, giving list of even numbers

public class PracticeFilter {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listNumber = new ArrayList<Integer>();
		listNumber.add(1);
		listNumber.add(2);
		listNumber.add(3);
		listNumber.add(4);
		
		//filtering numbers
		List<Integer> ls = listNumber.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		
		// Print the collection after stream operation
        // as stored in List object
        System.out.println(
            "Printing the List after stream operation : "
            + ls);

	}

}

package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Map usage of streams
public class PracticeMap {

	public static void main(String[] args) {
		List<Integer> listNumber = new ArrayList<Integer>();
		listNumber.add(1);
		listNumber.add(2);
		listNumber.add(3);
		listNumber.add(4);
		
		//Obtaining the list in which each num is multiply by 2
		
		List<Integer> ls = listNumber.stream().map(i -> i*2).collect(Collectors.toList());
		
		System.out.println(
	            "Printing the List after stream operation : "
	            + ls);
		

	}

}

package com.assigments.hashmap;

import java.util.HashMap;

public class Assignments2 {

	public static void main(String[] args) {
		// assignments 2:
		// vul een hashmap met 1 miljoen records, gebruik elke keer een unieke id, de naam mag steeds hetzelfde
		// zijn of mag je veranderen als je dat voor elkaar krijgt
		// meet hoe lang het duurt om een record op te vragen
		// maak 1 record met een andere naam,
		// meet ook hoe lang het duurt om dit record via zijn key op te vragen...
		
		HashMap <String, Integer> namesMap = new HashMap<>();		
		long i;
		for (i = 0; i <= 1000000L; i++) 
		{
		namesMap.put("justin douglas", 1);
			
			System.out.println(namesMap);
	
		}
	}

}

package com.assigments.hashmap;

import java.util.HashMap;

public class Assignments2 {

	public static void main(String[] args) {
		// assignments 2:
		// zijn of mag je veranderen als je dat voor elkaar krijgt
		
		HashMap <Integer, String> namesMap = new HashMap<>();		
		// vul een hashmap met 1 miljoen records, gebruik elke keer een unieke id, de naam mag steeds hetzelfde
		
		for (int i = 1; i <= 1_000_000; i++) 
		{
			// maak 1 record met een andere naam,
		namesMap.put(i, "justin");
		}
		System.out.println(namesMap.get(500));
		namesMap.put(1001, "gianni");
	}
	
	// meet hoe lang het duurt om een record op te vragen
	// meet ook hoe lang het duurt om dit record via zijn key op te vragen...
	// hoe de epoch tijd te implementeren
	
}

package com.assignments2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//
// Assignment 1: Maak een lijst van 50 atleten.
// Vul ze steeds met andere sporten, dus bijv een aantal boksers, voetballers etc ec
// Maak deze ook aan met een variabel geboortejaar (tussen 1990-2005))

//  - zoek naar alle atleten die zwemmen en druk deze dan af
//  - zoek naar alle atleten die jair heten en zwemmen en druk deze dan af
// vul de 
//  (*) zoek naar alle atleten die jonger zijn dan 20 jaar


public class Atleet {

// data members of the class
// variabels gedeclareerd om later in methods gebruikt te worden
	public enum Sport {BAANWIELRENNEN, ATLETIEK, ZWEMMEN, BOKSEN, ZEILEN, VOETBAL};
	private String voorNaam;
	private String achterNaam;
    private LocalDate geboorteDatum;
    private Sport sport;
    
    
    

	public String getVoorNaam() {
		return voorNaam;
	}

	public void setVoorNaam(String voorNaam) {
		this.voorNaam = voorNaam;
	}

	public String getAchterNaam() {
		return achterNaam;
	}

	public void setAchterNaam(String achterNaam) {
		this.achterNaam = achterNaam;
	}

	public LocalDate getGeboorteDatum() {
		return geboorteDatum;
	}

	public void setGeboorteDatum(LocalDate geboorteDatum) {
		this.geboorteDatum = geboorteDatum;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}
	
	
	// bepaal de leeftijd
		public int getAge() {
			LocalDate now = LocalDate.now();
			LocalDate diff = now.minusYears(geboorteDatum.getYear());
			return diff.getYear();
		}
		
		
// stackeroverflow mogelijke oplossing voor accuraat leeftijd aangeving
//		public class AgeCalculator {
//
//		    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
//		        if ((birthDate != null) && (currentDate != null)) {
//		            return Period.between(birthDate, currentDate).getYears();
//		        } else {
//		            return 0;
//		        }
//		    }
//		}
	

// note: als ik sport ga veranderen later naar een sport type moet rekening houden dat ik overal waar sport is de type naar sport zetten
public Atleet(String voorNaam, String achterNaam, LocalDate geboorteDatum, Sport sport) {
		super();
		this.voorNaam = voorNaam;
		this.achterNaam = achterNaam;
		this.geboorteDatum = geboorteDatum;
		this.sport = sport;
	}
//Atleet atleet = new Atleet("Justin", "Douglas", LocalDate.of(1990, 6, 1), Sport.ATLETIEK);


	// main method voor het uitprinten van de output 
	public static void main(String[] args) {
		
//creer een list waar all the atleten gaan voorkomen 
		List<Atleet> atleten = new ArrayList<Atleet>();
		
		// voor elke value dat in je list gaat voor komen moet een variable maken voor elke waarde en dan in een loop plaatsen zodat die het automatisch vult ermee
		
		atleten.add(new Atleet("Justin", "Douglas", LocalDate.of(1990, 7, 13),Sport.ATLETIEK));
		atleten.add(new Atleet("Harry", "Potter", LocalDate.of(1990, 5, 1), Sport.VOETBAL));
		
		System.out.println(atleten);
//		System.out.println("Atleet: " + atleten.get(voorNaam) + " " + atleten.achterNaam + " " + "Leeftijd: " + atleten.getAge() + " " + "Sport: " + atleten.sport);
	}

}

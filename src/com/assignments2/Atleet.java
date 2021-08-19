package com.assignments2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
//		public int getAge() {
//			LocalDate now = LocalDate.now();
//			LocalDate diff = now.minusYears(geboorteDatum.getYear());
//			return diff.getYear();
//		}
		
		
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
		String[] voorNamen = {"justin", "george", "john", "jair"};// 4 elementen dus er moet aangegven worden hoeveel er in de for loop moet komen
		String[] achterNamen = {"rodriguez", "messi", "wayne", "lopez"}; // 4 elementen
		
		
		for (int i = 0; i <= 50; i++ ) {
			Random random = new Random();
			int naamNummer = random.nextInt(4);
			int achterNaamNummer = random.nextInt(4);
            
			// houdt de dagen variable
			int geboorteDag = random.nextInt(28) +1;
			int geboorteMaand = random.nextInt(12) + 1;
			int geboorteJaar = random.nextInt(2005 - 1990) + 1990;
			// kiest elke keer een ander sport
			Sport nieuwSportArray = null;
			int ranGetal = random.nextInt(6);
			if(ranGetal == 0) {
				nieuwSportArray = Sport.BAANWIELRENNEN;
			}else if(ranGetal == 1) {
				nieuwSportArray = Sport.ATLETIEK;
			} else if(ranGetal == 2) {
				nieuwSportArray = Sport.BOKSEN;
			} else if(ranGetal == 3) {
				nieuwSportArray = Sport.VOETBAL;
			} else if(ranGetal == 4) {
				nieuwSportArray = Sport.ZEILEN;
			} else if(ranGetal == 5) {
				nieuwSportArray = Sport.ZWEMMEN;
			}
			
			Atleet atleet = new Atleet(voorNamen[naamNummer], achterNamen[achterNaamNummer], LocalDate.of(geboorteJaar, geboorteMaand, geboorteDag), nieuwSportArray);
		}
		
		System.out.println(atleten);
//		System.out.println("Atleet: " + atleten.get(voorNaam) + " " + atleten.achterNaam + " " + "Leeftijd: " + atleten.getAge() + " " + "Sport: " + atleten.sport);
	}

}

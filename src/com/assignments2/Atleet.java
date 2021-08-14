package com.assignments2;

import java.time.LocalDate;

//
// Assignment 1: Maak een lijst van 50 atleten.
// Vul ze steeds met andere sporten, dus bijv een aantal boksers, voetballers etc ec
// Maak deze ook aan met een variabel geboortejaar (tussen 1990-2005))

//  - zoek naar alle atleten die zwemmen en druk deze dan af
//  - zoek naar alle atleten die jair heten en zwemmen en druk deze dan af
// vul de 
//  (*) zoek naar alle atleten die jonger zijn dan 20 jaar


public class Atleet {
	
// variabels gedeclareerd om later in methods gebruikt te worden
	private String voorNaam;
	private String achterNaam;
    private LocalDate geboorteDatum;
    private String sport;
    
    
    

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




	public String getSport() {
		return sport;
	}




	public void setSport(String sport) {
		this.sport = sport;
	}

// note: als ik sport ga veranderen later naar een sport type moet reken9ing houden dat ik overal waar sport is de type naar sport zetten
public Atleet(String voorNaam, String achterNaam, LocalDate geboorteDatum, String sport) {
		super();
		this.voorNaam = voorNaam;
		this.achterNaam = achterNaam;
		this.geboorteDatum = geboorteDatum;
		this.sport = sport;
	}




	// main method voor het uitprinten van de output 
	public static void main(String[] args) {
//		System.out.println();

	}

}

package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasy", "Bebe Vio", "Luis", "Martina Maccherone", "Pardis Zarei", "Rachel Zeilic"};
		
		System.out.print("Inserisci il tuo nome: ");
		String nome = scan.nextLine();
		
		boolean trovato = false;
		
		for (int i = 0; i < guests.length; i++ ) {
			if (nome.equals(guests[i])) {
				trovato = true;
				System.out.print("Il tuo nome è sulla lista. Puoi entrare.");
				
				break;
			}
			
		}
	  
		if(!trovato) {
			System.out.println("Il tuo nome non è sulla lista. Non puoi entrare.");
			
		}
		
		
		
        scan.close();
	}
	

}

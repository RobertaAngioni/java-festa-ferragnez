package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuestBonus {

  public static void main(String[] args) {
		
		
	  Scanner scan = new Scanner(System.in);
		
		String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasy", "Bebe Vio", "Luis", "Martina Maccherone", "Pardis Zarei", "Rachel Zeilic"};
		
		boolean inputValido = false;
	    String nome;
	    
		System.out.print("Inserisci il tuo nome: ");
		
		while(inputValido == false) {
			nome = scan.nextLine();
			
			
			
			if(!nome.equals(guests)) {
				inputValido = true;
				System.out.println("Il tuo nome è nella lista. Puoi entrare.");
			} else {
				System.out.println("Il tuo nome non è nella lista. Non puoi entrare");
			}
		   
		}
	
		
		
		
		
		
      scan.close();
}
}

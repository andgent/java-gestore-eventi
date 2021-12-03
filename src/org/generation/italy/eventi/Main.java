package org.generation.italy.eventi;
import java.time.LocalDate;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci titolo evento: ");
		String titolo = scan.next();
		System.out.println("Inserisci l'anno evento: ");
		int year = scan.nextInt();
		System.out.println("Inserisci mese dell'evento (1-12): ");
		int month = scan.nextInt();
		System.out.println("Inserisci giorno dell'evento: ");
		int day = scan.nextInt();
		System.out.println("Inserisci posti totali evento: ");
		int postiTot = scan.nextInt();
		LocalDate date = LocalDate.of(year, month, day);
		
		Eventi evento1 = new Eventi (titolo, postiTot, date);
		System.out.println("Evento: " + titolo + " - " + "Data: " + date + " - Posti totali: " + postiTot);
		
	}

}

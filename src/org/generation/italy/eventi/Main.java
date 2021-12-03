package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Inserisci titolo evento: ");
			String titolo = scan.nextLine();
			System.out.println("Inserisci l'anno evento: ");
			int year = scan.nextInt();
			System.out.println("Inserisci mese dell'evento (1-12): ");
			int month = scan.nextInt();
			System.out.println("Inserisci giorno dell'evento: ");
			int day = scan.nextInt();
			System.out.println("Inserisci posti totali evento: ");
			int postiTot = scan.nextInt();
			LocalDate date = LocalDate.of(year, month, day);

			Eventi evento1 = new Eventi(titolo, postiTot, date);
			System.out.println("Evento: " + titolo + " - " + "Data: " + date + " - Posti totali: " + postiTot);
			System.out.println(
					"Vuoi prenotare?" + " digita s per sì o digita qualsiasi altro carattere per non prenotare");
			String answer = scan.next();
			String s = "s";

			if (answer.equals(s)) {
				System.out.println("Quanti posti vuoi prenotare?");
				int aggiungiPosti = scan.nextInt();

				for (int i = 0; i < aggiungiPosti; i++) {
					evento1.prenota();
				}
			}
			System.out.println("Vuoi disdire?" + " digita s per sì o qualsiasi altro carattere per non disdire");
			answer = scan.next();
			if (answer.equals(s)) {
				System.out.println("Quanti posti vuoi disdire?");
				int disdiciPosti = scan.nextInt();

				for (int i = 0; i < disdiciPosti; i++) {
					evento1.disdici();
				}
			}
			evento1.printInfo();
		} catch (Exception e) {
			System.out.println("Impossibile proseguire: " + e.getMessage());
		}
	}
}

package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.Scanner; 

public class Eventi {
	private int postiTot;
	private int postiPrenotati = 0;
	private String titolo; 
	private LocalDate todaysDate;
	private LocalDate date;
	
	public Eventi (String titolo, int postiTot, LocalDate date) throws Exception {
		this.titolo = titolo;
		this.date = date;
		this.postiTot = postiTot;
		todaysDate = LocalDate.now(); 
		if (date.isBefore(todaysDate)) throw new Exception("Data invalida");
		if (postiTot <1) throw new Exception("L'evento deve prevedere almeno un posto");	
	}


	public int prenota() throws Exception {
		postiPrenotati ++;
		todaysDate = LocalDate.now(); 
		if (postiPrenotati > postiTot) throw new Exception("I posti da prenotare eccedono i posti disponibili");
		if (date.isBefore(todaysDate)) throw new Exception("Data invalida");
		return postiPrenotati;
	}
	
	public int disdici() throws Exception {
		postiPrenotati --;
		todaysDate = LocalDate.now(); 
		if (postiPrenotati < 0) throw new Exception("Nessuna prenotazione da disdire");
		if (date.isBefore(todaysDate)) throw new Exception("Data invalida");
		return postiPrenotati;
	}
	
	 public String toString() { 
         return date.toString()+"-"+titolo;
      } 
	 
	public void printInfo() {
		int postiDisponibili = postiTot - postiPrenotati;
		System.out.println("Posti prenotati: " + postiPrenotati);
		System.out.println("Posti disponibili: " + postiDisponibili);
	}
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getPostiTot() {
		return postiTot;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	
	
}


package backend;

import common.*;

public class Evaluate {
	
	/*
	 * +9 is winnend voor speler 1
	 * +5 speler 1 heeft minstens draw of winst
	 * -9 is winnend voor speler 2
	 * 0 is onbeslist
	 * Effectieve punten gescoord Op zet 2; 1 punt voorstaan is +1; Per zet dat je voorsprong blijft +0.5 erbij
	 * 
	 * DLW --> Met lucht kan hij geen elementen winnen als water al gespeeld is. Dus dit slechte element moet kwijt gespeeld worden
	 * DVW     L kwijt tegen W  en W kwijt tegen V
	 * 
	 * DLWWV    
	 * DVWAV
	 * De speler die als eerste defensie inlegt heeft een voordeel
	 * Bekijk onderste speler
	 * D daar heb je D ingelegt dus ok
	 * V heb je ergens al W ingelegd. Yep dus W en V schrappen
	 * W heb je ergens al L ingelegd. Yep dus schrappen
	 * A heb je ergens al V ingelegd. Yep schrappen
	 * V heb je nog een water. Yep schrappen
	 * Speler 1 heeft 4 counters
	 * Speler 2 heeft 1 counter
	 * 3 verschil en speler 1 kan al niet meer verliezen. Minstens gelijk
	 * 1.67 per counter
	 * 
	 * 
	 * Bij een 0-0 score, speler die later defensie ingelegd -0.5
	 * Bij een voorsprong, 0
	 * Bij een achterstand, -0.5*aantalzetten
	 */
	
	private int[] speler1;
	private int[] speler2;
	private int aantalzetten;
	private double huidigescore;
	private double evaluation;
	
	private int getElement(String e) {
		String element = e;
		switch (element) {
			case "L":
				return 0;
			case "A":
				return 1;
			case "V":
				return 2;
			case "W":
				return 3;
			default:
				return 4;
		}
	}
	
	public Evaluate(String[] speler1, String[] speler2, int aantalzetten) {
		evaluation = 0;
		this.speler1 = new int[aantalzetten];
		this.speler2 = new int[aantalzetten];
		for (int i = 0; i < aantalzetten; i++) {
			this.speler1[i] = getElement(speler1[i]);
			this.speler2[i] = getElement(speler2[i]);
		}
		this.aantalzetten = aantalzetten;
	}
	
	public double getEvaluation() {
		effectiveScore();
		checkDefense();
		counterScore();
		return evaluation;
	}
	
	private void effectiveScore() {
		int eval = 0;
		for (int i = 0; i < aantalzetten; i++) {
			eval += Constants.RESULTMATRIX[speler1[i]][speler2[i]];
		}
		huidigescore = eval;
		double score = 0;
		if (eval < 0) {
			eval = eval * -1;
			score = Math.pow(eval, 0.6) * 0.83 * aantalzetten;
			score = 0 - score;
		} else {
			score = Math.pow(eval, 0.6) * 0.83 * aantalzetten;
		}
		System.out.println("Effective score: " + score);
		evaluation += score;
	}
	
	private void checkDefense() {
		double eval = 0;
		boolean defense1 = false;
		boolean defense2 = false;
		for (int i = 0; i < aantalzetten; i++) {
			if (speler1[i] == 4) {
				defense1 = true;
			}
			if (speler2[i] == 4) {
				defense2 = true;
			}
		}
		if (defense1 && huidigescore > 0) eval = 1;		
		else if (defense1) eval = 0.5;
		
		if (defense2 && huidigescore < 0) eval = -1;
		else if (defense2) eval = -0.5;
		
		
		if (defense1 & defense2) eval = 0;
		
		System.out.println("Defense: " + eval);
		evaluation += eval;
	}
	
	private void counterScore() {
		double counters = 0;
		for (int i1 = 0; i1 < aantalzetten; i1++) {
			for (int i2 = 0; i2 < aantalzetten; i2++) {
				counters += Constants.RESULTMATRIX[speler1[i1]][speler2[i2]];
			}			
		}
		System.out.println("Counterscore: " + counters * 1.67);
		if (aantalzetten < 6) evaluation += counters * 1.67;
		else evaluation += counters * 2.5; //3.34 komt overeen met +10 bij winst	
	}
}

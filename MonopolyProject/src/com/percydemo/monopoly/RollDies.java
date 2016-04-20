package com.percydemo.monopoly;

/*
 * Rappresenta il lancio di due dadi.
 * Si presuppone che i dadi abbiano 6 facce (SIDE).
 */
public class RollDies {
	
	private static final int SIDE = 6; //6 facce, valori assumibili da 1 a 6
	private int sideValue1; //dado 1
	private int sideValue2; //dado 2
	
	//Costruttore
	public RollDies(){	
		//valore del dado zero: non ha nessun valore perchè non l'ho lanciato
		sideValue1 = 0; 
		sideValue2 = 0;
	}	
	 
	//Calcola il risultato del lancio dei dadi
	private void calculateRoll(){
		sideValue1 = (int)(Math.random() * SIDE + 1);
		sideValue2 = (int)(Math.random() * SIDE + 1);
	}
		
	//Simula il lancio dei dadi e ne ritorna il risultato
	public int roll(){		
		calculateRoll();
		return sideValue1 + sideValue2;
	}
	
	//Ritorna il numero massimo che si può ottenere dal lancio dei dadi
	public int maxRoll(){
		return 2*SIDE;
	}
		
}
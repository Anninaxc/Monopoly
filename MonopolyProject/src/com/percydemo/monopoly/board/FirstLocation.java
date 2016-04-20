package com.percydemo.monopoly.board;

import com.percydemo.monopoly.Player;

/*
 * Rappresenta la location "VIA", da cui parte il gioco.
 * Ogni volta che un giocatore transita su questa location, la Banca gli paga una indennità di L.20000.
 */
public class FirstLocation extends GenericLocation{
	
	private static final int COMPENSATION = 20000; 
	
	//Costruttore
	public FirstLocation(){
		super("VIA!");
	}
	

	@Override
    public void stopHere(Player player) { 
		System.out.println(" --> si sposta sulla casella: Via!");
    }

}
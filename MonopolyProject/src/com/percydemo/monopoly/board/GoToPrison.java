package com.percydemo.monopoly.board;

import com.percydemo.monopoly.Player;

/*
 * Rappresenta la casella "Vai in prigione".
 * Quando un giocatore si ferma qui finisce in prigione, la prigione si trova fisicamente sulla casella "Transito/Prigione".
 */
public class GoToPrison extends GenericLocation{
	
	private final Prison prison;        

	//Costruttore
	public GoToPrison(Prison _prison){   
		super("Vai in prigione");
		prison = _prison;     
	}
		
	@Override
    public void stopHere(Player player) { 
		System.out.println(" --> si sposta sulla casella: " + getName() + ".");	
		//il giocatore viene incarcerato e spostato dalla location "Vai in prigine" alla location "Transito/Prigione"
		//nella Release 1 non è prevista l'implementazione della carcerazione di un player
    }

}
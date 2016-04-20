package com.percydemo.monopoly.board;

import com.percydemo.monopoly.Player;
import com.percydemo.monopoly.card.*;

/*
 * Rappresenta una casella che obbliga a pescare una carta probabilità o imprevisti.
 * Le caselle di questo tipo sono 2: probabilità e imprevisti.
 */
public class CardLocation extends GenericLocation{
	
	private final CardGroup cards; 
	
	//Costruttore
	public CardLocation(String _name, CardGroup _cards){
		super(_name);
		cards = _cards;
	}
	
	
	@Override
    public void stopHere(Player player) { 
		Card takecard = cards.getNext();
		System.out.println(" --> si sposta sulla casella: " + getName() + " --> pesca la carta: " + takecard.getTextCard());
    }

}
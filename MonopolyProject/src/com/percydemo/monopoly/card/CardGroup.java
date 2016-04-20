package com.percydemo.monopoly.card;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/*
 * Rappresenta il mazzo delle carte (card) probabilità/imprevisti 
 */
public class CardGroup {

	private final List<Card> group = new ArrayList<>();
	private int i_group = 0; //indice della carta da pescare
	
	//Costruttore
    public CardGroup() {
    //aspetta perchè serve la prigione o lo faccio andare alla casella in prigione e poi viene tutto automatico??
    	//group.add(new AdvanceToPrison());       
    	//group.add(new ExitToPrison());
    	group.add(new AdvanceToGo());
    	group.add(new AdvanceToStation());
    	group.add(new Pay());
    	group.add(new Profit());
    	group.add(new ReturnToVicoloCorto());  
    	
    	Collections.shuffle(group); //mescolo le carte
    }
    
    //Pesca una card
    public Card getNext() {
        Card card = group.get(i_group);
        i_group ++;
        if (i_group>= group.size())
        	i_group = 0;
        return card;
    }

}

package com.percydemo.monopoly.card;

import com.percydemo.monopoly.Player;

/*
 * Rappresenta una carta imprevisti o probabilit�.
 */
public interface Card {
	
	//gestione di cosa deve fare il giocatore dopo aver pescato la carta, non � previsto implementare questo comportamento per la Release 1
	void getToDo(Player player);

	//ritorna cosa c'� scritto sulla carta
    String getTextCard();

}

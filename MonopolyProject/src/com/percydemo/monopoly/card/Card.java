package com.percydemo.monopoly.card;

import com.percydemo.monopoly.Player;

/*
 * Rappresenta una carta imprevisti o probabilità.
 */
public interface Card {
	
	//gestione di cosa deve fare il giocatore dopo aver pescato la carta, non è previsto implementare questo comportamento per la Release 1
	void getToDo(Player player);

	//ritorna cosa c'è scritto sulla carta
    String getTextCard();

}

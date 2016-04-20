package com.percydemo.monopoly.card;

import com.percydemo.monopoly.Player;
import com.percydemo.monopoly.board.Prison;

public class AdvanceToPrison implements Card{
	
    private static final String DESTINATION = "Transito Prigione";
  	
    @Override
    public void getToDo(Player player) {
    	//il player viene imprigionato e spostato in prigione
    }

    @Override
    public String getTextCard() {
        return "Andate in prigione + direttamente e senza passare dal Via! ";  
    }

}
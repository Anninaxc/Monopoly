package com.percydemo.monopoly.card;

import com.percydemo.monopoly.Player;

public class AdvanceToStation implements Card{
	
    private static final String DESTINATION = "Stazione Nord";

    @Override
    public void getToDo(Player player) {
    	//il player si deve spostare alla location indicata dalla DESTINATION
    	//se per arrivare passa dal via, si somma un round e guadagna 20000L
    }

    @Override
    public String getTextCard() {
        return "Andate alla " + DESTINATION + ". Se passate dal VIA! ritirate 20000 L."; 
    }
}

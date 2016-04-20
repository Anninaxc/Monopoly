package com.percydemo.monopoly.card;

import com.percydemo.monopoly.Player;

public class ReturnToVicoloCorto implements Card{

    private static final String DESTINATION = "VicoloCorto";

    @Override
    public void getToDo(Player player) {
    	//il player si deve spostare alla location indicata dalla DESTINATION procedendo all'indietro
    	//ovvero decrementando la position
    }

    @Override
    public String getTextCard() {
        return "Ritornate a " + DESTINATION + ".";
    }
}

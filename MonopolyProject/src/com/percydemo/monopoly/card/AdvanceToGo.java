package com.percydemo.monopoly.card;

import com.percydemo.monopoly.Player;

public class AdvanceToGo implements Card{
	
    private static final String DESTINATION = "VIA!";

    @Override
    public void getToDo(Player player) {
        //il player si deve spostare alla location indicata dalla DESTINATION
    }

    @Override
    public String getTextCard() {
        return "Andate al " + DESTINATION ;  
    }
}

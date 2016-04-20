package com.percydemo.monopoly.card;

import com.percydemo.monopoly.Player;

public class ExitToPrison implements Card{
	  
    @Override
    public void getToDo(Player player) {
    	//quando un giocatore in prigione viene liberato, resta nella location in cui si trova zona adibita a transito
    }

    @Override
    public String getTextCard() {
        return "Uscite gratis di prigione, se ci siete: potete conservare questo cartoncino sino al momento di servirvene (non si sa mai!).";
    }

}
package com.percydemo.monopoly.card;

import com.percydemo.monopoly.Player;

public class Pay implements Card{

    private static final int VALUE = 10000;

    @Override
    public void getToDo(Player player) {
    	//il player deve pagare, gli viene decrementato il capitale
    }

    @Override
    public String getTextCard() {
        return "Avete perso una causa: pagate " + VALUE + "L.";
    }
}

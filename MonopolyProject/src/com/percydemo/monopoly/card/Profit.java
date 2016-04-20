package com.percydemo.monopoly.card;

import com.percydemo.monopoly.Player;

public class Profit implements Card{

    private static final int VALUE = 10000;

    @Override
    public void getToDo(Player player) {
        //il player ha un guadagno, gli viene incrementato il capitale
    }

    @Override
    public String getTextCard() {
        return "Avete vinto un terno al lotto: ritirate " + VALUE + "L.";
    }
}

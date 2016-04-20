package com.percydemo.monopoly.board;

import com.percydemo.monopoly.Player;

import java.util.ArrayList;
import java.util.List;

/*
 * Rappresenta la Prigione, in quanto stato di prigionia non di posizione fisica sul tabellone del gioco. 
 * Fisicamente la prigione si trova sulla casella "Transito/Prigione" (classe FreeLocation) del tabellone del monopoli. 
 */
public class Prison {
	//Bozza di come potrebbe essere l'oggetto Prison, non è contemplata la sua gestione nella Release 1
	
    private static final int BAIL = 5000;                     //cauzione
    private final List<Player> prisoners = new ArrayList<>(); //giocatori carcerati

    //Ritorna il valore della cauzione
    public int getBail() {
        return BAIL;
    }        
    
    
    /*
     * Gestione prigionieri
     */
        
    //Imprigiona un player
    public void InToPrison(Player player) {
    	prisoners.add(player);
    }

    //Ritorna true se il player è nella lista dei carcerati
    public boolean contains(Player player) {
        return prisoners.contains(player);
    }

    //Libera un prigioniero
    public void OutOfPrison(Player player) {
    	prisoners.remove(player);
    }
   
}
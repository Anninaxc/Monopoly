package com.percydemo.monopoly.board;

import com.percydemo.monopoly.Player;

/*
 * Rappresenta una generica casella del tabellone del monopoli.
 */
public abstract class GenericLocation {
	
	private final String name; //nome
	
	//Costruttore
    public GenericLocation(String _name) {
        name = _name;
    }
      
    
    //Ritorna il nome della location
    public String getName() {
        return name;
    }
        
    //Gestione di cosa succede a un giocatore che si ferma su questa location
    public abstract void stopHere(Player player);
    
    //Ritorna true se la location si chiama "name"
    public boolean nameEquals(String name) {
        return this.name.equalsIgnoreCase(name);
    }

}
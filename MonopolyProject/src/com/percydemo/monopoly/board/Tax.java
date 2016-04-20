package com.percydemo.monopoly.board;

import com.percydemo.monopoly.Player;

/*
 * Rappresenta una location "Tassa", le location di tale tipo sono: 
 * - tassa di lusso L.10000
 * - tassa patrimoniale L.20000
 */
public class Tax extends GenericLocation{
	
	private final int price; //prezzo della tax
	
	//Costruttore
	public Tax(String _name, int _price){
		super(_name);
		price = _price;
	}
	
	@Override
    public void stopHere(Player player) {
		System.out.println(" --> si sposta sulla casella: " + getName() + ".");
		//il player deve pagare la tassa, dunque decrementare il proprio capitale, ma tale gestione non è prevista nella Release 1
    }

}

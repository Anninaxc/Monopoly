package com.percydemo.monopoly.board;

import com.percydemo.monopoly.Player;

/*
 * Rappresenta una location gratuita, ovvero una casella che non appartiene a nessun giocatore, non ha una rendita,
 * e non impone un pagamento al giocatore in sosta su di essa.
 * Location di questo tipo sono:
 * - posteggio gratuito
 * - transito/prigione -> questa casella è composta da due zone, la prigione e il transito, un giocatore che passa di qui è in transito,
 * un giocatore che passa sulla casella "Vai in prigione" viene spostato qui nella parte della prigione; quando un giocatore in prigione 
 * viene liberato, resta sulla parte di questa casella adibita a transito
 */
public class FreeLocation extends GenericLocation{
	
	//Costruttore
	public FreeLocation(String _name){
		super(_name);
	}
	
	
	@Override
    public void stopHere(Player player) {  
		//quando il giocatore è in sosta su una location di questo tipo, non succede nulla
		System.out.println(" --> si sposta sulla casella: " + getName() + ".");
    }

}

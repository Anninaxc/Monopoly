package com.percydemo.monopoly.board;

/*
 * Rappresenta una casella "Stazione Ferroviaria".
 * Le caselle di questo tipo sono 4: stazione sud, stazione ovest, stazione nord, stazione est.
 */
public class TrainStation extends Property{
	
    private static final int VALUE = 20000;        //valore della stazione
    private static final int INITIAL_RENT = 2500;  //rendita di partenza
    
    //Costruttore
    public TrainStation(String _name, PropertyGroup _pg) {
        super(_name, _pg, VALUE, INITIAL_RENT);
    }
   
}
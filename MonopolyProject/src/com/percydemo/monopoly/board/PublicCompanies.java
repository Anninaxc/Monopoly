package com.percydemo.monopoly.board;

/*
 * Rappresenta una casella "Societ� Pubblica".
 * Le caselle di questo tipo sono 2: societ� acqua potabile, societ� elettrica.
 */
public class PublicCompanies extends Property{
	
    private static final int VALUE = 15000;         //valore della societ�
    private static final int INITIAL_RENT = 2000;   //rendita di partenza
   
    //Costruttore
    public PublicCompanies(String _name, PropertyGroup _pg) {
        super(_name, _pg, VALUE, INITIAL_RENT);
    }
    
}

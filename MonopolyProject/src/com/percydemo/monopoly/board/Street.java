package com.percydemo.monopoly.board;

/*
 * Rappresenta una casella "Strada", ovvero i vari vicoli/viali che compongono il tabellone del monopoli.
 * Inizialmente ciascuna una strada si acquista con solo il terreno, case e alberghi vengono costruiti in seguito.
 */
public class Street extends Property{
	
	//Le seguenti informazioni non servono ai fini della Release 1, ma differenziano Street dalle altre classi che ereditano da Property. 
	//Il numero di case/alberghi costruiti servirebbe per calcolare la rendita della proprietà.
	private final int nHouse;        //numero di case costruite
	private final int nHotel;        //numero di alberghi costruiti
	private final int priceHouse;    //costo di ogni casa
	private final int priceHotel;    //costo di un albergo
   
    //Costruttore
    public Street(String _name, PropertyGroup _pg, int _value, int _iniRent, int _priceHouse, int _priceHotel) {
        super(_name, _pg, _value, _iniRent);
        nHouse = 0;       
    	nHotel = 0;        
    	priceHouse = _priceHouse;    
    	priceHotel = _priceHotel;
    }

}
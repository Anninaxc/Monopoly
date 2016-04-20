package com.percydemo.monopoly.board;

import com.percydemo.monopoly.Player;

/*
 * Rappresenta una proprietà, ovvero una casella che può appartenere a un giocatore, ha un valore, una rendita (differente a seconda di 
 * determinate condizioni), un valore ipotecario. 
 * Esistono diversi tipi di location proprietà (property):
 * - strade
 * - stazioni ferroviarie
 * - società pubbliche.
 * La rendita impone il pagamento di tale cifra al giocatore (non proprietario) in sosta sulla location. Esempi di calcolo:
 * - location = stazione -> la rendita dipende dal numero di stazioni possedute dal giocatore
 * - location = strada -> la rendita dipende dalla strada e dal n di case/alberghi che sono stati costruiti in essa
 */
public abstract class Property extends GenericLocation{
	  
    private final PropertyGroup pGroup;  //gruppo a cui appartiene la proprietà
    
    //Le seguenti informazioni caratterizzano una proprietà ma non servono ai fini dell'implementazione della Release 1
    private final int value;            //valore 
    private final int initialRent;      //rendita iniziale   
    //private final int mortgage;       //valore ipotecario
    //private Player owner;             //player a cui appartiene la location 
    
    
    //Costruttore
    public Property(String _name, PropertyGroup _pGroup, int _value, int _inirent) {
        super(_name);
        pGroup = _pGroup;
        value = _value;
        initialRent = _inirent;
        pGroup.insertIntoGroup(this);
    } 
    
    
    @Override
    public void stopHere(Player player) {
		System.out.println(" --> si ferma sulla casella: " + getName() + ".");
    }
    
   
}
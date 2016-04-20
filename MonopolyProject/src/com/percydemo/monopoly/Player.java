package com.percydemo.monopoly;

import com.percydemo.monopoly.board.*;

/*
 * Rappresenta un singolo giocatore.
 */
public class Player {
		
	private final String name;  //nome
    private int position;       //indice della location su cui si trova
    private int nRound;         //numero di giri, si conta un giro ogni volta che si passa dal VIA
    private final Board board;  //board (tabellone) del monopoli a cui è associato
    
    //Costruttore - primo player che viene associato alla board
    public Player(String _name) {
        this(_name, new Board());
    }

    //Costruttore
    public Player(String _name, Board _board) {
        name = _name;
        board = _board;
        position = 0; //indice della casella VIA!
        nRound = 0;      
    }
    
    
    public String getName() {
        return name;
    }
 
    
    /*
     * Gestione round
     */ 
    public void incrementRound(){
    	nRound ++;
    }
    
    public int getRound(){
    	return nRound;
    }
   
    
    /*
     * Gestione posizione e movimenti
     */ 
    public void setPosition(int _position) {
        position = _position;
    }

    public int getPosition() {
        return position;
    }
    

    //Sposta il player sulla board di tante location quanto vale shift
    //Es. pos attuale= 36, shift= 5 -> newpos= 36+5 = 41 > 40 dimensione board -> isEndRound=True 
    //    -> newpos= 41-40 = 1 infatti il player passa sulle caselle n. 37 38 39 0 1
	public void moveTo(int shift){
		
		int newpos = getPosition() + shift;
		//controllo se lo spostamento in newpos farebbe passare il player dal VIA!
		if (isEndRound(newpos)) {
			//correggo newpos in quanto passando dal via la numerazione delle location riparte da 0
			newpos = newpos - board.getSize(); 
			incrementRound();			
		}
		//sposto il player nella location newpos
		setPosition(newpos);
		
		System.out.print(getName() + " - lancia i dadi: " + shift);
		board.getLocation(board.getNameLocation(newpos)).stopHere(this);
	}

	
	//Ritorna True se il valore _newpos "sfora" la fine della board
	public boolean isEndRound(int _newpos){
		if (_newpos >= board.getSize())
			return true;
		return false;
	}
	 

}
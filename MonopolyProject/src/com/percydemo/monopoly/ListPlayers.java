package com.percydemo.monopoly;

import com.percydemo.monopoly.board.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/*
 * Rappresenta i giocatori coinvolti in un partita.
 */
public class ListPlayers {
	
	//pedine disponibili
    private static final String[] NAMES_PLAYER = { "Ferro da stiro", "Auto", "Barca", "Cane", "Ditale", "Cappello", "Cariola", "Scarpa" };
    
    //numero minimo e massimo di giocatori ammessi
    private static final int MIN_PLAYERS = 2;
    private static final int MAX_PLAYERS = 8;
    
    private final List<Player> listPlayers = new ArrayList<>();
    private final Board board;
    
    //Costruttore
    public ListPlayers(int _nPlayer, Board _board){
    	board = _board;
    	
    	//controlla il numero dei giocatori 
    	checkNumberPlayer(_nPlayer);	
    	
    	//popola la lista dei giocatori (player)
    	for(int i = 0; i < _nPlayer; i++)
            listPlayers.add(new Player(NAMES_PLAYER[i], board));
    	
    	//mescola la lista: ordine casuale dei giocatori --> Release 1,Game Player
        Collections.shuffle(listPlayers);
    }
    
    
    //Controlla se n è compreso tra il MIN_PLAYERS e il MAX_PLAYERS
    private void checkNumberPlayer(int n) {
    	boolean check = true;
		if (n < MIN_PLAYERS)
    		check = false;
    	if (n > MAX_PLAYERS)
    		check = false;
		//se il numero dei giocatori non è valido il gioco fallisce --> Release 1,Game Player
		if (!check){
			System.out.println("Numero di partecipanti non ammesso, impossibile avviare il gioco.");
    		throw new RuntimeException("Error number players");
		}
    }
    
    //Restituisce quanti player stanno giocando
    public int getTotalPlayers() {
        return listPlayers.size();
    }
    
    //Restituisce il player alla posizione i della lista
    public Player getPlayer(int i) {
        return listPlayers.get(i);
    }
    
}
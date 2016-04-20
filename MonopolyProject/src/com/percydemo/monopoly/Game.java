package com.percydemo.monopoly;

import com.percydemo.monopoly.board.Board;

/*
 * Rappresenta il gioco del monopoli.
 * Il gioco finisce quando tutti i giocatori percorrono TOTAL_ROUNDS giri del tabellone di gioco.
 * Un turno di gioco consite nel lanciare i dadi e spostarsi di tot caselle quanto indicato dai dadi.
 * Si utilizzano due dadi alla volta, dunque il più grande "passo" che un giocatore può fare è di 12 caselle.
 * 
 * La Release 1 prevede movimenti lineari (niente salti "vai in prigione", "torna indetro", ecc).
 */
public class Game {
	
	private static final int TOTAL_ROUNDS = 20;      
		
    private final Board board;         //tabellone
    private final RollDies dies;       //dadi
	private final ListPlayers players; //lista giocatori

	private int[] endRounds;           //round completati dai giocatori
	private boolean gameOver;
	private int currentRound;
	
    //Costruttore
    public Game(int numberPlayers){ 	
		board = new Board();
        this.players = new ListPlayers(numberPlayers, board);
        dies = new RollDies(); 			
    }

	//si gioca!
    public void play() {
    	
		gameOver = false;
		inizializeEndRounds();
		
		Player currentPlayer;  
		currentRound= 0;
        int nextRound =currentRound;		
	
		while (!gameOver) {
			
			if (currentRound == nextRound){
				nextRound ++;
				System.out.println("\n*** Round n. " + nextRound + " ***");				
			}
			
			//turno di gioco: ogni player lancia i dadi una volta e si sposta di quanto indicato
			//uso il for per mantenere l'ordine di gioco dei player 
			for (int i=0; i< players.getTotalPlayers(); i++) {				
				currentPlayer = players.getPlayer(i);    		
				currentPlayer.moveTo(dies.roll()); 
				endRounds[i] = currentPlayer.getRound(); 
			}

			//aggiorna il round  
			updateRound();
			
			//quando currentRound viene aggiornato al compimento dell'ultimo giro il gioco finisce
			if (currentRound == (TOTAL_ROUNDS) ) 
				gameOver = true; 
		}
		
		System.out.print("\nPartita finita: "); 
		//controlla che tutti i giocatori abbiano percorso TOTAL_ROUNDS
		if (checkNumberRounds())
			System.out.println("tutti i giocatori hanno percorso " + TOTAL_ROUNDS + " giri");
		else
			System.out.println("qualche giocatore ha percorso pi� di " + TOTAL_ROUNDS + " giri");
    }
	
	
	//Crea la lista endRounds in cui si tiene traccia dei giri completati dai players
	//endRounds[i]= rounds completati dal giocatore che ha indice i nella lista players
	private void inizializeEndRounds(){
		endRounds = new int[players.getTotalPlayers()]; 
		for (int i=0; i< endRounds.length; i++)
			endRounds[i] = 0;
	}
	
		
	//Ritorna true se tutti i player hanno percorso esattamente TOTAL_ROUNDS 
	private boolean checkNumberRounds(){
		int i = 0;
		boolean ok = true;
		do{  
			if (endRounds[i] == (TOTAL_ROUNDS-1)) 
				ok=false;
			i ++;
		}while ((ok) & (i<players.getTotalPlayers())); 
	
		return ok; 
	}
	
	//Aggiorna currentRound se tutti i giocatori hanno completato il giro
	private void updateRound(){
		int i = 0;
		boolean ok = true;
		do{  
			//esce se trova un giocatore che non ha completato currentRound
			if (endRounds[i] == currentRound)
				ok=false; 
			i ++;
		}while ((ok) & (i<players.getTotalPlayers())); 
		
		if (ok)
			currentRound++;		
	}
   
}


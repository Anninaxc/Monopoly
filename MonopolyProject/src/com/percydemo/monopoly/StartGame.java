package com.percydemo.monopoly;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StartGame {
	  
	public static void main(String[] args) throws IOException{
		
		System.out.println("\n**** MONOPOLY ****\n");
		
		//chiede il numero dei giocatori di questa partita
		String input = "";
		int numberPlayers = 0;
		BufferedReader br  = new BufferedReader(new InputStreamReader (System.in));
		boolean done = false;
		System.out.println("Digitare il numero di giocatori e premere INVIO, sono ammessi da 2 a 8 partecipanti");
		while (!done){
			try {		
				input = br.readLine(); 
				numberPlayers = Integer.parseInt(input); 
				done = true;
			}catch (NumberFormatException e) {
				System.out.println("Inserire un numero intero per cortesia.");
				continue;
			}
		}
		
		//crea il nuovo gioco e lo avvia
		try {
			Game newgame = new Game(numberPlayers);	
			newgame.play();		
		}catch (RuntimeException e) {
			if ((e.getMessage().equalsIgnoreCase("Error number players")) || (e.getMessage().equalsIgnoreCase("Error create board")))
				System.exit(0);			
		}	
		
		System.out.println("**** GAME OVER ****");
		System.exit(0);
	}
}

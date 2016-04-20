package com.percydemo.monopoly.board;

import com.percydemo.monopoly.card.*;

import java.util.ArrayList;
import java.util.List;

/*
 * Rappresenta il tabellone del monopoli.
 * Si tenga presente che il tabellone è composto da 40 caselle, così suddivise:
 * 22 strade, 4 stazioni ferroviarie, 2 imprese di pubblica utilità, 1 "vai in prigione", 1 "transito/prigione",
 * 2 tasse, 1 posteggio gratuito, 3 probabilità, 3 imprevisti, e ovviamente la casella VIA da cui parte il gioco.
 */
public class Board {
	
	private static final int TOTAL_LOCATIONS = 40; 
	
	private final List<GenericLocation> locations = new ArrayList<>();	

	//probabilità e imprevisti
	private final CardGroup cards = new CardGroup();
    //stazioni
    private final PropertyGroup trainStations = new PropertyGroup();
    //società pubbliche
    private final PropertyGroup publicCompanies = new PropertyGroup();    
    //strade (in senso antiorario)
    private final PropertyGroup pinkStreets = new PropertyGroup();
    private final PropertyGroup blueStreets = new PropertyGroup();
    private final PropertyGroup orangeStreets = new PropertyGroup();
    private final PropertyGroup brownStreets = new PropertyGroup();
    private final PropertyGroup redStreets = new PropertyGroup();
    private final PropertyGroup yellowStreets = new PropertyGroup();
    private final PropertyGroup greenStreets = new PropertyGroup();
    private final PropertyGroup purpleStreets = new PropertyGroup();       
    //prigione
    private final Prison prison;
    
    
    //Costruttori
    public Board() {
        this(new Prison());
    }

    public Board(Prison _prison) {   
        prison = _prison;
        addLocations();
		checkNumberLocation();
    }

    //Creo la board location per location, rispettandone l'ordine sul tabellone
    private void addLocations() { 	
        locations.add(new FirstLocation());
        locations.add(new Street("Vicolo Corto", pinkStreets, 6000, 200, 5000, 5000)); 
        locations.add(new CardLocation("Probabilità 1", cards));
        locations.add(new Street("Vicolo Stretto", pinkStreets, 6000, 400, 5000, 5000)); 
        locations.add(new Tax("Tassa patrimoniale", 20000));
        locations.add(new TrainStation("Stazione Sud", trainStations));
        locations.add(new Street("Bastioni Gran Sasso", blueStreets, 10000, 600, 5000, 5000));  
        locations.add(new CardLocation("Imprevisto 1", cards));
        locations.add(new Street("Viale Monte Rosa", blueStreets, 10000, 600, 5000, 5000)); 
        locations.add(new Street("Viale Vesuvio", blueStreets, 12000, 800, 5000, 5000));        
        locations.add(new FreeLocation("Transito/Prigione"));
        locations.add(new Street("Via accademia", orangeStreets, 14000, 1000, 10000, 10000));         
        locations.add(new PublicCompanies("Società Elettrica", publicCompanies));
        locations.add(new Street("Corso Ateneo", orangeStreets, 14000, 1000, 10000, 10000));  
        locations.add(new Street("Piazza Università", orangeStreets, 16000, 1200, 10000, 10000));  
        locations.add(new TrainStation("Stazione Ovest", trainStations));
        locations.add(new Street("Via Verdi", brownStreets, 18000, 1400, 10000, 10000)); 
        locations.add(new CardLocation("Probabilità 2", cards));
        locations.add(new Street("Corso Raffaello", brownStreets, 18000, 1400, 10000, 10000)); 
        locations.add(new Street("Piazza Dante", brownStreets, 20000, 1600, 10000, 10000)); 
        locations.add(new FreeLocation("Free Parking"));
        locations.add(new Street("Via Marco Polo", redStreets, 22000, 1800, 15000, 15000)); 
        locations.add(new CardLocation("Imprevisto 2", cards));
        locations.add(new Street("Corso Magellano", redStreets, 22000, 1800, 15000, 15000)); 
        locations.add(new Street("Largo Colombo", redStreets, 24000, 2000, 15000, 15000));
        locations.add(new TrainStation("Stazione Nord", trainStations));
        locations.add(new Street("Viale Costantino", yellowStreets, 26000, 2200, 15000, 15000)); 
        locations.add(new Street("Viale Traiano", yellowStreets, 26000, 2200, 15000, 15000)); 
        locations.add(new PublicCompanies("Società Acqua Potabile", publicCompanies));
        locations.add(new Street("Piazza Giulio Cesare", yellowStreets, 28000, 2400, 15000, 15000));
        locations.add(new GoToPrison(prison));
        locations.add(new Street("Via Roma", greenStreets, 30000, 2600, 20000, 20000)); 
        locations.add(new Street("Corso Impero", greenStreets, 30000, 2600, 20000, 20000)); 
        locations.add(new CardLocation("Probabilità 3", cards));
        locations.add(new Street("Largo Augusto", greenStreets, 32000, 2800, 20000, 20000)); 
        locations.add(new TrainStation("Stazione Est", trainStations));
        locations.add(new CardLocation("Imprevisto 3", cards));
        locations.add(new Street("Viale dei Giardini", purpleStreets, 35000, 3500, 20000, 20000)); 
        locations.add(new Tax("Tassa di lusso", 10000));
        locations.add(new Street("Parco della Vittoria", purpleStreets, 40000, 5000, 20000, 20000));
    }

    //Ritorna il numero di caselle del tabellone di gioco (dimensione board)
    public int getSize() {
        return locations.size();
    }
    
    //Ritorna il nome della casella del tabellone di gioco, dato il suo indice
    public String getNameLocation(int index) {
        GenericLocation location = locations.get(index);
        return location.getName();
    }

	//Controlla la correttezza del numero delle caselle che compongono la board
	public void checkNumberLocation(){
		if (getSize() != TOTAL_LOCATIONS){
			System.out.println("Qualcosa nella creazione del tabellone del Monopoli è andato storto, impossibile avviare il gioco.");
    		throw new RuntimeException("Error create board");
		}
	}
	
	//Ritorna l'indica di una location della board dato il suo nome
    public int getLocationPosition(String name) {
        for (int i = 0; i < getSize(); i++) {
            GenericLocation location = getLocation(i);
            if (location.nameEquals(name))
                return i;
        }
        throw new RuntimeException("no location found with name " + name);
    }

    //Ritorna un'oggetto location della board dato il suo nome
    public GenericLocation getLocation(String _locationName) {
        int position = getLocationPosition(_locationName);
        return getLocation(position);
    }
    
    //Ritorna un'oggetto location della board dato il suo indice
    private GenericLocation getLocation(int i) {
        return locations.get(i);
    }
    
}

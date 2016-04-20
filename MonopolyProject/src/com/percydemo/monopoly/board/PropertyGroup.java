package com.percydemo.monopoly.board;

import java.util.ArrayList;
import java.util.List;

/*
 * Le location proprietà (property) sono divise in gruppi:
 * - strade -> 22 strade, 8 gruppi -> le strade sono divise per colore
 * - stazioni ferroviarie -> 4 stazioni, un unico gruppo 
 * - società pubbliche -> 2 società, 1 unico gruppo
 * 
 * Questa classe rappresenta un insieme di proprietà che fanno parte di un stesso gruppo.
 * Esempio: per calcolare la rendita di una proprietà che appartiene al gruppo "redStreets", occorre sapere quali altre location ne fanno 
 * parte perchè se un player possiede tutte le proprietà di uno stesso gruppo, la rendita del solo terreno viene raddoppiata  
 * (implemento già questo raggruppamento anche se la gestione della rendita non è prevista per la Release 1).  
 */
public class PropertyGroup {
	
    private final List<Property> group = new ArrayList<>();

    public void insertIntoGroup(Property property) {
        group.add(property);
    }

}

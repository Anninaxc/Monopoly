package com.percydemo.monopoly.board;

import java.util.ArrayList;
import java.util.List;

/*
 * Le location propriet� (property) sono divise in gruppi:
 * - strade -> 22 strade, 8 gruppi -> le strade sono divise per colore
 * - stazioni ferroviarie -> 4 stazioni, un unico gruppo 
 * - societ� pubbliche -> 2 societ�, 1 unico gruppo
 * 
 * Questa classe rappresenta un insieme di propriet� che fanno parte di un stesso gruppo.
 * Esempio: per calcolare la rendita di una propriet� che appartiene al gruppo "redStreets", occorre sapere quali altre location ne fanno 
 * parte perch� se un player possiede tutte le propriet� di uno stesso gruppo, la rendita del solo terreno viene raddoppiata  
 * (implemento gi� questo raggruppamento anche se la gestione della rendita non � prevista per la Release 1).  
 */
public class PropertyGroup {
	
    private final List<Property> group = new ArrayList<>();

    public void insertIntoGroup(Property property) {
        group.add(property);
    }

}

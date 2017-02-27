package org.infozesk.exercice_02;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Les classes de base en java
 */
public class E02_3_BaseObjects {
	public static void main(String[] args) {
		ArrayList<Integer> listeEntiers = new ArrayList<>(); // []
		listeEntiers.add(1); // [1]
		listeEntiers.add(3); // [1, 3]
		listeEntiers.remove(0); // [3]
		listeEntiers.size(); // -> 1
		System.out.println("la liste contient " + listeEntiers.size() + " élément");

		HashMap<String, Integer> mois = new HashMap<>();
		mois.put("janvier", 31);
		mois.put("février", 28);
		System.out.println("février a " + mois.get("février") + " jours");
	}
}

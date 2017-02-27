package org.infozesk.exercice_02;

/**
 * Les classes de base en java Les tableaux
 */
public class E02_4_Arrays {
	public static void main(String[] args) {
		// un tableau d'entier de longueur 10
		int[] tableauEntier = new int[10];
		// un tableau de double
		double[] tableauDouble = { 1.0, 2.0, 3.0 };
		// Une matrice de String
		String[][] indices = { { "0-0", "0-1", "0-2" }, { "1-0", "1-1", "1-2" } };

		// Changer la valeur d'un élément
		tableauEntier[0] = 100;

		// Accéder aux élements
		System.out.println(tableauEntier[0]); // affiche 100
		System.out.println(tableauDouble[1]); // affiche 2.0
		System.out.println(indices[1][2]); // affiche 1-2
	}
}

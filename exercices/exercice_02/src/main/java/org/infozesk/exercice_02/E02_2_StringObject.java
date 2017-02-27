package org.infozesk.exercice_02;

/**
 * Les types de base en java
 */
public class E02_2_StringObject {
	public static void main(String[] args) {
		// déclaration et initialisation
		String maChaine = "une chaîne"; // -> "une chaîne"
		// on peut concaténer des chaînes de caractères
		String concat = maChaine + " plus longue";
		// -> "une chaîne plus longue"
		// les méthodes les plus utilisées
		// indexOf: donne l'index de la chaine
		maChaine.indexOf("chaîne"); // -> 4
		// length: donne la longueur de la chaine
		maChaine.length(); // -> 10
		// startsWith / endsWith: renvoie vrai si la chaine commence/finit par
		maChaine.startsWith("une"); // -> true
		maChaine.endsWith("non"); // -> false
		// subString: extrait une partie de la chaîne et la renvoie
		maChaine.substring(4, 10); // -> "chaîne"

		// affichage des résultats
		System.out.println("maChaine= " + maChaine);
		System.out.println("concat= " + concat);
		System.out.println("indexOf(\"chaîne\") -> " + maChaine.indexOf("chaîne"));
		System.out.println("length() -> " + maChaine.length());
		System.out.println("substring(4, 10) -> " + maChaine.substring(4, 10));
	}
}

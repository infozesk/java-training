package org.infozesk.exercice_02;

import java.awt.Point;
import java.util.Arrays;

/**
 * Les classes de base en java Les tableaux
 */
public class E02_6_Methods {

	public static void main(String[] args) {
		////
		// passage par copie pour les types natifs: int / bool / String
		int unEntier = 0;
		// On va tenter de modifier a dans la méthode
		System.out.println("[main]unEntier =" + unEntier);
		passageParametre(unEntier);
		// Au retour dans le main, que vaut le paramètre ?
		System.out.println("[main]unEntier =" + unEntier);

		System.out.println("---");
		String uneChaine = "la phrase";
		System.out.println("[main]uneChaine =" + uneChaine);
		passageParametre(uneChaine);
		System.out.println("[main]uneChaine =" + uneChaine);

		////
		// Les Objets et tableaux sont passés par référence
		// les modifications apportées dans les méthodes
		// modifient l'objet dans le context appelant
		System.out.println("---");
		int[] unTableau = {0, 1, 2, 3, 4};
		System.out.println("[main]unTableau =" + Arrays.toString(unTableau));
		passageParametre(unTableau);
		// unTableau a été changé par la méthode
		System.out.println("[main]unTableau =" + Arrays.toString(unTableau));

		System.out.println("---");
		Point unPoint = new Point(0, 0);
		System.out.println("[main]unPoint =" + unPoint);
		passageParametre(unPoint);
		// unPoint a été changé par la méthode
		System.out.println("[main]unPoint =" + unPoint);
	}

	public static void passageParametre(int unEntier) {
		System.out.println("\t[meth]unEntier = " + unEntier);
		unEntier = unEntier + 1;
		System.out.println("\t[meth]unEntier++;");
		System.out.println("\t[meth]unEntier = " + unEntier);
	}

	public static void passageParametre(String uneChaine) {
		System.out.println("\t[meth]uneChaine = " + uneChaine);
		uneChaine = uneChaine + " est changée";
		System.out.println("\t[meth]uneChaine = uneChaine + \" est changée \";");
		System.out.println("\t[meth]uneChaine = " + uneChaine);
	}

	public static void passageParametre(int[] unTableau) {
		System.out.println("\t[meth]unTableau = " + Arrays.toString(unTableau));
		unTableau[0] = 10;
		System.out.println("\t[meth]unTableau[0] = 10;");
		System.out.println("\t[meth]unTableau = " + Arrays.toString(unTableau));
	}

	public static void passageParametre(Point unPoint) {
		System.out.println("\t[meth]unPoint = " + unPoint);
		unPoint.x = 100;
		System.out.println("\t[meth]unPoint.x = 100;");
		System.out.println("\t[meth]unPoint = " + unPoint);
	}

}

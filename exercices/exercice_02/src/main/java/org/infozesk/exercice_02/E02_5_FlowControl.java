package org.infozesk.exercice_02;

/**
 * Les classes de base en java Les tableaux
 */
public class E02_5_FlowControl {

	public static void main(String[] args) {
		int entier = 1;

		// if then else
		if (entier == 0) {
			System.out.println("Entier vaut 0");
		} else if (entier == 1) {
			System.out.println("Entier vaut 1");
		} else {
			System.out.println("Entier ne vaut ni 0, ni 1");
		}

		// switch/case
		switch (entier) {
		case 0:
			System.out.println("Entier vaut 0");
			break;
		case 1:
			System.out.println("Entier vaut 1");
			break;
		default:
			System.out.println("Entier ne vaut ni 0, ni 1");
			break;
		}

		// boucle for
		int[] array = { 1, 2, 3, 4, 5, 7 };
		// parcours classique
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]= " + array[i]);
		}
		// ou a la mode iterable

		for (int element : array) {
			System.out.println("element: " + element);
		}

		// boucle while
		int i = 0;
		while (i < array.length) {
			System.out.println("array[" + i + "]= " + array[i]);
			i++;
		}
	}
}

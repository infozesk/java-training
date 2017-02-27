package org.infozesk.exercice_02;

/**
 * Les types de base en java
 */
public class E02_1_NativeTypes {
	public static void main(String[] args) {
		// boolean
		boolean unBooleen = false;
		// entiers **non signés**
		// byte | short | int | long
		// 8 | 16 | 32 | 64 bits
		int unEntier = 12;
		// décimaux
		// float | double
		// 32 | 64 bits
		double pi = 3.141592; // Math.PI;
		// Les chaînes de caractères
		// char
		char leCaractereC = 'c';

		System.out.println("unBooleen=" + unBooleen);
		System.out.println("unEntier=" + unEntier);
		System.out.println("pi=" + pi);
		System.out.println("leCaractereC=" + leCaractereC);
	}
}

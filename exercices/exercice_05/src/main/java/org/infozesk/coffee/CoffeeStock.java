package org.infozesk.coffee;

import java.util.ArrayList;

/**
 * Gestion de stock de café<br/>
 */
public class CoffeeStock {

	/**
	 * Les différents types de café
	 */
	static final String[] TYPES_DE_CAFE = { "ristreto", "lungo", "forte", "dulce" };

	/**
	 * Le stock de café par type de café. stock[0] = le stock de "ristreto"
	 */
	int[] stock = { 0, 0, 0, 0 };

	/**
	 * Le prix par type de café
	 */
	double[] prices = { 1.2, 1.3, 1.0, 1.1 };

	/**
	 * Renvoie le stock total de café
	 * 
	 * @return Le stock total de café
	 */
	int getTotalStock() {
		// TODO: renvoyer le stock total de café
		return 0;
	}

	/**
	 * Renvoie la valeur totale du stock.<br>
	 * 
	 * @return La valeur totale du stock
	 */
	int getValeurStock() {
		// TODO: renvoyer le stock total de café
		return 0;
	}

	/**
	 * Renvoie le tableau des types de café à zero.<br>
	 * Les éléments du tableau doivent être dans le même ordre que dans
	 * TYPES_DE_CAFE
	 * 
	 * @return le tableau des types de café à zero.<br>
	 */
	String[] getStockAZero() {
		// Comme on ne connais pas le nombre d'elements à l'avance,
		// il est plus facile d'utiliser une liste
		ArrayList<String> typesAZero = new ArrayList<>();

		// TODO: ajouter à la liste tous les types de café cafés
		// dont
		// le stock est à zero
		// Rappel: pour ajouter un element à une liste:
		// liste.add(element);

		// Renvoie la liste sous forme de tableau
		return typesAZero.toArray(new String[typesAZero.size()]);
	}

	/**
	 * Renvoie le stock du café passé en paramètre
	 * 
	 * @param typeDeCafe
	 *            le type de café dont on veut le stock
	 * @return le stock de ce type de café
	 */
	int getStock(String typeDeCafe) {
		// TODO: renvoyer le stock du café passé en paramètre
		// astuce: utiliser la méthode .indexOf() des tableaux
		//
		return -1;
	}

	/**
	 * Affecte le stock d'un type de café
	 * 
	 * @param typeDeCafé
	 *            Le type de café
	 * @param stock
	 *            Le stock du type de café
	 */
	void setStock(String typeDeCafé, int stock) {
		// TODO: renvoyer le stock du café passé en paramètre
	}

	public static void main(String[] args) {
		CoffeeStock stock = new CoffeeStock();
		stock.stock = new int[] { 12, 14, 20, 0 };
		// affichons le stock total
		CoffeeStock.print("Le stock total est de " + stock.getTotalStock());
		// affichons la valeur totale du stock
		CoffeeStock.print("La valeur du stock est de " + stock.getValeurStock());
		// il faut commander du café?
		for (String s : stock.getStockAZero()) {
			CoffeeStock.print("Il faut commander du " + s);
		}

	}

	/**
	 * Affiche un message, de manière plus concise que System.out.println
	 * 
	 * @param msg
	 *            Les morceaux de message à afficher
	 */
	public static void print(String... msg) {
		System.out.println(String.join("", msg));
	}

}

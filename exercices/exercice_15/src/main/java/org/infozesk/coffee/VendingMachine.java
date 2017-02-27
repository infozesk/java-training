package org.infozesk.coffee;

/**
 * La généralisation d'une machine de vente.
 *
 */
public class VendingMachine {
	/** Le nombre de centimes dans la machine ou crédit */
	private int cents;

	/**
	 * Ajoute 50 centimes au crédit
	 */
	public void add50cents() {
		this.cents = this.cents + 50;
	}

	/**
	 * Ajoute un euro (= 100 centimes) au crédit
	 */
	public void addEuro() {
		add50cents();
		add50cents();
	}

	/**
	 * Renvoie le nombre de centimes dans la machine
	 *
	 * @return Renvoie le nombre de centimes
	 */
	public int getCents() {
		return this.cents;
	}

	/**
	 * Positionne le nombre de centimes dans la machine
	 * 
	 * @param cents
	 *            Le nombre de centimes dans la machine.
	 */
	protected void setCents(int cents) {
		this.cents = cents;
	}

	/**
	 * Remet le compteur à 0, et renvoie le nombre de centimes annulés.
	 *
	 * @return Le nombre de centimes présent <b>avant</b> l'annulation.
	 */
	public int cancelAndGetCents() {
		int centimesAnnules = this.cents;
		this.cents = 0;
		return centimesAnnules;
	}
}

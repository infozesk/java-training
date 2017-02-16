package org.infozesk.coffee;

/**
 * Une machine à café.<br/>
 * L'utilisateur peut: <br/>
 * <ul>
 * <li>Ajouter un euro</li>
 * <li>Ajouter 50 centimes</li>
 * <li>Savoir combien d'euros il y a</li>
 * <li>Annuler et récupérer son argent</li>
 * <li>Commander un café à 1.50 euros</li>
 * </ul>
 */
public class CoffeeMachine {

	/** Le prix d'un café, en centimes */
	public static final int COFFEE_PRICE_IN_CENTS = 150;

	/** Le nombre de centimes dans la machine ou crédit */
	private int cents;

	/**
	 * Ajoute 50 centimes au crédit
	 */
	public void add50cents() {
		this.cents += 50;
	}

	/**
	 * Ajoute un euro (= 100 centimes) au crédit
	 */
	public void addEuro() {
		this.cents += 100;
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
	 * Remet le compteur à 0, et renvoie le nombre de centimes annulés.
	 *
	 * @return Le nombre de centimes présent <b>avant</b> l'annulation.
	 */
	public int cancelAndGetCents() {
		int result = this.cents;
		this.cents = 0;
		return result;
	}

	/**
	 * Si le montant actuel le permet,<br/>
	 * <li>retire le prix du café du crédit,</li>
	 * <li>produit un café,</li>
	 * <li>et renvoie <b>true</b></li> sinon, renvoie <b>false</b>
	 *
	 * @return true si le crédit est suffisant, false sinon
	 */
	public boolean getCoffee() {
		if (this.cents >= COFFEE_PRICE_IN_CENTS) {
			this.cents -= COFFEE_PRICE_IN_CENTS;
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// Utilisation d'une machine à café
		CoffeeMachine machine = new CoffeeMachine();
		System.out.println("un petit café me ferait du bien.");
		System.out.println("J'insère un euro");
		machine.addEuro();
		System.out.println("et un autre euro");
		machine.addEuro();

		if (machine.getCoffee()) {
			System.out.println("voilà mon café");
		} else {
			System.out.println("Ben, il est où mon café? Rend moi ma monnaie !");
		}
		int monnaie = machine.cancelAndGetCents();
		System.out.println("ma monnaie :" + monnaie + " centimes");
	}

}

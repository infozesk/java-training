package org.infozesk.coffee;

public class CoffeeMachine extends VendingMachine {

	/** Le prix d'un café, en centimes */
	public static final int COFFEE_PRICE_IN_CENTS = 150;

	/**
	 * Si le montant actuel le permet,<br/>
	 * <li>retire le prix du café du crédit,</li>
	 * <li>produit un café,</li>
	 * <li>et renvoie <b>true</b></li> sinon, renvoie <b>false</b>
	 *
	 * @return true si le crédit est suffisant, false sinon
	 */
	public boolean getCoffee() {
		if (getCents() >= COFFEE_PRICE_IN_CENTS) {
			setCents(getCents() - COFFEE_PRICE_IN_CENTS);
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

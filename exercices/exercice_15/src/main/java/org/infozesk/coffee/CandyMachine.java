package org.infozesk.coffee;

public class CandyMachine extends VendingMachine {

	/**
	 * Un bonbon crocodile
	 */
	public static final int CROCODILE_TYPE = 0;

	/**
	 * Un bonbon fraise
	 */
	public static final int FRAISE_TYPE = 1;

	/**
	 * Le prix par type de bonbon<br/>
	 * ex: PRIX[CROCODILE_TYPE] donne le prix d'un crocodile
	 */
	public static final int[] PRIX = { 30, 25 };

	/**
	 * Si le montant actuel le permet,<br/>
	 * <li>retire le prix du café du crédit,</li>
	 * <li>produit un café,</li>
	 * <li>et renvoie <b>true</b></li> sinon, renvoie <b>false</b>
	 *
	 * @return true si le crédit est suffisant, false sinon
	 */
	public boolean getCandy(int typeDeBonbon) {
		// TODO: écrire la fonction.
		// attention le type de bonbon peut ne pas etre entre 0 et PRIX.length !
		return false;
	}

	public static void main(String[] args) {
		// Utilisation d'une machine à café
		CandyMachine machine = new CandyMachine();
		System.out.println("un petit bonbon me ferait du bien.");
		System.out.println("J'insère un euro");
		machine.addEuro();
		System.out.println("et un autre euro");
		machine.addEuro();

		if (machine.getCandy(CROCODILE_TYPE)) {
			System.out.println("voilà mon crocodile");
		} else {
			System.out.println("Ben, il est où mon croco? Rend moi ma monnaie !");
		}
		if (machine.getCandy(FRAISE_TYPE)) {
			System.out.println("voilà ma fraise");
		} else {
			System.out.println("Ben, elle est où ma fraise? Rend moi ma monnaie !");
		}
		int monnaie = machine.cancelAndGetCents();
		System.out.println("ma monnaie :" + monnaie + " centimes");
	}
}

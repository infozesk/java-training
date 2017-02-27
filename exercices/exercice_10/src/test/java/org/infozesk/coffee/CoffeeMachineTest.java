package org.infozesk.coffee;

import org.junit.Assert;
import org.junit.Test;

/**
 * Teste la classe CoffeeMachine
 *
 */
public class CoffeeMachineTest {

	@Test
	public void testAdd50cents() {
		CoffeeMachine machine = new CoffeeMachine();
		// A l'initialisation, il y a 0
		int expectedCents = 0;
		Assert.assertEquals(expectedCents, machine.getCents());
		// En ajoutant 50, on s'attend à trouver 50 cents
		machine.add50cents();
		expectedCents += 50;
		Assert.assertEquals(expectedCents, machine.getCents());

		// En ajoutant 50, on s'attend à trouver 100 cents
		machine.add50cents();
		expectedCents += 50;
		Assert.assertEquals(100, machine.getCents());
	}

	@Test
	public void testAddEuro() {
		CoffeeMachine machine = new CoffeeMachine();
		// A l'initialisation, il y a 0
		int expectedCents = 0;
		Assert.assertEquals(expectedCents, machine.getCents());
		// En ajoutant 1 euros, on s'attend à trouver 100 cents
		machine.addEuro();
		expectedCents += 100;
		Assert.assertEquals(expectedCents, machine.getCents());

		// En ajoutant 1 euros, on s'attend à trouver 200 cents
		machine.addEuro();
		expectedCents += 100;
		Assert.assertEquals(expectedCents, machine.getCents());
	}

	@Test
	public void testGetCents() {
		CoffeeMachine machine = new CoffeeMachine();
		// A l'initialisation, il y a 0
		int expectedCents = 0;
		Assert.assertEquals(expectedCents, machine.getCents());
		// En ajoutant 1 euros, on s'attend à trouver 100 cents
		machine.addEuro();
		expectedCents += 100;
		Assert.assertEquals(expectedCents, machine.getCents());

		// En ajoutant 50 cents, on s'attend à trouver 150 cents
		machine.add50cents();
		expectedCents += 50;
		Assert.assertEquals(expectedCents, machine.getCents());
	}

	@Test
	public void testCancelAndGetCents() {
		CoffeeMachine machine = new CoffeeMachine();
		// A l'initialisation, on récupère 0
		int expectedCents = 0;
		Assert.assertEquals(expectedCents, machine.cancelAndGetCents());
		Assert.assertEquals(0, machine.cancelAndGetCents());
		// Si on ajoute 50cts et qu'on annule,
		// on récupère 50 centimes
		// et il reste 0 en machine
		machine.add50cents();
		expectedCents = 50;
		Assert.assertEquals(expectedCents, machine.cancelAndGetCents());
		Assert.assertEquals(0, machine.cancelAndGetCents());
		// Si on ajoute 150cts et qu'on annule,
		// on récupère 150 centimes
		// et il reste 0 en machine
		machine.addEuro();
		machine.add50cents();
		expectedCents = 150;
		Assert.assertEquals(expectedCents, machine.cancelAndGetCents());
		Assert.assertEquals(0, machine.cancelAndGetCents());
	}

	@Test
	public void testGetCoffee() {
		CoffeeMachine machine = new CoffeeMachine();
		// A l'initialisation, on n'obtient pas de café
		Assert.assertFalse(machine.getCoffee());
		// Si on insère 50 centimes on n'obtient pas de café
		// mais on a toujours ses 50 centimes
		machine.add50cents();
		Assert.assertFalse(machine.getCoffee());
		Assert.assertEquals(50, machine.getCents());
		// Si on inère un euros de plus, on obtient bien un café
		// et il n'y a plus d'argent dans la machine
		machine.addEuro();
		Assert.assertTrue(machine.getCoffee());
		Assert.assertEquals(0, machine.getCents());
	}

}

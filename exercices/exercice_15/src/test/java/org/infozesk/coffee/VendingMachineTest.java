package org.infozesk.coffee;

import org.junit.Assert;
import org.junit.Test;

/**
 * Teste la classe VendingMachine
 */
public class VendingMachineTest {

	@Test
	public void testAdd50cents() {
		VendingMachine machine = new VendingMachine();
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
		VendingMachine machine = new VendingMachine();
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
		VendingMachine machine = new VendingMachine();
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
		VendingMachine machine = new VendingMachine();
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
	public void testSetCents() {
		VendingMachine machine = new VendingMachine();
		for (int cents : new int[] { 100, 101, 1000 }) {
			machine.setCents(cents);
			Assert.assertEquals(cents, machine.getCents());
		}
	}

}

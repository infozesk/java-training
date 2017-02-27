package org.infozesk.coffee;

import org.junit.Assert;
import org.junit.Test;

/**
 * Teste la classe CoffeeMachine
 *
 */
public class CoffeeMachineTest {

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

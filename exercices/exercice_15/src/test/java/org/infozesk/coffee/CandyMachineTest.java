package org.infozesk.coffee;

import org.junit.Assert;
import org.junit.Test;

public class CandyMachineTest {

	@Test
	public void testGetCandy() {
		CandyMachine machine = new CandyMachine();
		Assert.assertFalse(machine.getCandy(CandyMachine.CROCODILE_TYPE));
		Assert.assertFalse(machine.getCandy(CandyMachine.FRAISE_TYPE));
		// un euro permet d'acheter 4 fraises
		machine.addEuro();
		Assert.assertTrue(machine.getCandy(CandyMachine.FRAISE_TYPE));
		Assert.assertTrue(machine.getCandy(CandyMachine.FRAISE_TYPE));
		Assert.assertTrue(machine.getCandy(CandyMachine.FRAISE_TYPE));
		Assert.assertTrue(machine.getCandy(CandyMachine.FRAISE_TYPE));
		// Pas plus de quatre
		Assert.assertFalse(machine.getCandy(CandyMachine.FRAISE_TYPE));
		// un euro permet d'acheter 3 crocos
		machine.addEuro();
		Assert.assertTrue(machine.getCandy(CandyMachine.CROCODILE_TYPE));
		Assert.assertTrue(machine.getCandy(CandyMachine.CROCODILE_TYPE));
		Assert.assertTrue(machine.getCandy(CandyMachine.CROCODILE_TYPE));
		Assert.assertFalse(machine.getCandy(CandyMachine.CROCODILE_TYPE));
		// et il reste 10cts
		Assert.assertEquals(10, machine.getCents());
	}

	@Test
	public void testMain() {
		CandyMachine.main(new String[0]);
	}

}

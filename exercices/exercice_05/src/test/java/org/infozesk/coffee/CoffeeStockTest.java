package org.infozesk.coffee;

import org.junit.Assert;
import org.junit.Test;

public class CoffeeStockTest {

	@Test
	public void testGetTotalStock() {
		CoffeeStock cs = new CoffeeStock();
		Assert.assertEquals(0, cs.getTotalStock());
		cs.stock = new int[] { 1, 2, 3, 4 };
		Assert.assertEquals(10, cs.getTotalStock());
	}

	@Test
	public void testGetValeurStock() {
		CoffeeStock cs = new CoffeeStock();
		Assert.assertEquals(0, cs.getValeurStock());
		cs.stock = new int[] { 1, 2, 3, 4 };
		cs.prices = new double[] { 1., 10., 100., 1000. };
		Assert.assertEquals(4321, cs.getValeurStock());
	}

	@Test
	public void testGetStockAZero() {
		CoffeeStock cs = new CoffeeStock();
		Assert.assertArrayEquals(CoffeeStock.TYPES_DE_CAFE, cs.getStockAZero());
		cs.stock = new int[] { 1, 0, 3, 0 };
		Assert.assertArrayEquals("lungo dulce".split(" "), cs.getStockAZero());
		cs.stock = new int[] { 0, 0, 3, 0 };
		Assert.assertArrayEquals("ristreto lungo dulce".split(" "), cs.getStockAZero());
	}

	@Test
	public void testGetStock() {
		CoffeeStock cs = new CoffeeStock();
		cs.stock = new int[] { 1, 2, 3, 4 };
		int expected = 1;
		for (String cafe : CoffeeStock.TYPES_DE_CAFE) {
			Assert.assertEquals(expected, cs.getStock(cafe));
			expected++;
		}
	}

	@Test
	public void testSetStock() {
		CoffeeStock cs = new CoffeeStock();
		int expected = 100;
		for (String cafe : CoffeeStock.TYPES_DE_CAFE) {
			cs.setStock(cafe, expected);
			Assert.assertEquals(expected, cs.getStock(cafe));
			expected = expected + 100;
		}
	}

	@Test
	public void testMain() {
		// simply call the main, and expect nothing
		CoffeeStock.main(new String[0]);
	}

	@Test
	public void testPrint() {
		CoffeeStock.print("a message", " is split");
	}

}

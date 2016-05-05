package de.itter.maths;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class AlgorithmsTest {

	@Test
	public void testGCD() {

		assertEquals(14, Algorithms.gcd(123242, 546742));
	}

	@Test
	public void testLCM() {
		assertEquals(351, Algorithms.lcm(27, 13));
	}

	public void testFac() {
		assertEquals(new BigInteger("720"), Algorithms.fac(6));
	}

}

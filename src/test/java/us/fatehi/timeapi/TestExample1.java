/**
 * Copyright 2014 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestExample1 {

	private Example1 example1;

	@Before
	public void setup() {
		example1 = new Example1();
	}

	@Test
	public void testMonthLengths() {

		assertEquals(
				Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31),
				example1.getMonthLengths(2014));

		assertEquals(
				Arrays.asList(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31),
				example1.getMonthLengths(2012));
	}

}

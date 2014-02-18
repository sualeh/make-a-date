/**
 * Copyright 2014 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.threeten.bp.LocalDate;
import org.threeten.bp.Month;

public class TestQuestion2 {

	private Question2 question2;

	@Before
	public void setup() {
		question2 = new Question2();
	}

	@Test
	public void testPreviousThursday() {

		// 1. Test null
		assertNull(question2.previousThursday(null));

		// 2. Test a Friday
		assertEquals(LocalDate.of(2014, Month.FEBRUARY, 20),
				question2.previousThursday(LocalDate.of(2014, Month.FEBRUARY,
						21)));

		// 3. Test a Thursday
		assertEquals(LocalDate.of(2014, Month.FEBRUARY, 20),
				question2.previousThursday(LocalDate.of(2014, Month.FEBRUARY,
						27)));
	}

}

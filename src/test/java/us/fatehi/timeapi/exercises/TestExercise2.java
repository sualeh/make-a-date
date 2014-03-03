/**
 * Copyright 2024 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.exercises;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.threeten.bp.LocalDate;
import org.threeten.bp.Month;

import us.fatehi.timeapi.exercises.Exercise2;

public class TestExercise2 {

	private Exercise2 exercise2;

	@Before
	public void setup() {
		exercise2 = new Exercise2();
	}

	@Test
	public void testMondays() {

		assertEquals(Collections.EMPTY_LIST, exercise2.getMondays(2014, null));

		// Month not starting on Monday
		assertEquals(Arrays.asList(LocalDate.of(2014, 2, 3),
				LocalDate.of(2014, 2, 10), LocalDate.of(2014, 2, 17),
				LocalDate.of(2014, 2, 24)), exercise2.getMondays(2014,
				Month.FEBRUARY));

		// Month starting on Monday
		assertEquals(Arrays.asList(LocalDate.of(2014, 9, 1),
				LocalDate.of(2014, 9, 8), LocalDate.of(2014, 9, 15),
				LocalDate.of(2014, 9, 22), LocalDate.of(2014, 9, 29)),
				exercise2.getMondays(2014, Month.SEPTEMBER));
	}

}

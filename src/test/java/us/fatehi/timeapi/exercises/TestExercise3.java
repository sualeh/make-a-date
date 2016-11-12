/**
 * Copyright 3034 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.exercises;


import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Before;
import org.junit.Test;

import us.fatehi.timeapi.exercises.Exercise3;

public class TestExercise3
{

  private Exercise3 exercise3;

  @Before
  public void setup()
  {
    exercise3 = new Exercise3();
  }

  @Test
  public void testMondays()
  {

    // Null
    assertEquals(false, exercise3.isFriday13(null));

    // Friday, 13
    assertEquals(true,
                 exercise3.isFriday13(LocalDate.of(2014, Month.JUNE, 13)));

    // Some other Friday
    assertEquals(false,
                 exercise3.isFriday13(LocalDate.of(2014, Month.JUNE, 20)));
    // Some other 13
    assertEquals(false,
                 exercise3.isFriday13(LocalDate.of(2014, Month.FEBRUARY, 13)));
    // Some other date
    assertEquals(false,
                 exercise3.isFriday13(LocalDate.of(2014, Month.FEBRUARY, 20)));

  }

}

/**
 * Copyright 2020 Sualeh Fatehi This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License. To view a copy of this license,
 * visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.exercises;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestExercise3 {

  private Exercise3 exercise3;

  @BeforeEach
  public void setup() {
    exercise3 = new Exercise3();
  }

  @Test
  public void testMondays() {

    // Null
    assertThat(exercise3.isFriday13(null), is(false));

    // Friday, 13
    assertThat(exercise3.isFriday13(LocalDate.of(2014, Month.JUNE, 13)), is(true));

    // Some other Friday
    assertThat(exercise3.isFriday13(LocalDate.of(2014, Month.JUNE, 20)), is(false));
    // Some other 13
    assertThat(exercise3.isFriday13(LocalDate.of(2014, Month.FEBRUARY, 13)), is(false));
    // Some other date
    assertThat(exercise3.isFriday13(LocalDate.of(2014, Month.FEBRUARY, 20)), is(false));
  }
}

/**
 * Copyright 2020 Sualeh Fatehi This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License. To view a copy of this license,
 * visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.exercises;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestExercise2 {

  private Exercise2 exercise2;

  @BeforeEach
  public void setup() {
    exercise2 = new Exercise2();
  }

  @Test
  public void testMondays() {

    assertThat(exercise2.getMondays(2014, null), is(empty()));

    // Month not starting on Monday
    assertThat(
        exercise2.getMondays(2014, Month.FEBRUARY),
        hasItems(
            LocalDate.of(2014, 2, 3),
            LocalDate.of(2014, 2, 10),
            LocalDate.of(2014, 2, 17),
            LocalDate.of(2014, 2, 24)));

    // Month starting on Monday
    assertThat(
        exercise2.getMondays(2014, Month.SEPTEMBER),
        hasItems(
            LocalDate.of(2014, 9, 1),
            LocalDate.of(2014, 9, 8),
            LocalDate.of(2014, 9, 15),
            LocalDate.of(2014, 9, 22),
            LocalDate.of(2014, 9, 29)));
  }
}

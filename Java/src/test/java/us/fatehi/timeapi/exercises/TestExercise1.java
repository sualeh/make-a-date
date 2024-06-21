/**
 * Copyright 2020 Sualeh Fatehi This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License. To view a copy of this license,
 * visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.exercises;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestExercise1 {

  private Exercise1 exercise1;

  @BeforeEach
  public void setup() {
    exercise1 = new Exercise1();
  }

  @Test
  public void testMonthLengths() {

    assertThat(
        exercise1.getMonthLengths(2014), hasItems(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));

    assertThat(
        exercise1.getMonthLengths(2012), hasItems(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31));
  }
}

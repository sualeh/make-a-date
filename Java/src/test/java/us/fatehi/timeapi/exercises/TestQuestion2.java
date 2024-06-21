/**
 * Copyright 2020 Sualeh Fatehi This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License. To view a copy of this license,
 * visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.exercises;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestQuestion2 {

  private Question2 question2;

  @BeforeEach
  public void setup() {
    question2 = new Question2();
  }

  @Test
  public void testPreviousThursday() {

    // 1. Test null
    assertThat(question2.previousThursday(null), is(nullValue()));

    // 2. Test a Friday
    assertThat(
        question2.previousThursday(LocalDate.of(2014, Month.FEBRUARY, 21)),
        is(LocalDate.of(2014, Month.FEBRUARY, 20)));

    // 3. Test a Thursday
    assertThat(
        question2.previousThursday(LocalDate.of(2014, Month.FEBRUARY, 27)),
        is(LocalDate.of(2014, Month.FEBRUARY, 20)));
  }
}

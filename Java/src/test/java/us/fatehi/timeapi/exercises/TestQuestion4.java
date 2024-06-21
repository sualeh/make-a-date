/**
 * Copyright 2020 Sualeh Fatehi This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License. To view a copy of this license,
 * visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.exercises;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestQuestion4 {

  private static final LocalDateTime testDateTime =
      LocalDateTime.of(LocalDate.of(2014, Month.DECEMBER, 28), LocalTime.of(10, 30));
  private Question4 question4;
  private ZoneId systemZoneId;
  private ZoneId otherZoneId;

  @BeforeEach
  public void setup() {
    question4 = new Question4();

    systemZoneId = ZoneId.systemDefault();
    otherZoneId = ZoneId.of("Europe/Paris");
  }

  @Test
  public void testAtZone() {
    // 1. Test null
    assertThat(question4.atZone(null, null), is(nullValue()));

    // 2. Test an instant in the system default timezone
    final Instant testInstant1 = testDateTime.toInstant(getZoneOffset(systemZoneId));
    assertThat(
        question4.atZone(testInstant1, null), is(ZonedDateTime.of(testDateTime, systemZoneId)));

    // 3. Test an instant in some other timezone
    final Instant testInstant2 = testDateTime.toInstant(getZoneOffset(otherZoneId));
    assertThat(
        question4.atZone(testInstant2, otherZoneId),
        is(ZonedDateTime.of(testDateTime, otherZoneId)));
  }

  @Test
  public void testToInstant() {

    // 1. Test null
    assertThat(question4.toInstant(null), is(nullValue()));

    // 2. Test an instant in the system default timezone
    final Instant testInstant1 = testDateTime.toInstant(getZoneOffset(systemZoneId));
    assertThat(question4.toInstant(testDateTime.atZone(systemZoneId)), is(testInstant1));

    // 3. Test an instant in some other timezone
    final Instant testInstant2 = testDateTime.toInstant(getZoneOffset(otherZoneId));
    assertThat(question4.toInstant(testDateTime.atZone(otherZoneId)), is(testInstant2));
  }

  private ZoneOffset getZoneOffset(final ZoneId zoneId) {
    return zoneId.getRules().getOffset(testDateTime);
  }
}

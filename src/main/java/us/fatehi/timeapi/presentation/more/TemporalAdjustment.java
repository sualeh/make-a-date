/**
 * Copyright 2014-2016 Sualeh Fatehi This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License. To view a copy of this license,
 * visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.presentation.more;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjustment {

  public static void main(final String[] args) {

    final TemporalAdjuster fourMinutesLater =
        new TemporalAdjuster() {
          @Override
          public Temporal adjustInto(final Temporal temporal) {
            return temporal.plus(4, ChronoUnit.MINUTES);
          }
        };

    final LocalTime time = LocalTime.of(12, 0, 0); // 12:00
    final LocalTime laterTime = time.with(fourMinutesLater); // 12:04
    System.out.println("time: " + time);
    System.out.println("adjusted time: " + laterTime);
  }
}

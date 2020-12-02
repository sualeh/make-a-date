/**
 * Copyright 2014-2016 Sualeh Fatehi This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License. To view a copy of this license,
 * visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.experiments;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;

public class DateTimeLimits {

  public static void main(final String[] args) {
    System.out.println("EPOCH = " + Instant.EPOCH);
    System.out.println("MAX = " + Instant.MAX);
    System.out.println("MIN = " + Instant.MIN);

    final LocalDate localDate = Instant.MAX.atOffset(ZoneOffset.UTC).toLocalDate();
    System.out.println(localDate);
  }
}

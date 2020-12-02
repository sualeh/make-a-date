/**
 * Copyright 2014-2016 Sualeh Fatehi This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License. To view a copy of this license,
 * visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.experiments;

import static java.util.Calendar.DATE;
import static java.util.Calendar.HOUR;
import static java.util.Calendar.MINUTE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class OldCalendarChangingTimeZone {

  private static final DateFormat format =
      SimpleDateFormat.getDateTimeInstance(
          DateFormat.LONG, DateFormat.LONG, Locale.getDefault(Locale.Category.FORMAT));

  public static void main(final String[] args) {

    System.out.println(
        "java.util.Calendar: Changing the time zone changes does not change the internal representation");

    TimeZone nyTz = TimeZone.getTimeZone("America/New_York");
    TimeZone.setDefault(nyTz);
    System.out.println("System default timezone: " + nyTz.getID());
    final GregorianCalendar date = new GregorianCalendar(2014, 11, 12);
    print(date);
    System.out.println(
        String.format(
            "DEBUG fields: %d-%d-%d %d:%d TZ %d",
            date.get(YEAR),
            date.get(MONTH),
            date.get(DATE),
            date.get(HOUR),
            date.get(MINUTE),
            date.getTimeZone().getRawOffset()));

    // Move to another system, with another timezone
    TimeZone calcuttaTz = TimeZone.getTimeZone("Asia/Calcutta");
    TimeZone.setDefault(calcuttaTz);
    System.out.println("Changing to new system default timezone: " + calcuttaTz.getID());
    print(date);
    System.out.println(
        String.format(
            "DEBUG fields: %d-%d-%d %d:%d TZ %d",
            date.get(YEAR),
            date.get(MONTH),
            date.get(DATE),
            date.get(HOUR),
            date.get(MINUTE),
            date.getTimeZone().getRawOffset()));
  }

  private static void print(final GregorianCalendar date) {
    System.out.println(format.format(date.getTime()));
  }
}

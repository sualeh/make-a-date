/**
 * Copyright 2014-2016 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.presentation.apiproblems;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class NewDateApiSnippets
  implements ApiSnippets
{

  @Override
  public void _problemsWithDate()
  {
    System.out.println("Java 8 Date and Time API");
    System.out.println("LocalDate.of(12, 12, 12)");

    System.out.println(LocalDate.of(12, 12, 12));
    // 0012-12-12

    // No problems here:
    // 1. ISO 8601 order of fields - year, month, day.
    // 2. Month 12 is for December.
    // 3. Year is really 12 AD.
    // 4. No time component.
    // 5. No timezone component.
  }

  @Override
  public void changingTimeZone()
  {
    System.out.println("changingTimeZone:");

    final ZonedDateTime date = ZonedDateTime
      .of(LocalDateTime.of(12, 12, 12, 0, 0, 0), ZoneId.systemDefault());
    System.out.println(date);

    // Move to another system, with another timezone
    TimeZone.setDefault(TimeZone.getTimeZone("Asia/Calcutta"));
    System.out.println(date);
  }

  public void changingTimeZone2()
  {
    System.out.println("changingTimeZone2:");

    TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));

    final ZonedDateTime date = ZonedDateTime
      .of(LocalDateTime.of(2014, 12, 12, 0, 0, 0), ZoneId.systemDefault());
    System.out.println(date);

    // Change timezone
    final ZonedDateTime withZoneSameDate = date
      .withZoneSameInstant(ZoneId.of("Asia/Calcutta"));
    System.out.println(withZoneSameDate);
  }

  @Override
  public void printAdditionalInformation()
  {
    problemsWithDate2();
    changingTimeZone();
    changingTimeZone2();
  }

  public void problemsWithDate2()
  {
    try
    {
      System.out.println(LocalDate.of(13, 13, 13));
    }
    catch (final Exception e)
    {
      e.printStackTrace();
    }
  }

}

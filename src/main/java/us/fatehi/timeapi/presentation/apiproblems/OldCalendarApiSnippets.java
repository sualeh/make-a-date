/**
 * Copyright 2014-2016 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.presentation.apiproblems;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class OldCalendarApiSnippets
  implements ApiSnippets
{

  public static void main(final String[] args)
  {
    final ApiSnippets oldCalendar = new OldCalendarApiSnippets();
    oldCalendar._problemsWithDate();
    System.out.println();

    oldCalendar.changingTimeZone();
  }

  private final DateFormat format = SimpleDateFormat
    .getDateTimeInstance(DateFormat.LONG,
                         DateFormat.LONG,
                         Locale.getDefault(Locale.Category.FORMAT));

  @Override
  public void _problemsWithDate()
  {
    System.out.println(new GregorianCalendar(12, 12, 12));
    // Prints internals

    print(new GregorianCalendar(12, 12, 12));
    // January 12, 0013 12:00:00 AM EST

    // Several problems here:
    // 1. Which 12 is for which date field?
    // 2. Month 12 is December, right? No. January.
    // 3. They got the year right! Almost. 13 CE.
    // 4. Wait - there is a time in a calendar?
    // 5. More than that, there is a time zone.

  }

  @Override
  public void changingTimeZone()
  {
    final GregorianCalendar calendarDate = new GregorianCalendar(10, 10, 10);
    print(calendarDate);

    // Move to another system, with another timezone
    TimeZone.setDefault(TimeZone.getTimeZone("Asia/Calcutta"));
    print(calendarDate);
  }

  private void print(final GregorianCalendar calendarDate)
  {
    System.out.println(format.format(calendarDate.getTime()));
  }

}

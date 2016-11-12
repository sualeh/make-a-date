package us.fatehi.timeapi.exercises;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Given a random date, how would you find the date of the previous
 * Thursday?
 */
public class Question2
{

  public LocalDate previousThursday(final LocalDate date)
  {
    final LocalDate previousThursday;
    if (date == null)
    {
      previousThursday = null;
    }
    else
    {
      previousThursday = date
        .with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
    }
    return previousThursday;
  }

}

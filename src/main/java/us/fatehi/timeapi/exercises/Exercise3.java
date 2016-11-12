package us.fatehi.timeapi.exercises;


import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Write an example that tests whether a given date occurs on Friday the
 * 13th. See <a href=
 * "http://docs.oracle.com/javase/tutorial/datetime/iso/QandE/FridayThirteenQuery.java">
 * FridayThirteenQuery.java</a> and <a href=
 * "http://docs.oracle.com/javase/tutorial/datetime/iso/QandE/Superstitious.java">
 * Superstitious.java</a> to see how to do this with queries.
 */
public class Exercise3
{

  public boolean isFriday13(final LocalDate date)
  {
    if (date == null)
    {
      return false;
    }
    else
    {
      return date.getDayOfWeek() == DayOfWeek.FRIDAY
             && date.getDayOfMonth() == 13;
    }
  }

}

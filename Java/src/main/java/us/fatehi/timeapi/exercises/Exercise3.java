package us.fatehi.timeapi.exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Write an example that tests whether a given date occurs on Friday the 13th.
 *
 * @see <a href=
 *     "http://docs.oracle.com/javase/tutorial/datetime/iso/QandE/FridayThirteenQuery.java">
 *     FridayThirteenQuery.java</a>
 * @see <a href= "http://docs.oracle.com/javase/tutorial/datetime/iso/QandE/Superstitious.java">
 *     Superstitious.java</a> for how to do this with queries
 */
public class Exercise3 {

  public boolean isFriday13(final LocalDate date) {
    if (date == null) {
      return false;
    } else {
      return date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13;
    }
  }
}

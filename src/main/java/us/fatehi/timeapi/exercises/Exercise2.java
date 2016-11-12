package us.fatehi.timeapi.exercises;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

/**
 * Display all of the Mondays in the current year and the specified
 * month. See <a href=
 * "http://docs.oracle.com/javase/tutorial/datetime/iso/QandE/ListMondays.java">
 * ListMondays.java</a>
 */
public class Exercise2
{

  public List<LocalDate> getMondays(final int year, final Month month)
  {
    final List<LocalDate> mondays = new ArrayList<>();
    if (month == null)
    {
      return mondays;
    }
    LocalDate date = LocalDate.of(year, month, 1)
      .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
    Month monthForDate = date.getMonth();
    while (monthForDate == month)
    {
      mondays.add(date);
      date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
      monthForDate = date.getMonth();
    }
    return mondays;
  }

}

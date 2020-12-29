package us.fatehi.timeapi.presentation.more;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * See <a href= "https://today.java.net/pub/a/today/2008/09/18/jsr-310-new-java-date-time-api.html"
 * >JSR 310: A New Java Date/Time API</a> Durations: A duration represents a length of elapsed time,
 * defined to the nanosecond level; for example, "100,000 nanoseconds" is a duration. Durations are
 * somewhat similar to periods, which also define a length of elapsed time; however, unlike periods,
 * durations represent a precise number of elapsed nanoseconds. Periods: Like durations, periods
 * represent a length of elapsed time. Examples of periods are "4 years, 8 days," and "1 hour." As
 * shown by these examples, periods are defined using calendar fields (years, days, hours, etc.),
 * rather than by an exact number of nanoseconds.
 */
public class PeriodsAndDurations {

  public static void main(final String[] args) {
    final PeriodsAndDurations periodsAndDurations = new PeriodsAndDurations();
    periodsAndDurations.acrossDSTBoundary();
    periodsAndDurations.duration();
  }

  /**
   * Adding a period of 1 day versus a duration of 1 day to a time close to change-over from
   * standard time to daylight savings time can result in different answers.
   */
  public void acrossDSTBoundary() {

    final ZonedDateTime mar8 =
        ZonedDateTime.of(
            LocalDate.of(2014, Month.MARCH, 8),
            LocalTime.of(23, 30),
            ZoneId.of("America/New_York"));
    System.out.println("Date and time: " + mar8);

    final Period period = Period.ofDays(1);
    final Duration duration = Duration.of(1, ChronoUnit.DAYS);

    final ZonedDateTime monthAfterMar8_1 = ZonedDateTime.from(period.addTo(mar8));
    System.out.println("Adding period of one day: " + monthAfterMar8_1);

    final ZonedDateTime monthAfterMar8_2 = ZonedDateTime.from(duration.addTo(mar8));
    System.out.println("Adding period of one day: " + monthAfterMar8_2);
  }

  /**
   * A month is of variable length, and durations cannot be of estimated value.
   *
   * @throws DateTimeException
   */
  public void duration() {
    // Throws exception
    Duration.of(1, ChronoUnit.MONTHS);
  }
}

package us.fatehi.timeapi.presentation.apiproblems;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Conversions {

  /**
   * @link <a href="https://www.baeldung.com/migrating-to-java-8-date-time-api">Migrating to the New
   *     Java 8 Date Time API </a>
   * @param args
   */
  public static void main(final String[] args) {
    final Instant instantFromCalendar = GregorianCalendar.getInstance().toInstant();
    final ZonedDateTime zonedDateTimeFromCalendar = new GregorianCalendar().toZonedDateTime();
    final Date dateFromInstant = Date.from(Instant.now());
    final GregorianCalendar calendarFromZonedDateTime = GregorianCalendar.from(ZonedDateTime.now());
    final Instant instantFromDate = new Date().toInstant();
    final ZoneId zoneIdFromTimeZone = TimeZone.getTimeZone("PST").toZoneId();
  }
}

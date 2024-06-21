package us.fatehi.timeapi.experiments;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 * http://www.javaworld.com/article/2078757/java-se/java-se-java-101-the-next-generation-it-s-time-for-a-change.html?page=7
 */
public class HumanTimeDemo {

  public static void main(final String[] args) {
    ZoneId zid = ZoneId.systemDefault();
    System.out.printf("Zone Id = %s%n", zid);
    System.out.printf("Rules = %s%n", zid.getRules());
    System.out.printf("DST in effect: %b%n", zid.getRules().isDaylightSavings(Instant.now()));

    zid = ZoneId.of("Europe/Paris");
    System.out.printf("Zone Id = %s%n", zid);

    ZoneOffset zoffset = ZoneOffset.of("+06:00");
    System.out.printf("Zone Offset = %s%n", zoffset);
    System.out.printf("Total seconds = %d%n", zoffset.getTotalSeconds());

    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.printf("Zoned date and time = %s%n", zonedDateTime);
    System.out.printf("Zone = %s%n", zonedDateTime.getZone());

    zoffset = ZoneOffset.from(zonedDateTime);
    System.out.printf("Zone Offset = %s%n", zoffset);

    OffsetDateTime offsetDateTime = OffsetDateTime.now();
    System.out.printf("Offset date and time = %s%n", offsetDateTime);
    System.out.printf(
        "Offset date and time = %s%n", offsetDateTime.with(TemporalAdjusters.lastDayOfMonth()));

    /*
     * The final part of the main() method demonstrates the difference
     * between ZonedDateTime and OffsetDateTime in my time zone. For each
     * class, I obtained an instance that reflected 3 a.m. on November 2,
     * 2013 and November 3, 2013. (DST ends in my time zone at 2 a.m. on
     * November 3.)
     */

    zonedDateTime = ZonedDateTime.of(2013, 11, 2, 3, 00, 0, 0, ZoneId.of("America/Chicago"));
    System.out.printf("Zoned date and time = %s%n", zonedDateTime);

    zonedDateTime = ZonedDateTime.of(2013, 11, 3, 3, 00, 0, 0, ZoneId.of("America/Chicago"));
    System.out.printf("Zoned date and time = %s%n", zonedDateTime);

    /*
     * However, OffsetDateTime will not change the offset because it has no
     * access to time zone rules, so it's unable to find out when DST ends.
     */

    offsetDateTime = OffsetDateTime.of(2013, 11, 2, 3, 00, 0, 0, zoffset);
    System.out.printf("Offset date and time = %s%n", offsetDateTime);

    offsetDateTime = OffsetDateTime.of(2013, 11, 3, 3, 00, 0, 0, zoffset);
    System.out.printf("Offset date and time = %s%n", offsetDateTime);
  }
}

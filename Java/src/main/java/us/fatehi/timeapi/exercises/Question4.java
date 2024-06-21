package us.fatehi.timeapi.exercises;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * How would you convert an Instant to a ZonedDateTime? How would you convert a ZonedDateTime to an
 * Instant?
 */
public class Question4 {

  public ZonedDateTime atZone(final Instant instant, final ZoneId zoneId) {
    final ZonedDateTime zonedDateTime;
    if (instant == null) {
      zonedDateTime = null;
    } else {
      if (zoneId == null) {
        zonedDateTime = instant.atZone(ZoneId.systemDefault());
      } else {
        zonedDateTime = instant.atZone(zoneId);
      }
    }
    return zonedDateTime;
  }

  public Instant toInstant(final ZonedDateTime zonedDateTime) {
    Instant instant;
    if (zonedDateTime == null) {
      instant = null;
    } else {
      instant = zonedDateTime.toInstant();
    }
    return instant;
  }
}

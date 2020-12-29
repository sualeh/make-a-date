package us.fatehi.timeapi.presentation.more;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjustment {

  public static void main(final String[] args) {

    final TemporalAdjuster fourMinutesLater = temporal -> temporal.plus(4, ChronoUnit.MINUTES);

    final LocalTime time = LocalTime.of(12, 0, 0); // 12:00
    final LocalTime laterTime = time.with(fourMinutesLater); // 12:04
    System.out.println("time: " + time);
    System.out.println("adjusted time: " + laterTime);
  }
}

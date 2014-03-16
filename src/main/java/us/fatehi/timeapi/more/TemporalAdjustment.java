package us.fatehi.timeapi.more;

import org.threeten.bp.LocalTime;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAdjuster;

public class TemporalAdjustment {
	
	public static void main(String[] args) {

		TemporalAdjuster fourMinutesLater = new TemporalAdjuster() {
			@Override
			public Temporal adjustInto(Temporal temporal) {
				return temporal.plus(4, ChronoUnit.MINUTES);
			}
		};

		LocalTime time = LocalTime.of(12, 0, 0); // 12:00
		LocalTime laterTime = time.with(fourMinutesLater); // 12:04
		System.out.println("time: " + time);
		System.out.println("adjusted time: " + laterTime);
	}
	
}

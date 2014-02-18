package us.fatehi.timeapi;

import org.threeten.bp.DayOfWeek;
import org.threeten.bp.LocalDate;
import org.threeten.bp.temporal.TemporalAdjusters;

/**
 * Given a random date, how would you find the date of the previous Thursday?
 * 
 * @author Sualeh Fatehi
 */
public class Question2 {

	public LocalDate previousThursday(final LocalDate date) {
		final LocalDate previousThursday;
		if (date == null) {
			previousThursday = null;
		} else {
			previousThursday = date.with(TemporalAdjusters
					.previous(DayOfWeek.THURSDAY));
		}
		return previousThursday;
	}

}

/**
 * Copyright 2014 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi;

import java.util.ArrayList;
import java.util.List;

import org.threeten.bp.DayOfWeek;
import org.threeten.bp.LocalDate;
import org.threeten.bp.Month;
import org.threeten.bp.temporal.TemporalAdjusters;

/**
 * Write an example that, for a given year, reports the length of each month
 * within that year.
 * 
 * @author Sualeh Fatehi
 */
public class Exercise2 {

	public List<LocalDate> getMondays(final int year, final Month month) {
		final List<LocalDate> mondays = new ArrayList<>();
		if (month == null) {
			return mondays;
		}
		int i = 1;
		LocalDate date = LocalDate.of(year, month, 1);
		while (true) {
			date = date.with(TemporalAdjusters.dayOfWeekInMonth(i,
					DayOfWeek.MONDAY));
			if (date.getMonth() != month) {
				break;
			}
			mondays.add(date);
			i++;
		}
		return mondays;
	}

}

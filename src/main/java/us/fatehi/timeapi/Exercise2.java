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
 * See <a href=
 * "http://docs.oracle.com/javase/tutorial/datetime/iso/QandE/ListMondays.java">
 * ListMondays.java</a>
 * 
 * @author Sualeh Fatehi
 */
public class Exercise2 {

	public List<LocalDate> getMondays(final int year, final Month month) {
		final List<LocalDate> mondays = new ArrayList<>();
		if (month == null) {
			return mondays;
		}
		LocalDate date = LocalDate.of(year, month, 1).with(
				TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		Month monthForDate = date.getMonth();
		while (monthForDate == month) {
			mondays.add(date);
			date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			monthForDate = date.getMonth();
		}
		return mondays;
	}

}

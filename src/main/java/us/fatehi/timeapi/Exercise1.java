/**
 * Copyright 2014 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi;

import java.util.ArrayList;
import java.util.List;

import org.threeten.bp.Month;
import org.threeten.bp.Year;

/**
 * Write an example that, for a given year, reports the length of each month
 * within that year.
 * 
 * @author Sualeh Fatehi
 */
public class Exercise1 {

	public List<Integer> getMonthLengths(final int year) {
		final boolean leapYear = Year.isLeap(year);
		final List<Integer> monthLengths = new ArrayList<>();
		for (final Month month : Month.values()) {
			monthLengths.add(month.length(leapYear));
		}
		return monthLengths;
	}

}

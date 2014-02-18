/**
 * Copyright 2014 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import org.threeten.bp.Month;
import org.threeten.bp.YearMonth;

/**
 * Write an example that, for a given year, reports the length of each month
 * within that year.
 * 
 * See <a href=
 * "http://docs.oracle.com/javase/tutorial/datetime/iso/QandE/MonthsInYear.java">MonthsInYear.java</a>
 * 
 * @author Sualeh Fatehi
 */
public class Exercise1 {

	public List<Integer> getMonthLengths(final int year) {
		return new ArrayList<Integer>(getMonthLengthsMap(year).values());
	}

	public SortedMap<YearMonth, Integer> getMonthLengthsMap(final int year) {
		final SortedMap<YearMonth, Integer> monthLengths = new TreeMap<>();
		for (final Month month : Month.values()) {
			final YearMonth yearMonth = YearMonth.of(year, month);
			monthLengths.put(yearMonth, yearMonth.lengthOfMonth());
		}
		return monthLengths;
	}

}

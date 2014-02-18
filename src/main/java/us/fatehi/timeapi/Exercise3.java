/**
 * Copyright 2014 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi;

import org.threeten.bp.DayOfWeek;
import org.threeten.bp.LocalDate;

/**
 * Write an example that tests whether a given date occurs on Friday the 13th.
 * 
 * @author Sualeh Fatehi
 */
public class Exercise3 {

	public boolean isFriday13(final LocalDate date) {
		if (date == null) {
			return false;
		} else {
			return date.getDayOfWeek() == DayOfWeek.FRIDAY
					&& date.getDayOfMonth() == 13;
		}
	}

}

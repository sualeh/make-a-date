/**
 * Copyright 2014-2016 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.presentation.apiproblems;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class OldCalendarApiSnippets implements ApiSnippets {

	private final DateFormat format = SimpleDateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG,
			Locale.getDefault(Locale.Category.FORMAT));

	@Override
	public void problemsWithDate() {
		System.out.println("new GregorianCalendar(12, 12, 12)");

		System.out.println(new GregorianCalendar(12, 12, 12));
		// Prints internals

		System.out.println();

		System.out.print("formatted: new GregorianCalendar(12, 12, 12) // ");
		print(new GregorianCalendar(12, 12, 12));
		// January 12, 0013 12:00:00 AM EST

		// Several problems here:
		// 1. Which 12 is for which date field?
		// 2. Month 12 is December, right? No. January.
		// 3. They got the year right! Almost. 13 CE.
		// 4. Wait - there is a time in a calendar?
		// 5. More than that, there is a time zone.

	}

	private void print(final GregorianCalendar calendarDate) {
		System.out.println(format.format(calendarDate.getTime()));
	}

	@Override
	public String toString() {
		return "Old Calendar API";
	}

}

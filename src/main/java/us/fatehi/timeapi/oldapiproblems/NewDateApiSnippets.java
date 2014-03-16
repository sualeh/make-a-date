/**
 * Copyright 2014 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.oldapiproblems;

import java.util.TimeZone;

import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

public class NewDateApiSnippets implements ApiSnippets {

	public static void main(final String[] args) {
		final ApiSnippets newDate = new NewDateApiSnippets();
		newDate.problemsWithDate();
		newDate.changingTimeZone();
	}

	@Override
	public void changingTimeZone() {
		final ZonedDateTime date = ZonedDateTime.of(
				LocalDateTime.of(12, 12, 12, 0, 0, 0), ZoneId.systemDefault());
		System.out.println(date);

		// Move to another system, with another timezone
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Calcutta"));
		System.out.println(date);
	}

	@Override
	public void problemsWithDate() {
		// No problems here:
		// 1. ISO 8601 order of fields - year, month, day.
		// 2. Month 12 is for December.
		// 3. Year is really 12 AD.
		System.out.println(LocalDate.of(12, 12, 12));
		// 0012-12-12
		// 4. No time component.
		// 5. No timezone component.
		
		System.out.println(LocalDate.of(13, 13, 13));
	}

}

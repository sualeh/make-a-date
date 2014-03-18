/**
 * Copyright 2014 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.oldapiproblems;

import java.util.Date;
import java.util.TimeZone;

public class OldDateApiSnippets implements ApiSnippets {

	public static void main(final String[] args) {
		final OldDateApiSnippets oldDate = new OldDateApiSnippets();
		oldDate.problemsWithDate();
		oldDate.changingTimeZone();
		oldDate.changingTimeZone2();
	}

	@Override
	public void changingTimeZone() {
		System.out.println("changingTimeZone");
		
		final Date date = new Date(10, 10, 10);
		System.out.println(date);

		// Move to another system, with another timezone
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Calcutta"));
		System.out.println(date);
	}

	public void changingTimeZone2() {
		System.out.println("changingTimeZone2");
				
		TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
		final Date date = new Date(114, 11, 12, 0, 0, 0);
		System.out.println(date);

		// Move to another system, with another timezone
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Calcutta"));
		System.out.println(date);
	}

	@Override
	public void problemsWithDate() {
		// Several problems here:
		// 1. Which 12 is for which date field?
		// 2. Month 12 should be December, right? Wrong - January.
		// 3. Really, a year called 12? No - 1913 in this case.
		System.out.println(new Date(12, 12, 12));
		// Sun Jan 12 00:00:00 EST 1913
		// 4. Wait - there is a time in a date?
		// 5. More than that, there is a timezone - EST.
	}

}

/**
 * Copyright 2014-2016 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.experiments;

import java.util.Date;
import java.util.TimeZone;

@SuppressWarnings("deprecation")
public class OldDateChangingTimeZone {

	public static void main(final String[] args) {
		
		System.out.println("java.util.Date: Changing system default time zone will print two different values for the same date");

		TimeZone nyTz = TimeZone.getTimeZone("America/New_York");
		TimeZone.setDefault(nyTz);
		System.out.println("System default timezone: " + nyTz.getID());
		final Date date = new Date(114, 11, 12);
		System.out.println(date);
		System.out.println(String.format("DEBUG fields: %d-%d-%d %d:%d TZ %d", date.getYear(), date.getMonth(), date.getDate(),
				date.getHours(), date.getMinutes(), date.getTimezoneOffset()));

		// Move to another system, with another timezone
		TimeZone calcuttaTz = TimeZone.getTimeZone("Asia/Calcutta");
		TimeZone.setDefault(calcuttaTz);
		System.out.println("Changing to new system default timezone: " + calcuttaTz.getID());
		System.out.println(date);
		System.out.println(String.format("DEBUG fields: %d-%d-%d %d:%d TZ %d", date.getYear(), date.getMonth(), date.getDate(),
				date.getHours(), date.getMinutes(), date.getTimezoneOffset()));
	}

}

package us.fatehi.timeapi.oldapiproblems;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class OldCalendarApiSnippets implements ApiSnippets {

	public static void main(final String[] args) {
		final ApiSnippets oldCalendar = new OldCalendarApiSnippets();
		oldCalendar.problemsWithDate();
		oldCalendar.changingTimeZone();
	}

	private final DateFormat format = SimpleDateFormat.getDateTimeInstance(
			DateFormat.LONG, DateFormat.LONG,
			Locale.getDefault(Locale.Category.FORMAT));

	@Override
	public void changingTimeZone() {
		final GregorianCalendar calendarDate = new GregorianCalendar(10, 10, 10);
		print(calendarDate);

		// Move to another system, with another timezone
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Calcutta"));
		print(calendarDate);
	}

	@Override
	public void problemsWithDate() {
		System.out.println(new GregorianCalendar(12, 12, 12));

		// Several problems here:
		// 1. Which 12 is for which date field?
		// 2. Month 12 should be December, right? Wrong - January.
		// 3. Really, a year called 12? No - 1913 in this case.
		print(new GregorianCalendar(12, 12, 12));
		// Sun Jan 12 00:00:00 EST 1913
		// 4. Wait - there is a time in a date?
		// 5. More than that, there is a timezone - EST.
	}

	private void print(final GregorianCalendar calendarDate) {
		System.out.println(format.format(calendarDate.getTime()));
	}

}

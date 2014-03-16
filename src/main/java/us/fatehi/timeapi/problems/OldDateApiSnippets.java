package us.fatehi.timeapi.problems;

import java.util.Date;
import java.util.TimeZone;

public class OldDateApiSnippets implements ApiSnippets {

	public static void main(final String[] args) {
		final ApiSnippets oldDate = new OldDateApiSnippets();
		oldDate.problemsWithDate();
		oldDate.changingTimeZone();
	}

	@Override
	public void changingTimeZone() {
		final Date date = new Date(10, 10, 10);
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

/**
 * Copyright 2014 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Month;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.ZonedDateTime;

public class TestQuestion4 {

	private static final LocalDateTime testDateTime = LocalDateTime.of(
			LocalDate.of(2014, Month.DECEMBER, 28), LocalTime.of(10, 30));
	private Question4 question4;
	private ZoneId systemZoneId;
	private ZoneId otherZoneId;

	@Before
	public void setup() {
		question4 = new Question4();

		systemZoneId = ZoneId.systemDefault();
		otherZoneId = ZoneId.of("Europe/Paris");
	}

	@Test
	public void testAtZone() {
		// 1. Test null
		assertNull(question4.atZone(null, null));

		// 2. Test an instant in the system default timezone
		final Instant testInstant1 = testDateTime
				.toInstant(getZoneOffset(systemZoneId));
		assertEquals(ZonedDateTime.of(testDateTime, systemZoneId),
				question4.atZone(testInstant1, null));

		// 3. Test an instant in some other timezone
		final Instant testInstant2 = testDateTime
				.toInstant(getZoneOffset(otherZoneId));
		assertEquals(ZonedDateTime.of(testDateTime, otherZoneId),
				question4.atZone(testInstant2, otherZoneId));
	}

	@Test
	public void testToInstant() {

		// 1. Test null
		assertNull(question4.toInstant(null));

		// 2. Test an instant in the system default timezone
		final Instant testInstant1 = testDateTime
				.toInstant(getZoneOffset(systemZoneId));
		assertEquals(testInstant1,
				question4.toInstant(testDateTime.atZone(systemZoneId)));

		// 3. Test an instant in some other timezone
		final Instant testInstant2 = testDateTime
				.toInstant(getZoneOffset(otherZoneId));
		assertEquals(testInstant2,
				question4.toInstant(testDateTime.atZone(otherZoneId)));
	}

	private ZoneOffset getZoneOffset(final ZoneId zoneId) {
		return zoneId.getRules().getOffset(testDateTime);
	}

}

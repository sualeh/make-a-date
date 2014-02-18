/**
 * Copyright 2014 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi;

import org.threeten.bp.Instant;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

/**
 * How would you convert an Instant to a ZonedDateTime? How would you convert a
 * ZonedDateTime to an Instant?
 * 
 * @author Sualeh Fatehi
 */
public class Question4 {

	public ZonedDateTime atZone(final Instant instant, final ZoneId zoneId) {
		final ZonedDateTime zonedDateTime;
		if (instant == null) {
			zonedDateTime = null;
		} else {
			if (zoneId == null) {
				zonedDateTime = instant.atZone(ZoneId.systemDefault());
			} else {
				zonedDateTime = instant.atZone(zoneId);
			}
		}
		return zonedDateTime;
	}

	public Instant toInstant(final ZonedDateTime zonedDateTime) {
		Instant instant;
		if (zonedDateTime == null) {
			instant = null;
		} else {
			instant = zonedDateTime.toInstant();
		}
		return instant;
	}

}

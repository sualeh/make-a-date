/**
 * Copyright 2014-2016 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.presentation.apiproblems;

import java.time.LocalDate;

public class NewDateApiSnippets implements ApiSnippets {

	@Override
	public void problemsWithDate() {
		System.out.print("LocalDate.of(12, 12, 12) // ");

		System.out.println(LocalDate.of(12, 12, 12));
		// 0012-12-12

		// No problems here:
		// 1. ISO 8601 order of fields - year, month, day.
		// 2. Month 12 is for December.
		// 3. Year is really 12 AD.
		// 4. No time component.
		// 5. No timezone component.

		System.out.println();
		System.out.println("LocalDate.of(13, 13, 13)");
		try {
			System.out.println(LocalDate.of(13, 13, 13));
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Java 8 Date and Time API";
	}

}

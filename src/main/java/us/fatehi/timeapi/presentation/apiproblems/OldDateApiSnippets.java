/**
 * Copyright 2014-2016 Sualeh Fatehi This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License. To view a copy of this license,
 * visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.presentation.apiproblems;

import java.util.Date;

@SuppressWarnings("deprecation")
public class OldDateApiSnippets implements ApiSnippets {

  @Override
  public void problemsWithDate() {
    System.out.print("new Date(12, 12, 12); // ");
    System.out.println(new Date(12, 12, 12));
    // Sun Jan 12 00:00:00 EST 1913

    // Several problems here:
    // 1. Which 12 is for which date field?
    // 2. Month 12 should be December, right? Wrong - January.
    // 3. Really, a year called 12? No - 1913 in this case.
    // 4. Wait - there is a time in a date?
    // 5. More than that, there is a timezone - EST.
  }

  @Override
  public String toString() {
    return "Old Date API";
  }
}

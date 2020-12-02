/**
 * Copyright 2014-2016 Sualeh Fatehi This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License. To view a copy of this license,
 * visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.presentation.more;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UglyOldApi {

  public static void main(final String[] args) {

    final Calendar calendar = new GregorianCalendar();
    final Date date = calendar.getTime();
    System.out.println(date);
  }
}

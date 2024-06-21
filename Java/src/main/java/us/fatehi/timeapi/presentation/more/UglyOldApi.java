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

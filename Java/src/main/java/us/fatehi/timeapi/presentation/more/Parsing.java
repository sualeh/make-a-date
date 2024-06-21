package us.fatehi.timeapi.presentation.more;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class Parsing {

  public static void main(final String[] args) {
    final DateTimeFormatter dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    final TemporalAccessor parse = dateFormatter.parse("Jan 19, 2014");
    System.out.println(parse);

    System.out.println(LocalDate.from(parse));
  }
}

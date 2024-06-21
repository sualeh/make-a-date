package us.fatehi.timeapi.presentation.apiproblems;

import java.io.IOException;
import java.io.PrintStream;

import groovy.util.Eval;

public class PresentationExamples {

  public static void main(final String[] args) throws IOException {

    // EXAMPLE 1
    eval(1, "System.out.println(new Date(12, 12, 12));");
    // Several problems here:
    // 1. Which 12 is for which date field?
    // 2. Month 12 is December, right? No. January.
    // 3. Year 12 is 12 CE, right? Wrong. 1913.
    // 4. Wait - there is a time in a date?
    // 5. More than that, is there really a time zone?

    // EXAMPLE 2
    eval(2, "System.out.println(new GregorianCalendar(12, 12, 12));");
    // Output show internals of object

    // EXAMPLE 3
    eval(
        3,
        "java.text.DateFormat dtFmt = java.text.DateFormat.getDateTimeInstance(1, 1);\n"
            + "System.out.println(dtFmt.format(new GregorianCalendar(12,12,12).getTime()));");
    // Several problems here:
    // 1. Which 12 is for which date field?
    // 2. Month 12 is December, right? No. January.
    // 3. They got the year right! Almost. 13 CE.
    // 4. Wait - there is a time in a calendar?
    // 5. More than that, is there a time zone?

    // EXAMPLE 4
    eval(4, "System.out.println(java.time.LocalDate.of(12, 12, 12));");
    // No problems:
    // 1. ISO 8601 order of fields - year, month, day.
    // 2. Month 12 is December.
    // 3. Year is 12 CE.
    // 4. No time component.
    // 5. No time zone.

    // EXAMPLE 5
    eval(5, "System.out.println(java.time.LocalDate.of(13, 13, 13));");
    // Throws meaningful exceptions
  }

  private static void eval(final int number, final String line) throws IOException {

    final PrintStream out = System.out;

    out.printf("EXAMPLE %d%n", number);
    out.printf("Code:%n%s%n", line);
    out.println();

    out.println("Output:");
    try {
      Eval.me(line);
    } catch (final Exception e) {
      e.printStackTrace(out);
    }

    out.println();
    out.println();
  }
}

package us.fatehi.timeapi.presentation.apiproblems;

import java.io.IOException;
import java.io.PrintStream;

import groovy.util.Eval;

public class PresentationExamples {

  public static void main(final String[] args) throws IOException {
    eval(
        "System.out.println(new Date(12, 12, 12));",
        "System.out.println(new GregorianCalendar(12, 12, 12));",
        "java.text.DateFormat dtFmt = java.text.DateFormat.getDateTimeInstance();\n"
            + "System.out.println(dtFmt.format(new GregorianCalendar(12,12,12).getTime()));",
        "System.out.println(java.time.LocalDate.of(12, 12, 12));",
        "System.out.println(java.time.LocalDate.of(13, 13, 13));");
  }

  private static void eval(final String... javaCodeLines) throws IOException {
    for (int i = 0; i < javaCodeLines.length; i++) {
      final String line = javaCodeLines[i];

      final PrintStream out = System.out;

      out.printf("Example #%d%n", i + 1);
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
}

/**
 * Copyright 2014-2016 Sualeh Fatehi This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License. To view a copy of this license,
 * visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.presentation.apiproblems;

public class Main {

  public static void main(final String[] args) {
    final OldDateApiSnippets oldDateApi = new OldDateApiSnippets();
    final OldCalendarApiSnippets oldCalendarApi = new OldCalendarApiSnippets();
    final NewDateApiSnippets newDateApi = new NewDateApiSnippets();

    System.out.println("** " + oldDateApi);
    System.out.println();
    oldDateApi.problemsWithDate();
    System.out.println();
    System.out.println();

    System.out.println("** " + oldCalendarApi);
    System.out.println();
    oldCalendarApi.problemsWithDate();
    System.out.println();
    System.out.println();

    System.out.println("** " + newDateApi);
    System.out.println();
    newDateApi.problemsWithDate();
    System.out.println();
    System.out.println();
  }
}

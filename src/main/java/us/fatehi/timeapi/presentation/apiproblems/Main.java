/**
 * Copyright 2014-2016 Sualeh Fatehi
 * This work is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/deed.en_US.
 */
package us.fatehi.timeapi.presentation.apiproblems;


public class Main
{

  public static void main(String[] args)
  {
    final OldDateApiSnippets oldDateApi = new OldDateApiSnippets();
    final OldCalendarApiSnippets oldCalendarApi = new OldCalendarApiSnippets();
    final NewDateApiSnippets newDateApi = new NewDateApiSnippets();

    oldDateApi._problemsWithDate();
    System.out.println();
    oldCalendarApi._problemsWithDate();
    System.out.println();
    newDateApi._problemsWithDate();
    System.out.println();

    oldDateApi.printAdditionalInformation();
    System.out.println();
    oldCalendarApi.printAdditionalInformation();
    System.out.println();
    newDateApi.printAdditionalInformation();
  }

}

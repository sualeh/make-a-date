package us.fatehi.timeapi.presentation.apiproblems;

import java.time.Clock;
import java.time.LocalDate;

import javax.inject.Inject;

public class SomeObject {

  private Clock clock;

  @Inject
  public void process() {
    final LocalDate date = LocalDate.now(clock);
    // ... do something with date
  }
}

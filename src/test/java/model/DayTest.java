package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cs3500.pa05.model.Day;
import cs3500.pa05.model.DayOfWeek;
import org.junit.jupiter.api.Test;

class DayTest {
  Day day = new Day(DayOfWeek.FRIDAY);

  @Test
  void testToString() {
    assertEquals(day.toString(), "FRIDAY");
  }
}
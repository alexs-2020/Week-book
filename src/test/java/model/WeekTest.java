package model;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import cs3500.pa05.model.Day;
import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.Week;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WeekTest {
  Week week;

  @BeforeEach
  public void initWeek() {
    week = new Week();
  }


  @Test
  void initializeWeek() {
    week.initializeWeek();

    List<Day> expected = new ArrayList<>();
    expected.add(new Day(DayOfWeek.MONDAY));
    expected.add(new Day(DayOfWeek.TUESDAY));
    expected.add(new Day(DayOfWeek.WEDNESDAY));
    expected.add(new Day(DayOfWeek.THURSDAY));
    expected.add(new Day(DayOfWeek.FRIDAY));
    expected.add(new Day(DayOfWeek.SATURDAY));
    expected.add(new Day(DayOfWeek.SUNDAY));
    expected.add(new Day(DayOfWeek.MONDAY));
    expected.add(new Day(DayOfWeek.TUESDAY));
    expected.add(new Day(DayOfWeek.WEDNESDAY));
    expected.add(new Day(DayOfWeek.THURSDAY));
    expected.add(new Day(DayOfWeek.FRIDAY));
    expected.add(new Day(DayOfWeek.SATURDAY));
    expected.add(new Day(DayOfWeek.SUNDAY));

    for (int i = 0; i < week.getWeek().size(); i++) {
      assertEquals(week.getWeek().get(i).toString(), expected.get(i).toString());
    }
  }
}
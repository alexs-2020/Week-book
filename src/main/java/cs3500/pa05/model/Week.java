package cs3500.pa05.model;

import java.util.ArrayList;
import java.util.List;
/**
 * The Week class represents a list of days
 */

public class Week {
  List<Day> week;
  int limit;
  List<Task> allTasks;
  /**
   * Constructs a Week object.
   *
   */

  public Week() {
    this.week = new ArrayList<>();
    initializeWeek();
    this.limit = 0; //????
    this.allTasks = new ArrayList<>();
  }
  /**
   * Returns the list of days in the week.
   *
   * @return The list of days.
   */

  public List<Day> getWeek() {
    return this.week;
  }
  /**
   * Initializes the week with the seven days of the week.
   */

  public void initializeWeek() {
    this.week.add(new Day(DayOfWeek.MONDAY));
    this.week.add(new Day(DayOfWeek.TUESDAY));
    this.week.add(new Day(DayOfWeek.WEDNESDAY));
    this.week.add(new Day(DayOfWeek.THURSDAY));
    this.week.add(new Day(DayOfWeek.FRIDAY));
    this.week.add(new Day(DayOfWeek.SATURDAY));
    this.week.add(new Day(DayOfWeek.SUNDAY));
  }
}

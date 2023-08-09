package cs3500.pa05.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents list and events of a day in the week.
 */

public class Day {
  DayOfWeek day;
  List<Task> taskList;
  List<Event> eventList;

  /**
   * Constructor for a Day object with the specified DayOfWeek.
   *
   * @param d The DayOfWeek associated with this Day.
   */

  public Day(DayOfWeek d) {
    this.day = d;
    this.taskList = new ArrayList<>();
    this.eventList = new ArrayList<>();
  }
  /**
   * Returns a string representation of the Day.
   *
   * @return A string representation of the Day.
   */

  @Override
  public String toString() {
    return this.day.toString();
  }

}

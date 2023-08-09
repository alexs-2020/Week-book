package cs3500.pa05.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The MaxItems class
 * It provides methods to retrieve and
 * update the maximum number of items and individual lists for each day.
 */

public class MaxItems {
  private List<Task> sundayTaskList;
  private List<Task> mondayTaskList;
  private List<Task> tuesdayTaskList;
  private List<Task> wednesdayTaskList;
  private List<Task> thursdayTaskList;
  private List<Task> fridayTaskList;
  private List<Task> saturdayTaskList;
  private List<Event> sundayEventList;
  private List<Event> mondayEventList;
  private List<Event> tuesdayEventList;
  private List<Event> wednesdayEventList;
  private List<Event> thursdayEventList;
  private List<Event> fridayEventList;
  private List<Event> saturdayEventList;
  int max;

  /**
   * Constructs a MaxItems object with the specified maximum number of items.
   *
   * @param max The maximum number of items.
   */

  public MaxItems(int max) {
    this.sundayEventList = new ArrayList<>();
    this.mondayEventList = new ArrayList<>();
    this.tuesdayEventList = new ArrayList<>();
    this.wednesdayEventList = new ArrayList<>();
    this.thursdayEventList = new ArrayList<>();
    this.fridayEventList = new ArrayList<>();
    this.saturdayEventList = new ArrayList<>();
    this.sundayTaskList = new ArrayList<>();
    this.mondayTaskList = new ArrayList<>();
    this.tuesdayTaskList = new ArrayList<>();
    this.wednesdayTaskList = new ArrayList<>();
    this.thursdayTaskList = new ArrayList<>();
    this.fridayTaskList = new ArrayList<>();
    this.saturdayTaskList = new ArrayList<>();
    this.max = max;
  }
  /**
   * Sets the maximum number of items.
   *
   * @param newMax The new maximum number of items.
   */

  public void setMax(int newMax) {
    this.max = newMax;
  }

  /**
   * Retrieves the maximum number of items.
   *
   * @return The maximum number of items.
   */

  public int getMax() {
    return this.max;
  }
  /**
   * Retrieves the list of tasks for Sunday.
   *
   * @return The list of tasks for Sunday.
   */

  public List<Task> getSundayTaskList() {
    return this.sundayTaskList;
  }
  /**
   * Retrieves the list of tasks for Monday.
   *
   * @return The list of tasks for Monday.
   */

  public List<Task> getMondayTaskList() {
    return this.mondayTaskList;
  }
  /**
   * Retrieves the list of tasks for Tuesday.
   *
   * @return The list of tasks for Tuesday.
   */

  public List<Task> getTuesdayTaskList() {
    return this.tuesdayTaskList;
  }
  /**
   * Retrieves the list of tasks for Wednesday.
   *
   * @return The list of tasks for Wednesday.
   */

  public List<Task> getWednesdayTaskList() {
    return this.wednesdayTaskList;
  }
  /**
   * Retrieves the list of tasks for Thursday.
   *
   * @return The list of tasks for Thursday.
   */

  public List<Task> getThursdayTaskList() {
    return this.thursdayTaskList;
  }

  /**
   * Retrieves the list of tasks for Friday.
   *
   * @return The list of tasks for Friday.
   */
  public List<Task> getFridayTaskList() {
    return this.fridayTaskList;
  }

  /**
   * Retrieves the list of tasks for Saturday.
   *
   * @return The list of tasks for Saturday.
   */
  public List<Task> getSaturdayTaskList() {
    return this.saturdayTaskList;
  }

  /**
   * Retrieves the list of Events for Sunday.
   *
   * @return The list of Events for Sunday.
   */
  public List<Event> getSundayEventList() {
    return this.sundayEventList;
  }

  /**
   * Retrieves the list of Events for Monday.
   *
   * @return The list of Events for Monday.
   */
  public List<Event> getMondayEventList() {
    return this.mondayEventList;
  }

  /**
   * Retrieves the list of Events for Tuesday.
   *
   * @return The list of Events for Tuesday.
   */
  public List<Event> getTuesdayEventList() {
    return this.tuesdayEventList;
  }

  /**
   * Retrieves the list of Events for Wednesday.
   *
   * @return The list of Events for Wednesday.
   */
  public List<Event> getWednesdayEventList() {
    return this.wednesdayEventList;
  }

  /**
   * Retrieves the list of Events for Thursday.
   *
   * @return The list of Events for Thursday.
   */
  public List<Event> getThursdayEventList() {
    return this.thursdayEventList;
  }

  /**
   * Retrieves the list of Events for Friday.
   *
   * @return The list of Events for Friday.
   */
  public List<Event> getFridayEventList() {
    return this.fridayEventList;
  }

  /**
   * Retrieves the list of Events for Saturday.
   *
   * @return The list of Events for Saturday.
   */
  public List<Event> getSaturdayEventList() {
    return this.saturdayEventList;
  }

  /**
   * Adds a task to the corresponding task list based on the specified day.
   *
   * @param day  The day of the week to add the task to.
   * @param task The task to be added.
   */
  public void addTaskToList(DayOfWeek day, Task task) {
    if (day == DayOfWeek.SUNDAY) {
      sundayTaskList.add(task);
    } else if (day == DayOfWeek.MONDAY) {
      mondayTaskList.add(task);
    } else if (day == DayOfWeek.TUESDAY) {
      tuesdayTaskList.add(task);
    } else if (day == DayOfWeek.WEDNESDAY) {
      wednesdayTaskList.add(task);
    } else if (day == DayOfWeek.THURSDAY) {
      thursdayTaskList.add(task);
    } else if (day == DayOfWeek.FRIDAY) {
      fridayTaskList.add(task);
    } else {
      saturdayTaskList.add(task);
    }
  }

  /**
   * Adds an event to the corresponding event list based on the specified day.
   *
   * @param day   The day of the week to add the event to.
   * @param event The event to be added.
   */
  public void addEventToList(DayOfWeek day, Event event) {
    if (day == DayOfWeek.SUNDAY) {
      sundayEventList.add(event);
    } else if (day == DayOfWeek.MONDAY) {
      mondayEventList.add(event);
    } else if (day == DayOfWeek.TUESDAY) {
      tuesdayEventList.add(event);
    } else if (day == DayOfWeek.WEDNESDAY) {
      wednesdayEventList.add(event);
    } else if (day == DayOfWeek.THURSDAY) {
      thursdayEventList.add(event);
    } else if (day == DayOfWeek.FRIDAY) {
      fridayEventList.add(event);
    } else {
      saturdayEventList.add(event);
    }
  }

  /**
   * Checks if the number of tasks for the specified day exceeds the set max
   *
   * @param task The task to check.
   * @return {@code true} if the number of tasks exceeds the set max, {@code false} otherwise.
   */
  public boolean moreThanMaxTasks(Task task) {
    DayOfWeek day = task.getDay();
    if (day == DayOfWeek.SUNDAY) {
      return sundayTaskList.size() >= max;
    } else if (day == DayOfWeek.MONDAY) {
      return mondayTaskList.size() >= max;
    } else if (day == DayOfWeek.TUESDAY) {
      return tuesdayTaskList.size() >= max;
    } else if (day == DayOfWeek.WEDNESDAY) {
      return wednesdayTaskList.size() >= max;
    } else if (day == DayOfWeek.THURSDAY) {
      return thursdayTaskList.size() >= max;
    } else if (day == DayOfWeek.FRIDAY) {
      return fridayTaskList.size() >= max;
    } else {
      return saturdayTaskList.size() >= max;
    }
  }

  /**
   * Checks if the number of events for the specified day exceeds the set max.
   *
   * @param event The event to check.
   * @return {@code true} if the number of events exceeds the set max, {@code false} otherwise.
   */
  public boolean moreThanMaxEvents(Event event) {
    DayOfWeek day = event.getDay();

    if (day == DayOfWeek.SUNDAY) {
      return sundayEventList.size() >= max;
    } else if (day == DayOfWeek.MONDAY) {
      return mondayEventList.size() >= max;
    } else if (day == DayOfWeek.TUESDAY) {
      return tuesdayEventList.size() >= max;
    } else if (day == DayOfWeek.WEDNESDAY) {
      return wednesdayEventList.size() >= max;
    } else if (day == DayOfWeek.THURSDAY) {
      return thursdayEventList.size() >= max;
    } else if (day == DayOfWeek.FRIDAY) {
      return fridayEventList.size() >= max;
    } else {
      return saturdayEventList.size() >= max;
    }
  }

  /**
   * Checks if any day's event or task list exceeds the maximum allowed.
   *
   * @return {@code true} if any list exceeds the maximum, {@code false} otherwise.
   */
  public boolean checkMax() {
    return sundayEventList.size() >= max || mondayEventList.size() >= max
        || saturdayEventList.size() >= max || tuesdayEventList.size() >= max
        || wednesdayEventList.size() >= max || thursdayEventList.size() >= max
        || fridayEventList.size() >= max || saturdayTaskList.size() >= max
        || fridayTaskList.size() >= max || thursdayTaskList.size() >= max
        || wednesdayTaskList.size() >= max || tuesdayTaskList.size() >= max
        || mondayTaskList.size() >= max || sundayTaskList.size() >= max;
  }
}

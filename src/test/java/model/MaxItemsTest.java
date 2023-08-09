package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.Event;
import cs3500.pa05.model.MaxItems;
import cs3500.pa05.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test for MaxItem object
 */

public class MaxItemsTest {
  private MaxItems maxItems;

  @BeforeEach
  public void initMaxItems() {
    maxItems = new MaxItems(1);
  }

  @Test
  public void setMax() {
    assertEquals(maxItems.getMax(), 1);
    maxItems.setMax(5);
    assertEquals(maxItems.getMax(), 5);
  }
  /**
   * Tests the addTaskToList method for Sunday in the MaxItems class.
   * Verifies that a task is successfully added to the Sunday task list.
   */

  @Test
  public void addTaskToSundayList() {
    Task task = new Task("test task", "test", DayOfWeek.SUNDAY);
    maxItems.addTaskToList(DayOfWeek.SUNDAY, task);
    assertEquals(maxItems.getSundayTaskList().size(), 1);
  }
  /**
   * Tests the addTaskToList method for Monday in the MaxItems class.
   * Verifies that a task is successfully added to the Monday task list.
   */

  @Test
  public void addTaskToMondayList() {
    Task task = new Task("test task", "test", DayOfWeek.MONDAY);
    maxItems.addTaskToList(DayOfWeek.MONDAY, task);
    assertEquals(maxItems.getMondayTaskList().size(), 1);
  }
  /**
   * Tests the addTaskToList method for Tuesday in the MaxItems class.
   * Verifies that a task is successfully added to the Tuesday task list.
   */

  @Test
  public void addTaskToTuesdayList() {
    Task task = new Task("test task", "test", DayOfWeek.TUESDAY);
    maxItems.addTaskToList(DayOfWeek.TUESDAY, task);
    assertEquals(maxItems.getTuesdayTaskList().size(), 1);
  }
  /**
   * Tests the addTaskToList method for Wednesday in the MaxItems class.
   * Verifies that a task is successfully added to the Wednesday task list.
   */

  @Test
  public void addTaskToWednesdayList() {
    Task task = new Task("test task", "test", DayOfWeek.WEDNESDAY);
    maxItems.addTaskToList(DayOfWeek.WEDNESDAY, task);
    assertEquals(maxItems.getWednesdayTaskList().size(), 1);
  }
  /**
   * Tests the addTaskToList method for Thursday in the MaxItems class.
   * Verifies that a task is successfully added to the Thursday task list.
   */

  @Test
  public void addTaskToThursdayList() {
    Task task = new Task("test task", "test", DayOfWeek.THURSDAY);
    maxItems.addTaskToList(DayOfWeek.THURSDAY, task);
    assertEquals(maxItems.getThursdayTaskList().size(), 1);
  }
  /**
   * Tests the addTaskToList method for Friday in the MaxItems class.
   * Verifies that a task is successfully added to the Friday task list.
   */

  @Test
  public void addTaskToFridayList() {
    Task task = new Task("test task", "test", DayOfWeek.FRIDAY);
    maxItems.addTaskToList(DayOfWeek.FRIDAY, task);
    assertEquals(maxItems.getFridayTaskList().size(), 1);
  }
  /**
   * Tests the addTaskToList method for Saturday in the MaxItems class.
   * Verifies that a task is successfully added to the Saturday task list.
   */

  @Test
  public void addTaskToSaturdayList() {
    Task task = new Task("test task", "test", DayOfWeek.SATURDAY);
    maxItems.addTaskToList(DayOfWeek.SATURDAY, task);
    assertEquals(maxItems.getSaturdayTaskList().size(), 1);
  }
  /**
   * Tests the addEventToList method for Sunday in the MaxItems class.
   * Verifies that a task is successfully added to the Sunday task list.
   */

  @Test
  public void addEventToSundayList() {
    Event event = new Event("test event", "test", DayOfWeek.SUNDAY, 1, 30, 60);
    maxItems.addEventToList(DayOfWeek.SUNDAY, event);
    assertEquals(maxItems.getSundayEventList().size(), 1);
  }
  /**
   * Tests the addEventToList method for Monday in the MaxItems class.
   * Verifies that a task is successfully added to the Monday task list.
   */

  @Test
  public void addEventToMondayList() {
    Event event = new Event("test event", "test", DayOfWeek.MONDAY, 1, 30, 60);
    maxItems.addEventToList(DayOfWeek.MONDAY, event);
    assertEquals(maxItems.getMondayEventList().size(), 1);
  }
  /**
   * Tests the addEventToList method for Tuesday in the MaxItems class.
   * Verifies that a task is successfully added to the Tuesday task list.
   */

  @Test
  public void addEventToTuesdayList() {
    Event event = new Event("test event", "test", DayOfWeek.TUESDAY, 1, 30, 60);
    maxItems.addEventToList(DayOfWeek.TUESDAY, event);
    assertEquals(maxItems.getTuesdayEventList().size(), 1);
  }
  /**
   * Tests the addEventToList method for Wednesday in the MaxItems class.
   * Verifies that a task is successfully added to the Wednesday task list.
   */

  @Test
  public void addEventToWednesdayList() {
    Event event = new Event("test event", "test", DayOfWeek.WEDNESDAY, 1, 30, 60);
    maxItems.addEventToList(DayOfWeek.WEDNESDAY, event);
    assertEquals(maxItems.getWednesdayEventList().size(), 1);
  }
  /**
   * Tests the addEventToList method for Thursday in the MaxItems class.
   * Verifies that a task is successfully added to the Thursday task list.
   */

  @Test
  public void addEventToThursdayList() {
    Event event = new Event("test event", "test", DayOfWeek.THURSDAY, 1, 30, 60);
    maxItems.addEventToList(DayOfWeek.THURSDAY, event);
    assertEquals(maxItems.getThursdayEventList().size(), 1);
  }
  /**
   * Tests the addEventToList method for Friday in the MaxItems class.
   * Verifies that a task is successfully added to the Friday task list.
   */

  @Test
  public void addEventToFridayList() {
    Event event = new Event("test event", "test", DayOfWeek.FRIDAY, 1, 30, 60);
    maxItems.addEventToList(DayOfWeek.FRIDAY, event);
    assertEquals(maxItems.getFridayEventList().size(), 1);
  }
  /**
   * Tests the addEventToList method for Saturday in the MaxItems class.
   * Verifies that a task is successfully added to the Saturday task list.
   */

  @Test
  public void addEventToSaturdayList() {
    Event event = new Event("test event", "test", DayOfWeek.SATURDAY, 1, 30, 60);
    maxItems.addEventToList(DayOfWeek.SATURDAY, event);
    assertEquals(maxItems.getSaturdayEventList().size(), 1);
  }
  /**
   * Tests the moreThanMaxTasks method for Sunday in the MaxItems class.
   * Verifies that the method returns the correct value.
   */

  @Test
  public void moreThanMaxTasksSunday() {
    Task task = new Task("test task", "test", DayOfWeek.SUNDAY);
    assertFalse(maxItems.moreThanMaxTasks(task));
    maxItems.addTaskToList(DayOfWeek.SUNDAY, task);
    assertTrue(maxItems.moreThanMaxTasks(task));
    assertTrue(maxItems.checkMax());
  }
  /**
   * Tests the moreThanMaxTasks method for Monday in the MaxItems class.
   * Verifies that the method returns the correct value.
   */

  @Test
  public void moreThanMaxTasksMonday() {
    Task task = new Task("test task", "test", DayOfWeek.MONDAY);
    assertFalse(maxItems.moreThanMaxTasks(task));
    maxItems.addTaskToList(DayOfWeek.MONDAY, task);
    assertTrue(maxItems.moreThanMaxTasks(task));
    assertTrue(maxItems.checkMax());
  }
  /**
   * Tests the moreThanMaxTasks method for Tuesday in the MaxItems class.
   * Verifies that the method returns the correct value.
   */

  @Test
  public void moreThanMaxTasksTuesday() {
    Task task = new Task("test task", "test", DayOfWeek.TUESDAY);
    assertFalse(maxItems.moreThanMaxTasks(task));
    maxItems.addTaskToList(DayOfWeek.TUESDAY, task);
    assertTrue(maxItems.moreThanMaxTasks(task));
    assertTrue(maxItems.checkMax());
  }
  /**
   * Tests the moreThanMaxTasks method for Wednesday in the MaxItems class.
   * Verifies that the method returns the correct value.
   */

  @Test
  public void moreThanMaxTasksWednesday() {
    Task task = new Task("test task", "test", DayOfWeek.WEDNESDAY);
    assertFalse(maxItems.moreThanMaxTasks(task));
    maxItems.addTaskToList(DayOfWeek.WEDNESDAY, task);
    assertTrue(maxItems.moreThanMaxTasks(task));
  }
  /**
   * Tests the moreThanMaxTasks method for Thursday in the MaxItems class.
   * Verifies that the method returns the correct value.
   */

  @Test
  public void moreThanMaxTasksThursday() {
    Task task = new Task("test task", "test", DayOfWeek.THURSDAY);
    assertFalse(maxItems.moreThanMaxTasks(task));
    maxItems.addTaskToList(DayOfWeek.THURSDAY, task);
    assertTrue(maxItems.moreThanMaxTasks(task));
  }
  /**
   * Tests the moreThanMaxTasks method for Friday in the MaxItems class.
   * Verifies that the method returns the correct value.
   */

  @Test
  public void moreThanMaxTasksFriday() {
    Task task = new Task("test task", "test", DayOfWeek.FRIDAY);
    assertFalse(maxItems.moreThanMaxTasks(task));
    maxItems.addTaskToList(DayOfWeek.FRIDAY, task);
    assertTrue(maxItems.moreThanMaxTasks(task));
  }
  /**
   * Tests the moreThanMaxTasks method for Saturday in the MaxItems class.
   * Verifies that the method returns the correct value.
   */

  @Test
  public void moreThanMaxTasksSaturday() {
    Task task = new Task("test task", "test", DayOfWeek.SATURDAY);
    assertFalse(maxItems.moreThanMaxTasks(task));
    maxItems.addTaskToList(DayOfWeek.SATURDAY, task);
    assertTrue(maxItems.moreThanMaxTasks(task));
  }
  /**
   * Tests the moreThanMaxEvents method for Sunday in the MaxItems class.
   * Verifies that the method returns the correct value.
   */

  @Test
  public void moreThanMaxEventsSunday() {
    Event event = new Event("test event", "test", DayOfWeek.SUNDAY, 1, 30, 60);
    assertFalse(maxItems.moreThanMaxEvents(event));
    maxItems.addEventToList(DayOfWeek.SUNDAY, event);
    assertTrue(maxItems.moreThanMaxEvents(event));
  }
  /**
   * Tests the moreThanMaxEvents method for Sunday in the MaxItems class.
   * Verifies that the method returns the correct value.
   */

  @Test
  public void moreThanMaxEventsMonday() {
    Event event = new Event("test event", "test", DayOfWeek.MONDAY, 1, 30, 60);
    assertFalse(maxItems.moreThanMaxEvents(event));
    maxItems.addEventToList(DayOfWeek.MONDAY, event);
    assertTrue(maxItems.moreThanMaxEvents(event));
  }
  /**
   * Tests the moreThanMaxEvents method for Monday in the MaxItems class.
   * Verifies that the method returns the correct value.
   */

  @Test
  public void moreThanMaxEventsTuesday() {
    Event event = new Event("test event", "test", DayOfWeek.TUESDAY, 1, 30, 60);
    assertFalse(maxItems.moreThanMaxEvents(event));
    maxItems.addEventToList(DayOfWeek.TUESDAY, event);
    assertTrue(maxItems.moreThanMaxEvents(event));
  }
  /**
   * Tests the moreThanMaxEvents method for Tuesday in the MaxItems class.
   * Verifies that the method returns the correct value.
   */

  @Test
  public void moreThanMaxEventsWednesday() {
    Event event = new Event("test event", "test", DayOfWeek.WEDNESDAY, 1, 30, 60);
    assertFalse(maxItems.moreThanMaxEvents(event));
    maxItems.addEventToList(DayOfWeek.WEDNESDAY, event);
    assertTrue(maxItems.moreThanMaxEvents(event));
  }
  /**
   * Tests the moreThanMaxEvents method for Wednesday in the MaxItems class.
   * Verifies that the method returns the correct value.
   */

  @Test
  public void moreThanMaxEventsThursday() {
    Event event = new Event("test event", "test", DayOfWeek.THURSDAY, 1, 30, 60);
    assertFalse(maxItems.moreThanMaxEvents(event));
    maxItems.addEventToList(DayOfWeek.THURSDAY, event);
    assertTrue(maxItems.moreThanMaxEvents(event));
  }
  /**
   * Tests the moreThanMaxEvents method for Friday in the MaxItems class.
   * Verifies that the method returns the correct value.
   */

  @Test
  public void moreThanMaxEventsFriday() {
    Event event = new Event("test event", "test", DayOfWeek.FRIDAY, 1, 30, 60);
    assertFalse(maxItems.moreThanMaxEvents(event));
    maxItems.addEventToList(DayOfWeek.FRIDAY, event);
    assertTrue(maxItems.moreThanMaxEvents(event));
  }
  /**
   * Tests the moreThanMaxEvents method for Saturday in the MaxItems class.
   * Verifies that the method returns the correct value.
   */

  @Test
  public void moreThanMaxEventsSaturday() {
    Event event = new Event("test event", "test", DayOfWeek.SATURDAY, 1, 30, 60);
    assertFalse(maxItems.moreThanMaxEvents(event));
    maxItems.addEventToList(DayOfWeek.SATURDAY, event);
    assertTrue(maxItems.moreThanMaxEvents(event));
  }
}
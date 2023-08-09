package model;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskTest {

  private Task task;

  @BeforeEach
  public void initTask() {
    task = new Task("test task", "hello", DayOfWeek.FRIDAY);
  }

  @Test
  public void changeStatus() {
    task.changeStatus();
    assertTrue(task.getIsComplete());
    task.changeStatus();
    assertFalse(task.getIsComplete());
  }

  @Test
  void testToString() {
    assertEquals(task.toString(), "test task");
  }
}
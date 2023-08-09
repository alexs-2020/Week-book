package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cs3500.pa05.model.CalculateTasks;
import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.Task;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * test class for the testing Tasks
 */

public class CalculateTasksTest {
  private CalculateTasks calculator;
  private List<Task> emptyTasks;
  private List<Task> tasks;
  /**
   * Initializer for test cases
   */

  @BeforeEach
  public void initTasks() {
    calculator = new CalculateTasks();
    emptyTasks = new ArrayList<>();
    tasks = new ArrayList<>();

    tasks.add(new Task("hello there", "hi", DayOfWeek.FRIDAY, true));
    tasks.add(new Task("happy", "healthy", DayOfWeek.TUESDAY, false));
    tasks.add(new Task("go to class", null, DayOfWeek.TUESDAY, false));
  }
  /**
   * Tests the tasksCompletePercentage method of the CalculateTasks class.
   */

  @Test
  public void testTasksCompletePercentage() {
    assertEquals(calculator.tasksCompletePercentage(emptyTasks), 100);
    assertEquals(calculator.tasksCompletePercentage(tasks), 33);
  }
}
package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.TaskJson;
import org.junit.jupiter.api.Test;

class TaskJsonTest {

  TaskJson taskJson = new TaskJson("finish english homework", "pages 1-10",
      DayOfWeek.WEDNESDAY, true);

  @Test
  void name() {
    assertEquals(taskJson.name(), "finish english homework");
  }

  @Test
  void description() {
    assertEquals(taskJson.description(), "pages 1-10");
  }

  @Test
  void day() {
    assertEquals(taskJson.day(), DayOfWeek.WEDNESDAY);
  }

  @Test
  void isComplete() {
    assertTrue(taskJson.isComplete());
  }
}
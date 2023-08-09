package model;



import static org.junit.jupiter.api.Assertions.assertEquals;

import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.Event;
import cs3500.pa05.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AbstractCalendarItemTest {
  Event event;
  Task task;

  @BeforeEach
  public void initAbstractCalendarItem() {
    event = new Event("prom", "spring 2023", DayOfWeek.SUNDAY, 7, 30, 120);
    task = new Task("test task", "hello", DayOfWeek.FRIDAY);
  }


  @Test
  void getName() {
    assertEquals(event.getName(), "prom");
    assertEquals(task.getName(), "test task");
  }

  @Test
  void getDay() {
    assertEquals(event.getDay(), DayOfWeek.SUNDAY);
    assertEquals(task.getDay(), DayOfWeek.FRIDAY);
  }

  @Test
  void getDes() {
    assertEquals(event.getDes(), "spring 2023");
    assertEquals(task.getDes(), "hello");
  }

  @Test
  void setName() {
    event.setName("wee");
    task.setName("grr");
    assertEquals(event.getName(), "wee");
    assertEquals(task.getName(), "grr");
  }

  @Test
  void setDes() {
    event.setDes("wee");
    task.setDes("grr");
    assertEquals(event.getDes(), "wee");
    assertEquals(task.getDes(), "grr");
  }

  @Test
  void setDay() {
    event.setDay(DayOfWeek.MONDAY);
    task.setDay(DayOfWeek.TUESDAY);
    assertEquals(event.getDay(), DayOfWeek.MONDAY);
    assertEquals(task.getDay(), DayOfWeek.TUESDAY);
  }
}
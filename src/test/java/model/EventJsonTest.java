package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.EventJson;
import org.junit.jupiter.api.Test;

class EventJsonTest {
  EventJson eventJson = new EventJson("study session", "hurtig 121", DayOfWeek.MONDAY,
      1, 15, 300);

  @Test
  void name() {
    assertEquals(eventJson.name(), "study session");
  }

  @Test
  void description() {
    assertEquals(eventJson.description(), "hurtig 121");
  }

  @Test
  void day() {
    assertEquals(eventJson.day(), DayOfWeek.MONDAY);
  }

  @Test
  void hour() {
    assertEquals(eventJson.hour(), 1);
  }

  @Test
  void minute() {
    assertEquals(eventJson.minute(), 15);
  }

  @Test
  void duration() {
    assertEquals(eventJson.duration(), 300);
  }
}
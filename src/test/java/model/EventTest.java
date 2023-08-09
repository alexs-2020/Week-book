package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.Event;
import javafx.beans.property.SimpleStringProperty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Test for Events
 */

public class EventTest {
  private Event event;
  private Event event2;
  /**
   * Initializer for test cases
   */

  @BeforeEach
  public void initEvent() {
    event = new Event("prom", "spring 2023", DayOfWeek.SUNDAY, 7, 30, 120);
    event2 = new Event("hi", "there", DayOfWeek.FRIDAY, "7", "30", "120");
  }
  /**
   * Tests the toString method of the Event class.
   * Verifies that the toString representation is correct.
   */

  @Test
  public void testToString() {
    assertEquals(event.toString(), new SimpleStringProperty("prom") + "\n "
        + new SimpleStringProperty("spring 2023"));
  }
  /**
   * Tests the getDuration method of the Event class.
   * Verifies that the duration is returned correctly.
   */

  @Test
  public void testGetDuration() {
    assertEquals(event.getDuration(), 120);
  }
  /**
   * Tests the getStartHour method of the Event class.
   * Verifies that the start hour is returned correctly.
   */

  @Test
  public void testGetStartHour() {
    assertEquals(event.getStartHour(), 7);
  }
  /**
   * Tests the getStartMinute method of the Event class.
   * Verifies that the start minute is returned correctly.
   */

  @Test
  public void testGetStartMinute() {
    assertEquals(event.getStartMinute(), 30);
  }
  /**
   * Tests the setDuration method of the Event class.
   * Verifies that the duration can be set correctly.
   */

  @Test
  public void testSetDuration() {
    assertEquals(event2.getDuration(), 120);
    event2.setDuration(150);
    assertEquals(event2.getDuration(), 150);
  }
  /**
   * Tests the setHr method of the Event class.
   * Verifies that the start hour can be set correctly.
   */

  @Test
  public void testSetHr() {
    assertEquals(event2.getStartHour(), 7);
    event2.setHr(12);
    assertEquals(event2.getStartHour(), 12);
  }
  /**
   * Tests the setMin method of the Event class.
   * Verifies that the start minute can be set correctly.
   */

  @Test
  public void testSetMin() {
    assertEquals(event2.getStartMinute(), 30);
    event2.setMin(45);
    assertEquals(event2.getStartMinute(), 45);
  }
}
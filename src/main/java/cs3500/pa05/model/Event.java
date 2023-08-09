package cs3500.pa05.model;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 * Represents an event
 */

public class Event extends AbstractCalendarItem {
  IntegerProperty startHour;
  IntegerProperty startMinute;
  IntegerProperty duration;

  /**
   * Constructs an Event object
   *
   * @param n             The name of the event.
   * @param ds            The description of the event.
   * @param day           The day of the week associated with the event.
   * @param startHour     The starting hour of the event.
   * @param startMinute   The starting minute of the event.
   * @param duration      The duration of the event.
   */

  public Event(String n, String ds, DayOfWeek day,
               int startHour, int startMinute, int duration) {
    super(n, ds, day);
    this.startHour = new SimpleIntegerProperty(startHour);
    this.startMinute = new SimpleIntegerProperty(startMinute);
    this.duration = new SimpleIntegerProperty(duration);
  }

  /**
   * Constructs an Event object
   *
   * @param n             The name of the event.
   * @param ds            The description of the event.
   * @param day           The day of the week associated with the event.
   * @param startHour     The starting hour of the event as a string.
   * @param startMinute   The starting minute of the event as a string.
   * @param duration      The duration of the event as a string.
   */

  public Event(String n, String ds, DayOfWeek day,
               String startHour, String startMinute, String duration) {
    super(n, ds, day);
    this.startHour = new SimpleIntegerProperty(Integer.parseInt(startHour));
    this.startMinute = new SimpleIntegerProperty(Integer.parseInt(startMinute));
    this.duration = new SimpleIntegerProperty(Integer.parseInt(duration));
  }

  /**
   * Returns a string representation of the event.
   *
   * @return A string representation of the event.
   */

  public String toString() {
    return this.name + "\n " + this.des;
  }

  /**
   * Returns the duration of the event.
   *
   * @return The duration of the event.
   */

  public int getDuration() {
    return this.duration.get();
  }

  /**
   * Returns the starting hour of the event.
   *
   * @return The starting hour of the event.
   */

  public int getStartHour() {
    return this.startHour.get();
  }

  /**
   * Returns the starting minute of the event.
   *
   * @return The starting minute of the event.
   */

  public int getStartMinute() {
    return this.startMinute.get();
  }

  /**
   * Sets the duration of the event to the specified value.
   *
   * @param newDur The new duration of the event.
   */

  public void setDuration(int newDur) {
    this.duration = new SimpleIntegerProperty(newDur);
  }

  /**
   * Sets the starting minute of the event to the specified value.
   *
   * @param min The new starting minute of the event.
   */

  public void setMin(int min) {
    this.startMinute = new SimpleIntegerProperty(min);
  }

  /**
   * Sets the starting hour of the event to the specified value.
   *
   * @param hr The new starting hour of the event.
   */

  public void setHr(int hr) {
    this.startHour = new SimpleIntegerProperty(hr);
  }
}

package cs3500.pa05.model;


/**
 * Interface for a calendar item.
 */
public interface CalendarItem {

  /**
   * Gets the name of the calendar item.
   *
   * @return the name of the calendar item
   */
  String getName();

  /**
   * Gets the description of the calendar item.
   *
   * @return the description of the calendar item
   */
  String getDes();

  /**
   * Gets the day of the calendar item.
   *
   * @return the day of the calendar item
   */
  DayOfWeek getDay();

  /**
   * Sets the name of the calendar item.
   *
   * @param name name of the calendar item
   */
  void setName(String name);

  /**
   * Sets the description of the calendar item.
   *
   * @param des description of the calendar item
   */
  void setDes(String des);

  /**
   * Sets the day of the week of the calendar item.
   *
   * @param day day of the week
   */
  void setDay(DayOfWeek day);
}

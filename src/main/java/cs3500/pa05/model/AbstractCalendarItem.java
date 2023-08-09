package cs3500.pa05.model;


import javafx.beans.property.SimpleStringProperty;

/**
 * Represents an abstract calendar item.
 */
public abstract class AbstractCalendarItem implements CalendarItem {

  protected SimpleStringProperty name;
  protected SimpleStringProperty des;
  protected DayOfWeek day;

  /**
   * Constructs the abstract calendar item.
   *
   * @param name name of the calendar item
   * @param ds description of the calendar item
   * @param day day of the calendar item
   */
  AbstractCalendarItem(String name, String ds, DayOfWeek day) {
    this.name = new SimpleStringProperty(name);
    this.des = new SimpleStringProperty(ds);
    this.day = day;
  }

  /**
   * Gets the name of the calendar item.
   *
   * @return the name of the calendar item
   */
  public final String getName() {
    return name.get();
  }

  /**
   * Gets the day of the calendar item.
   *
   * @return the day of the calendar item
   */
  public DayOfWeek getDay() {
    return this.day;
  }

  /**
   * Gets the description of the calendar item.
   *
   * @return the description of the calendar item
   */
  public String getDes() {
    return this.des.get();
  }

  /**
   * Sets the name of the calendar item.
   *
   * @param name name of the calendar item
   */
  public void setName(String name) {
    this.name = new SimpleStringProperty(name);
  }

  /**
   * Sets the description of the calendar item.
   *
   * @param des description of the calendar item
   */
  public void setDes(String des) {
    this.des = new SimpleStringProperty(des);
  }

  /**
   * Sets the day of the week of the calendar item.
   *
   * @param day day of the week
   */
  public void setDay(DayOfWeek day) {
    this.day = day;
  }

}

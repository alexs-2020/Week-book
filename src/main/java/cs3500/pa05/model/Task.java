package cs3500.pa05.model;

/**
 * Represents a task item
 */
public class Task extends AbstractCalendarItem {
  private boolean isComplete;

  /**
   * Constructs a new Task object
   *
   * @param n        The name of the task.
   * @param ds        The description of the task.
   * @param d         The day of the week for the task.
   */
  public Task(String n, String ds, DayOfWeek d) {
    super(n, ds, d);
    isComplete = false;
  }

  /**
   * Constructs a new Task object
   *
   * @param n        The name of the task.
   * @param ds      The description of the task.
   * @param d         The day of the week for the task.
   * @param isComplete  The completion status of the task.
   */
  public Task(String n, String ds, DayOfWeek d, boolean isComplete) {
    super(n, ds, d);
    this.isComplete = isComplete;
  }

  /**
   * Changes the completion status of the task.
   */
  public void changeStatus() {
    this.isComplete = !this.isComplete;
  }

  /**
   * Returns the completion status of the task.
   *
   * @return The completion status.
   */
  public boolean getIsComplete() {
    return this.isComplete;
  }

  /**
   * Returns a string representation of the task.
   *
   * @return The string representation.
   */
  public String toString() {
    return this.name.get();
  }
}

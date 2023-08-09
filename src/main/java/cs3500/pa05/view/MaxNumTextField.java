package cs3500.pa05.view;

/**
 * Represents a text field for entering max number of events and tasks.
 */
public class MaxNumTextField extends LimitedTextField {
  /**
   * Validates if given text is an int.
   *
   * @param text received input
   * @return true if text is acceptable, false if not
   */
  @Override
  protected boolean validate(String text) {
    if (text.isEmpty()) {
      return true;
    } else {
      return (text.matches("[0-9]"));
    }
  }
}

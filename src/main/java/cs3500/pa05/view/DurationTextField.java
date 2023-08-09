package cs3500.pa05.view;

/**
 * Represents a text field for typing a duration of time.
 */
public class DurationTextField extends LimitedTextField {

  /**
   * Validates if given text is acceptable for a non-zero duration of time.
   *
   * @param text received input
   * @return true if text is acceptable, false if not
   */
  @Override
  protected boolean validate(String text) {
    if (text.isEmpty()) {
      return true;
    } else if (getText().length() == 0) {
      return text.matches("^[1-9]$");
    } else {
      return text.matches("^\\d+$");
    }
  }
}

package cs3500.pa05.view;

/**
 * Represents a text field for inputting the hour in military time.
 */
public class MilitaryHourTextField extends LimitedTextField {
  /**
   * Validates if input is acceptable (user input should range from 00-23)
   *
   * @param text received input
   * @return true if text is acceptable, false if not
   */
  @Override
  protected boolean validate(String text) {
    if (text.isEmpty()) {
      return true;
    } else if (getText().length() > 1) {
      return false;
    } else if (getText().length() == 0) {
      return text.matches("^[0-2]$");
    } else {
      return (text.matches("^\\d$")
          && Integer.parseInt(getText() + text) < 24);
    }
  }
}

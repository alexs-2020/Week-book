package cs3500.pa05.view;

import javafx.scene.control.TextField;

/**
 * Represents a text field that accepts limited input.
 */
public abstract class LimitedTextField extends TextField {
  /**
   * Replaces a range of characters with the given text.
   *
   * @param start The starting index in the range, inclusive.
   *              This must be &gt;= 0 and &lt; the end.
   * @param end The ending index in the range, exclusive. This is one-past the last character to
   *            delete (consistent with the String manipulation methods).
   *            This must be &gt; the start, and &lt;= the length of the text.
   * @param text The text that is to replace the range. This must not be null.
   */
  @Override
  public void replaceText(int start, int end, String text) {
    if (validate(text)) {
      super.replaceText(start, end, text);
    }
  }

  /**
   * Replaces the selection with the given replacement String.
   *
   * @param text the replacement string
   */
  @Override
  public void replaceSelection(String text) {
    if (validate(text)) {
      super.replaceSelection(text);
    }
  }

  /**
   * Validates if given text falls under accepted input.
   *
   * @param text received input
   * @return true if text is acceptable, false if not
   */
  protected abstract boolean validate(String text);
}

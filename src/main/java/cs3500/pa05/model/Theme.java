package cs3500.pa05.model;

/**
 * The Theme enum represents different themes for an application or user interface.
 * Each theme has a corresponding CSS file and icon file associated with it.
 */
public enum Theme {
  LIGHTMODE,
  DARKMODE,
  BEACHMODE,
  FLOWERMODE;

  /**
   * Returns the CSS file name for the theme.
   *
   * @return The CSS file name as a String. Returns an empty string if no corresponding file.
   */
  public String getCssFile() {
    if (this == DARKMODE) {
      return "darkmode.css";
    } else if (this == BEACHMODE) {
      return "gradient.css";
    } else if (this == FLOWERMODE) {
      return "flower.css";
    } else {
      return ""; // no correlating file
    }
  }

  /**
   * Returns the icon file name for the theme.
   *
   * @return The icon file name as a String.
   */
  public String getIconFile() {
    if (this == DARKMODE) {
      return "milky-way-emoji.png";
    } else if (this == BEACHMODE) {
      return "beach-emoji.png";
    } else if (this == FLOWERMODE) {
      return "cherry-blossom-emoji.png";
    } else {
      return "calendar-emoji.png";
    }
  }
}

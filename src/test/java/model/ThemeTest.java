package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cs3500.pa05.model.Theme;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Test for themes
 */

public class ThemeTest {
  private Theme light;
  private Theme dark;
  private Theme beach;
  private Theme flower;
  /**
   * Initializes the Theme objects before each test
   */

  @BeforeEach
  public void initTheme() {
    light = Theme.LIGHTMODE;
    dark = Theme.DARKMODE;
    beach = Theme.BEACHMODE;
    flower = Theme.FLOWERMODE;
  }
  /**
   * Tests the getCssFile method of the Theme enum.
   * Verifies that the correct CSS file name is returned for each theme.
   */

  @Test
  public void getCssFile() {
    assertEquals(light.getCssFile(), "");
    assertEquals(dark.getCssFile(), "darkmode.css");
    assertEquals(beach.getCssFile(), "gradient.css");
    assertEquals(flower.getCssFile(), "flower.css");
  }
  /**
   * Tests the getIconFile method of the Theme enum.
   * Verifies that the correct icon file name is returned for each theme.
   */

  @Test
  public void getIconFile() {
    assertEquals(light.getIconFile(), "calendar-emoji.png");
    assertEquals(dark.getIconFile(), "milky-way-emoji.png");
    assertEquals(beach.getIconFile(), "beach-emoji.png");
    assertEquals(flower.getIconFile(), "cherry-blossom-emoji.png");
  }
}
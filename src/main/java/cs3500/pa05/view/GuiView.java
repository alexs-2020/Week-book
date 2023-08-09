package cs3500.pa05.view;

import javafx.scene.Scene;

/**
 * Represents a GUI view for Week View.
 */
public interface GuiView {
  /**
   * Loads a scene from a GUI layout.
   *
   * @return the layout
   */
  Scene load() throws IllegalStateException;
}

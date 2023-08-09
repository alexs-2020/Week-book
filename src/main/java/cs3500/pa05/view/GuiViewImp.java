package cs3500.pa05.view;


import cs3500.pa05.controller.Controller;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

/**
 * Represents a Java Journal Week GUI view.
 */
public class GuiViewImp implements GuiView {
  FXMLLoader loader;

  /**
   * Instantiates an object for loading an FXML user interface.
   *
   * @param controller controller for Java Journal
   */
  public GuiViewImp(Controller controller) {
    this.loader = new FXMLLoader();
    this.loader.setLocation(getClass().getClassLoader().getResource("WeekView.fxml"));
    this.loader.setController(controller);
  }

  /**
   * Loads a scene from the Java Journal Week GUI layout.
   *
   * @return layout of the week
   * @throws IllegalStateException layout cannot be loaded
   */
  @Override
  public Scene load() throws IllegalStateException {
    try {
      return this.loader.load();
    } catch (IOException exc) {
      exc.printStackTrace();
      throw new IllegalStateException("Unable to load layout.");
    }
  }
}
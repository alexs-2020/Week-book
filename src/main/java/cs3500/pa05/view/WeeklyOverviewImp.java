package cs3500.pa05.view;

import cs3500.pa05.controller.Controller;
import cs3500.pa05.model.Theme;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

/**
 * A view for the weekly overview.
 */
public class WeeklyOverviewImp implements GuiView {

  FXMLLoader loader;
  Theme theme;

  /**
   * Instantiates an object for loading an FXML user interface.
   *
   * @param controller controller for Java Journal
   */
  public WeeklyOverviewImp(Controller controller, Theme theme) {
    this.loader = new FXMLLoader();
    this.loader.setLocation(getClass().getClassLoader().getResource("WeeklyOverview.fxml"));
    this.loader.setController(controller);
    this.theme = theme;
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
      Scene scene = this.loader.load();
      if (theme != Theme.LIGHTMODE) {
        scene.getStylesheets().add(theme.getCssFile());
      }
      return scene;
    } catch (IOException exc) {
      exc.printStackTrace();
      throw new IllegalStateException("Unable to load layout.");
    }
  }
}

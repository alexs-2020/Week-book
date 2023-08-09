package cs3500.pa05.view;

import cs3500.pa05.controller.Controller;
import cs3500.pa05.model.Theme;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

/**
 * Represents an abstract pop-up in Week View.
 */
public abstract class AbstractPopUpViewImp implements GuiView {
  protected FXMLLoader loader;
  protected Theme theme;

  /**
   * Instantiates an object for loading an FXML user interface.
   *
   * @param controller controller of pop-up window
   * @param theme theme of journal
   */
  public AbstractPopUpViewImp(Controller controller, Theme theme) {
    this.loader = new FXMLLoader();
    this.loader.setController(controller);
    this.theme = theme;
  }

  /**
   * Loads a popup from the Java Journal Week GUI layout.
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

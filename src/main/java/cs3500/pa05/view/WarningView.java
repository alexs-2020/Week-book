package cs3500.pa05.view;

import cs3500.pa05.controller.Controller;
import cs3500.pa05.model.Theme;

/**
 * Represents a warning pop-up.
 */
public class WarningView extends AbstractPopUpViewImp {

  /**
   * Instantiates an object for loading an FXML user interface.
   *
   */
  public WarningView(Controller controller, Theme theme) {
    super(controller, theme);
    this.loader.setLocation(getClass().getClassLoader().getResource("Warning.fxml"));
  }
}
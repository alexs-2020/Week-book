package cs3500.pa05.view;

import cs3500.pa05.controller.Controller;
import cs3500.pa05.model.Theme;

/**
 * Represents a window for creating a task.
 */
public class CreateTaskViewImp extends AbstractPopUpViewImp {

  /**
   * Instantiates an object for loading an FXML user interface.
   *
   * @param controller controller for Java Journal
   */
  public CreateTaskViewImp(Controller controller, Theme theme) {
    super(controller, theme);
    this.loader.setLocation(getClass().getClassLoader().getResource("CreateTask.fxml"));
  }
}
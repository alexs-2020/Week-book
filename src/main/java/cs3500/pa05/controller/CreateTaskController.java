package cs3500.pa05.controller;

import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.Task;
import cs3500.pa05.model.Theme;
import cs3500.pa05.view.CreateTaskViewImp;
import cs3500.pa05.view.GuiView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;

/**
 * A controller used to create a task.
 */
public class CreateTaskController extends AbstractCalendarItemController {
  private Task taskToSubmit;

  /**
   * Constructs the create task controller.
   */
  public CreateTaskController(Theme theme) {
    super(theme);
  }

  /**
   * Runs the create event controller.
   */
  @Override
  public void run() {
    GuiView guiView = new CreateTaskViewImp(this, theme);
    this.stage.setScene(guiView.load());
    this.stage.getIcons().add(new Image(theme.getIconFile()));
    this.stage.setTitle("Create Task");
    this.stage.show();
    initialize();
  }

  /**
   * Handles pressing the submit button.
   *
   * @param e the action event
   */
  @FXML
  public void handleSubmit(ActionEvent e) {
    DayOfWeek day = this.weekBox.getValue();
    this.taskToSubmit = new Task(nameField.getText(), desField.getText(), day);
    this.stage.close();
  }

  /**
   * Gets the item being submitted.
   *
   * @return the item being submitted
   */
  public Task getItemToSubmit() {
    return this.taskToSubmit;
  }

}

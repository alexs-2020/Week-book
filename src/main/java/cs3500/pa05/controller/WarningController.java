package cs3500.pa05.controller;

import cs3500.pa05.model.CalendarItem;
import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.Task;
import cs3500.pa05.model.Theme;
import cs3500.pa05.view.CreateTaskViewImp;
import cs3500.pa05.view.GuiView;
import cs3500.pa05.view.WarningView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * A controller used to provide a warning to the user when they've hit the max tasks or events.
 */
public class WarningController implements Controller {
  Stage stage;
  Theme theme;

  /**
   * Constructs the warning controller.
   *
   * @param theme theme of the journal
   */
  public WarningController(Theme theme) {
    this.stage = new Stage();
    this.theme = theme;
  }

  /**
   * Handles the action when the submit button is pressed.
   *
   * @param e the action event
   */
  @FXML
  public void handleSubmit(ActionEvent e) {
    this.stage.close();
  }

  /**
   * Runs the warning controller.
   */
  public void run() {
    GuiView guiView = new WarningView(this, theme);
    this.stage.setScene(guiView.load());
    this.stage.getIcons().add(new Image(theme.getIconFile()));
    this.stage.setTitle("WARNING");
    this.stage.show();
  }
}

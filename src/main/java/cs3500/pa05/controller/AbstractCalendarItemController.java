package cs3500.pa05.controller;

import cs3500.pa05.model.CalendarItem;
import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.Theme;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Represents an abstract controller for the calendar items.
 */
public abstract class AbstractCalendarItemController extends JournalController {
  Stage stage;
  @FXML
  protected TextField nameField;
  @FXML
  protected TextField desField;
  @FXML
  protected ChoiceBox<DayOfWeek> weekBox;
  protected Theme theme;
  @FXML
  private Button submit;

  protected ObservableList<DayOfWeek> dayOfWeek = FXCollections.observableArrayList(
      DayOfWeek.SUNDAY,
      DayOfWeek.MONDAY,
      DayOfWeek.TUESDAY,
      DayOfWeek.WEDNESDAY,
      DayOfWeek.THURSDAY,
      DayOfWeek.FRIDAY,
      DayOfWeek.SATURDAY);

  /**
   * Constructs the abstract calendar item controller.
   */
  public AbstractCalendarItemController(Theme theme) {
    this.stage = new Stage();
    this.theme = theme;
  }

  /**
   * Initializes the FXML items in the controller.
   */
  public void initialize() {
    this.weekBox.setItems(dayOfWeek);
    this.submit.setOnAction(e -> handleSubmit(new ActionEvent()));
  }

  /**
   * Handles pressing the submit button.
   *
   * @param e the action event
   */
  public abstract void handleSubmit(ActionEvent e);

  /**
   * Runs the controller.
   */
  public abstract void run();

  /**
   * Gets the item being submitted.
   *
   * @return the item being submitted
   */
  public abstract CalendarItem getItemToSubmit();
}

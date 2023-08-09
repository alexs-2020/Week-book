package cs3500.pa05.controller;

import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.Event;
import cs3500.pa05.model.Theme;
import cs3500.pa05.view.CreateEventViewImp;
import cs3500.pa05.view.GuiView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

/**
 * A controller used to create an event.
 */
public class CreateEventController extends AbstractCalendarItemController {
  private Event eventToSubmit;

  @FXML
  private TextField startHour;
  @FXML
  private TextField startMinute;
  @FXML
  private TextField duration;

  /**
   * Constructs the create event controller.
   */
  CreateEventController(Theme theme) {
    super(theme);
    this.startHour = new TextField();
    this.startMinute = new TextField();
    this.duration = new TextField();
  }

  /**
   * Runs the create event controller.
   */
  @Override
  public void run() {
    GuiView guiView = new CreateEventViewImp(this, theme);
    this.stage.setScene(guiView.load());
    this.stage.getIcons().add(new Image(theme.getIconFile()));
    this.stage.setTitle("Create Event");
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

    this.eventToSubmit = new Event(this.nameField.getText(), this.desField.getText(),
        day, this.startHour.getText(), this.startMinute.getText(), this.duration.getText());
    System.out.println(eventToSubmit);

    this.stage.close();
  }

  /**
   * Gets the item being submitted.
   *
   * @return the item being submitted
   */
  public Event getItemToSubmit() {
    return eventToSubmit;
  }
}

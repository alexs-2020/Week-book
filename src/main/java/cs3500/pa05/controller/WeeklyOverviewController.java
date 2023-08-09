package cs3500.pa05.controller;

import cs3500.pa05.model.CalculateTasks;
import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.Event;
import cs3500.pa05.model.Task;
import cs3500.pa05.model.Theme;
import cs3500.pa05.view.GuiView;
import cs3500.pa05.view.WeeklyOverviewImp;
import java.util.List;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * A controller for the weekly overview.
 */
public class WeeklyOverviewController implements Controller {
  Stage stage;
  List<Task> allTasks;
  List<Event> allEvents;
  @FXML
  TableView<Task> taskView;
  @FXML
  TableView<Event> eventView;
  @FXML
  TableColumn<Task, String> taskName;
  @FXML
  TableColumn<Task, String> taskDes;
  @FXML
  TableColumn<Task, DayOfWeek> taskDay;
  @FXML
  TableColumn<Task, String> isComplete;
  @FXML
  TableColumn<Event, String> eventName;
  @FXML
  TableColumn<Event, String> eventDes;
  @FXML
  TableColumn<Event, String> eventDay;
  @FXML
  TableColumn<Event, Integer> startHour;
  @FXML
  TableColumn<Event, Integer> startMin;
  @FXML
  TableColumn<Event, Integer> duration;
  @FXML
  Label percent;
  @FXML
  Button submit;
  private Theme theme;


  /**
   * Instantiates the weekly overview controller.
   *
   * @param allTasks all tasks on the bullet journal
   * @param allEvents all events on the bullet journal
   */
  public WeeklyOverviewController(List<Task> allTasks, List<Event> allEvents, Theme theme) {
    this.stage = new Stage();
    this.allTasks = allTasks;
    this.allEvents = allEvents;
    this.theme = theme;
  }

  /**
   * Runs the weekly overview controller.
   */
  @Override
  public void run() {
    GuiView weeklyOverview = new WeeklyOverviewImp(this, theme);
    stage.setScene(weeklyOverview.load());
    stage.getIcons().add(new Image(theme.getIconFile()));
    stage.setTitle("Weekly Overview");
    stage.show();
    initialize();
    addTasks();
    addEvents();
    setPercentage();
    submit.setOnAction(this::handleSubmit);
  }

  /**
   * Initializes the columns in the FXML.
   */
  private void initialize() {
    taskName.setCellValueFactory(new PropertyValueFactory<>("name"));
    taskDes.setCellValueFactory(new PropertyValueFactory<>("des"));
    taskDay.setCellValueFactory(new PropertyValueFactory<>("day"));
    isComplete.setCellValueFactory(new PropertyValueFactory<>("isComplete"));

    eventName.setCellValueFactory(new PropertyValueFactory<>("name"));
    eventDes.setCellValueFactory(new PropertyValueFactory<>("des"));
    eventDay.setCellValueFactory(new PropertyValueFactory<>("day"));
    startHour.setCellValueFactory(new PropertyValueFactory<>("startHour"));
    startMin.setCellValueFactory(new PropertyValueFactory<>("startMinute"));
    duration.setCellValueFactory(new PropertyValueFactory<>("duration"));
  }

  /**
   * Adds all the tasks to the table view.
   */
  private void addTasks() {
    for (Task task : allTasks) {
      taskView.getItems().add(task);
    }
  }

  /**
   * Adds all the events to the table view.
   */
  private void addEvents() {
    for (Event event : allEvents) {
      eventView.getItems().add(event);
    }
  }

  /**
   * Sets the percentage of tasks completed.
   */
  private void setPercentage() {
    CalculateTasks calculator = new CalculateTasks();
    int percentage = calculator.tasksCompletePercentage(allTasks);
    percent.setText(Objects.toString(percentage));
  }

  /**
   * Handles the event when the submit button is clicked.
   *
   * @param e the event
   */
  private void handleSubmit(ActionEvent e) {
    stage.close();
  }
}

package cs3500.pa05.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import cs3500.pa05.model.Event;
import cs3500.pa05.model.EventJson;
import cs3500.pa05.model.EventsJson;
import cs3500.pa05.model.JournalJson;
import cs3500.pa05.model.JsonUtils;
import cs3500.pa05.model.MaxItems;
import cs3500.pa05.model.Task;
import cs3500.pa05.model.TaskJson;
import cs3500.pa05.model.TasksJson;
import cs3500.pa05.model.Theme;
import cs3500.pa05.view.GuiView;
import cs3500.pa05.view.GuiViewImp;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * Controller for interactions between .bujo file and Java Journal.
 */
public class BujoController {
  private String name;
  private Theme theme;
  private int max;
  private List<Event> allEventsList;
  private List<Task> allTasksList;
  private String notes;
  private Stage stage;
  private FileChooser fileChooser;

  /**
   * Controller used to read a file.
   */
  public BujoController() {
    this.name = "";
    this.theme = Theme.LIGHTMODE;
    this.allEventsList = new ArrayList<>();
    this.allTasksList = new ArrayList<>();
    this.notes = "";
    this.stage = new Stage();
    this.fileChooser = new FileChooser();
  }

  /**
   * Constructs a new BujoController.
   *
   * @param name          The name of the Bujo.
   * @param theme         The theme of the Bujo.
   * @param max           The maximum number of items.
   * @param allEventsList The list of all events.
   * @param allTasksList  The list of all tasks.
   * @param notes         The notes for the Bujo.
   */
  public BujoController(String name, Theme theme, int max,
                        List<Event> allEventsList, List<Task> allTasksList, String notes) {
    this.name = name;
    this.theme = theme;
    this.max = max;
    this.allEventsList = allEventsList;
    this.allTasksList = allTasksList;
    this.notes = notes;
    this.stage = new Stage();
    this.fileChooser = new FileChooser();
  }

  /**
   * Saves the Bujo file.
   */
  public void save() {
    fileChooser.setTitle("Save");
    fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter(
        "BUJO files (*.bujo)", "*.bujo"));
    File file = fileChooser.showSaveDialog(stage);

    if (file != null) {
      writeFile(file);
    }
  }

  /**
   * Writes the file passed (Bujo).
   *
   * @param file The file to write the Bujo data to.
   * @throws IllegalStateException If there is no file to write to.
   */
  public void writeFile(File file) {
    try {
      FileWriter fileWriter = new FileWriter(file);
      JsonNode jsonToWrite = weekToJson();
      fileWriter.write(jsonToWrite.toPrettyString());
      fileWriter.close();
    } catch (IOException e) {
      throw new IllegalStateException("No file to write to.");
    }
  }

  /**
   * Opens a .Bujo file
   */
  public void open() {
    fileChooser.setTitle("Open");
    fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter(
        "BUJO files (*.bujo)", "*.bujo"));
    File file = fileChooser.showOpenDialog(stage);

    if (file != null) {
      readFile(file);

      openJournal();
    }
  }

  /**
   * Reads the contents of a JSON file and extracts data
   *
   * @param file The JSON file to read.
   * @throws IllegalStateException If there is no file to read from
   *                               or if an error occurs during reading.
   */
  private void readFile(File file) {
    try {
      ObjectMapper mapper = new ObjectMapper();
      JsonParser parser = mapper.getFactory().createParser(file);

      JournalJson journalJson = parser.readValueAs(JournalJson.class);

      name = journalJson.name();
      theme = journalJson.theme();
      max = journalJson.limit();
      EventsJson eventsJson = journalJson.schedule();
      List<Event> eventList = new ArrayList<>();
      for (EventJson eventJson : eventsJson.events()) {
        eventList.add(new Event(eventJson.name(), eventJson.description(), eventJson.day(),
            eventJson.hour(), eventJson.minute(), eventJson.duration()));
      }
      allEventsList = eventList;
      TasksJson tasksJson = journalJson.todos();
      List<Task> taskList = new ArrayList<>();
      for (TaskJson taskJson : tasksJson.tasks()) {
        taskList.add(new Task(taskJson.name(), taskJson.description(), taskJson.day(),
            taskJson.isComplete()));
      }
      allTasksList = taskList;
      notes = journalJson.notes();
    } catch (IOException e) {
      throw new IllegalStateException("No file to read from.");
    }
  }

  /**
   * Converts the current week data to a JSON representation.
   *
   * @return The JSON representation of the current object.
   */
  private JsonNode weekToJson() {
    List<EventJson> eventJsonList = new ArrayList<>();
    List<TaskJson> taskJsonList = new ArrayList<>();

    for (Event event : allEventsList) {
      EventJson eventJson = new EventJson(event.getName(), event.getDes(), event.getDay(),
          event.getStartHour(), event.getStartMinute(), event.getDuration());
      eventJsonList.add(eventJson);
    }
    EventsJson eventsJson = new EventsJson(eventJsonList);

    for (Task task : allTasksList) {
      TaskJson taskJson =
          new TaskJson(task.getName(), task.getDes(), task.getDay(), task.getIsComplete());
      taskJsonList.add(taskJson);
    }
    TasksJson tasksJson = new TasksJson(taskJsonList);

    JournalJson journalJson =
        new JournalJson(this.name, this.theme, this.max,
            eventsJson, tasksJson, this.notes);
    return JsonUtils.serializeRecord(journalJson);
  }

  /**
   * Opens the journal in a GUI view.
   */
  private void openJournal() {
    Stage stage = new Stage();
    JournalController journalController =
        new JournalController(name, theme, new MaxItems(this.max),
            allEventsList, allTasksList, notes);
    GuiView newView = new GuiViewImp(journalController);
    stage.setScene(newView.load());
    stage.setTitle("Java Journal");
    Image icon = new Image(getClass().getClassLoader()
        .getResourceAsStream("open-book-emoji.png"));
    stage.getIcons().add(icon);
    stage.show();
    journalController.setActionsToButtons();
  }
}

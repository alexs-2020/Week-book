package cs3500.pa05.controller;

import cs3500.pa05.model.AbstractCalendarItem;
import cs3500.pa05.model.CalendarItem;
import cs3500.pa05.model.DayOfWeek;
import cs3500.pa05.model.Event;
import cs3500.pa05.model.MaxItems;
import cs3500.pa05.model.Task;
import cs3500.pa05.model.Theme;
import cs3500.pa05.view.CreateEventViewImp;
import cs3500.pa05.view.CreateTaskViewImp;
import cs3500.pa05.view.GuiView;
import cs3500.pa05.view.MaxNumTextField;
import cs3500.pa05.view.SelectCalendarItemDialog;
import cs3500.pa05.view.WarningView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.converter.IntegerStringConverter;




/**
 * Represents the controller for the journal.
 */
public class JournalController implements Controller {
  @FXML
  private TextField nameForWeek;
  @FXML
  private Label name;
  @FXML
  private Button setName;
  protected List<Task> allTasksList;
  protected List<Event> allEventsList;
  AbstractCalendarItemController itemController;
  @FXML
  private Label maxAmount;
  @FXML
  private Button addToCalendar;
  @FXML
  private MenuButton changeTheme;
  @FXML
  private MenuItem noTheme;
  @FXML
  private MenuItem darkMode;
  @FXML
  private MenuItem beachMode;
  @FXML
  private MenuItem flowerMode;
  @FXML
  private TableView<CalendarItem> sundayTable;
  @FXML
  private TableView<CalendarItem> mondayTable;
  @FXML
  private TableView<CalendarItem> tuesdayTable;
  @FXML
  private TableView<CalendarItem> wednesdayTable;
  @FXML
  private TableView<CalendarItem> thursdayTable;
  @FXML
  private TableView<CalendarItem> fridayTable;
  @FXML
  private TableView<CalendarItem> saturdayTable;
  @FXML
  private AnchorPane taskPane;
  @FXML
  private Button viewTasks;
  private Theme theme;
  @FXML
  private ImageView icon;
  @FXML
  private TextArea quotes;
  @FXML
  private ChoiceBox<String> sortBy;
  @FXML
  private TableColumn<CalendarItem, String> desCol;
  @FXML
  private MaxNumTextField maxField;
  @FXML
  private Button save;
  @FXML
  private Button openFile;
  @FXML
  private TableColumn<CalendarItem, String> nameColTu;
  @FXML
  private TableColumn<CalendarItem, String> desColTu;
  @FXML
  private TableColumn<CalendarItem, String> nameColFr;
  @FXML
  private TableColumn<CalendarItem, String> nameColMo;
  @FXML
  private TableColumn<CalendarItem, String> nameColSa;
  @FXML
  private TableColumn<CalendarItem, String> nameColSu;
  @FXML
  private TableColumn<CalendarItem, String> nameColTh;
  @FXML
  private TableColumn<CalendarItem, String> nameColWe;
  @FXML
  private TableColumn<CalendarItem, String> desColFr;
  @FXML
  private TableColumn<CalendarItem, String> desColMo;
  @FXML
  private TableColumn<CalendarItem, String> desColSa;
  @FXML
  private TableColumn<CalendarItem, String> desColSu;
  @FXML
  private TableColumn<CalendarItem, String> desColTh;
  @FXML
  private TableColumn<CalendarItem, String> desColWe;
  @FXML
  private TableColumn<Event, Integer> startHourFri;
  @FXML
  private TableColumn<Event, Integer> startHourMon;
  @FXML
  private TableColumn<Event, Integer> startHourSat;
  @FXML
  private TableColumn<Event, Integer> startHourSun;
  @FXML
  private TableColumn<Event, Integer> startHourThurs;
  @FXML
  private TableColumn<Event, Integer> startHourTues;
  @FXML
  private TableColumn<Event, Integer> startHourWed;
  @FXML
  private TableColumn<Event, Integer> startMinFri;
  @FXML
  private TableColumn<Event, Integer> startMinMon;
  @FXML
  private TableColumn<Event, Integer> startMinSat;
  @FXML
  private TableColumn<Event, Integer> startMinThurs;
  @FXML
  private TableColumn<Event, Integer> startMinTues;
  @FXML
  private TableColumn<Event, Integer> startMinWed;
  @FXML
  private TableColumn<Event, Integer> startMinSun;

  @FXML
  private TableColumn<Task, Integer> durColSu;
  @FXML
  private TableColumn<Task, Integer> durColMo;
  @FXML
  private TableColumn<Task, Integer> durColTu;
  @FXML
  private TableColumn<Task, Integer> durColWe;
  @FXML
  private TableColumn<Task, Integer> durColTh;
  @FXML
  private TableColumn<Task, Integer> durColFr;
  @FXML
  private TableColumn<Task, Integer> durColSa;
  @FXML
  private Button weekOverview;
  @FXML
  private TableView<Task> sundayTableTa;
  @FXML
  private TableColumn<CalendarItem, String> desColSuTa;
  @FXML
  private TableColumn<CalendarItem, String> nameColSuTa;
  @FXML
  private TableColumn<Task, Boolean> completeColSuTa;
  @FXML
  private TableView<Task> mondayTableTa;
  @FXML
  private TableColumn<CalendarItem, String> desColMoTa;
  @FXML
  private TableColumn<CalendarItem, String> nameColMoTa;
  @FXML
  private TableColumn<Task, Boolean> completeColMoTa;
  @FXML
  private TableView<Task> tuesdayTableTa;
  @FXML
  private TableColumn<CalendarItem, String> desColTuTa;
  @FXML
  private TableColumn<CalendarItem, String> nameColTuTa;
  @FXML
  private TableColumn<Task, Boolean> completeColTuTa;
  @FXML
  private TableView<Task> wednesdayTableTa;
  @FXML
  private TableColumn<CalendarItem, String> desColWeTa;
  @FXML
  private TableColumn<CalendarItem, String> nameColWeTa;
  @FXML
  private TableColumn<Task, Boolean> completeColWeTa;
  @FXML
  private TableView<Task> thursdayTableTa;
  @FXML
  private TableColumn<CalendarItem, String> desColThTa;
  @FXML
  private TableColumn<CalendarItem, String> nameColThTa;
  @FXML
  private TableColumn<Task, Boolean> completeColThTa;
  @FXML
  private TableView<Task> fridayTableTa;
  @FXML
  private TableColumn<CalendarItem, String> desColFrTa;
  @FXML
  private TableColumn<CalendarItem, String> nameColFrTa;
  @FXML
  private TableColumn<Task, Boolean> completeColFrTa;
  @FXML
  private TableView<Task> saturdayTableTa;
  @FXML
  private TableColumn<CalendarItem, String> desColSaTa;
  @FXML
  private TableColumn<CalendarItem, String> nameColSaTa;
  @FXML
  private TableColumn<Task, Boolean> completeColSaTa;
  @FXML
  protected TextField search;
  @FXML
  protected TableView<Task> allTasks;
  @FXML
  private TableColumn<CalendarItem, String> nameCol;
  @FXML
  private TableColumn<Task, Boolean> compCol;
  @FXML
  protected TableView<Task> searchTasks;
  @FXML
  private TableColumn<CalendarItem, String> nameColSearch;
  @FXML
  private TableColumn<Task, Boolean> compColSearch;
  private MaxItems maxItems;
  private String weekTitle;
  private String notes;

  /**
   * Constructs a new JournalController object
   */
  public JournalController() {
    this.weekTitle = "";
    allEventsList = new ArrayList<>();
    allTasksList = new ArrayList<>();
    maxItems = new MaxItems(3);
    this.theme = Theme.LIGHTMODE;
    this.notes = "";
  }

  /**
   * Constructs a new JournalController object with the specified parameters.
   *
   * @param name   The week title.
   * @param theme  The theme of the journal.
   * @param max    The maximum number of items.
   * @param events The list of events.
   * @param tasks  The list of tasks.
   * @param notes  The notes for the journal.
   */
  public JournalController(String name, Theme theme, MaxItems max,
                           List<Event> events, List<Task> tasks, String notes) {
    this.weekTitle = name;
    this.theme = theme;
    this.maxItems = max;
    this.allEventsList = events;
    this.allTasksList = tasks;
    this.notes = notes;
  }

  /**
   * Runs the application.
   */
  @Override
  public void run() {
    initialize();
    setActionsToButtons();
  }

  /**
   * Sets the actions for buttons in the UI.
   */
  public void setActionsToButtons() {
    setName.setOnAction(e -> handleNameChange());
    addToCalendar.setOnAction(e -> handleCreate());
    save.setOnAction(e -> handleSave());
    openFile.setOnAction(e -> handleOpenFile());
    viewTasks.setOnAction(event -> {
      taskPane.setVisible(!taskPane.isVisible());
    });
    weekOverview.setOnAction(event -> handleWeekOverview());
    setThemeButtonActions();
    setName();
    setQuotes();
    maxAmount.setText(Objects.toString(maxItems.getMax()));
  }

  /**
   * Initializes all items on the UI
   */
  @FXML
  private void initialize() {
    initializeAllEvents();
    initializeAllTasks();
    initializeAllColumns();
    handleChangeTheme();
    taskPane.setVisible(false);
    setName();
    setQuotes();
  }

  /**
   * Loads all the Events to the UI
   */
  private void initializeAllEvents() {
    for (Event event : allEventsList) {
      addToEventDay(event);
    }
  }

  /**
   * Loads all the tasks to the UI.
   */
  private void initializeAllTasks() {
    for (Task task : allTasksList) {
      addToTaskDay(task);
      addToTaskPane(task);
    }
  }

  /**
   * Initializes all the column attributes.
   */
  private void initializeAllColumns() {
    initializeNameColumns();
    initializeDescriptionColumns();
    initializeDurationColumns();
    initializeIsCompeteColumns();
    initializeStartHourColumns();
    initializeStartMinuteColumns();
  }

  /**
   * Initializes name columns.
   */
  private void initializeNameColumns() {
    TableColumn<CalendarItem, String>[] nameColumns = new TableColumn[] {
        nameCol, nameColSearch,
        nameColSu, nameColMo, nameColTu, nameColWe, nameColTh, nameColFr, nameColSa,
        nameColSuTa, nameColMoTa, nameColTuTa, nameColWeTa, nameColThTa, nameColFrTa,
        nameColSaTa
    };

    for (TableColumn<CalendarItem, String> column : nameColumns) {
      column.setCellValueFactory(new PropertyValueFactory<>("name"));
      column.setCellFactory(TextFieldTableCell.forTableColumn());
    }
  }

  /**
   * Initializes duration columns.
   */
  private void initializeDurationColumns() {
    TableColumn<CalendarItem, Integer>[] durationColumns = new TableColumn[] {
        durColSu, durColMo, durColTu, durColWe, durColTh, durColFr, durColSa
    };

    for (TableColumn<CalendarItem, Integer> column : durationColumns) {
      column.setCellValueFactory(new PropertyValueFactory<>("duration"));
      column.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
    }
  }

  /**
   * Initializes description columns.
   */
  private void initializeDescriptionColumns() {
    TableColumn<CalendarItem, String>[] descriptionColumns = new TableColumn[] {
        desColSu, desColMo, desColTu, desColWe, desColTh, desColFr, desColSa,
        desColSuTa, desColMoTa, desColTuTa, desColWeTa, desColThTa, desColFrTa, desColSaTa
    };

    for (TableColumn<CalendarItem, String> column : descriptionColumns) {
      column.setCellValueFactory(new PropertyValueFactory<>("des"));
      column.setCellFactory(TextFieldTableCell.forTableColumn());
    }
  }

  /**
   * Initialize isComplete columns.
   */
  private void initializeIsCompeteColumns() {
    TableColumn<Task, Boolean>[] isCompleteColumns = new TableColumn[] {
        completeColSuTa, completeColMoTa, completeColTuTa, completeColWeTa, completeColThTa,
        completeColFrTa, completeColSaTa
    };

    for (TableColumn<Task, Boolean> column : isCompleteColumns) {
      column.setCellValueFactory(new PropertyValueFactory<>("isComplete"));
    }

    compCol.setCellValueFactory(new PropertyValueFactory<>("isComplete"));
    compColSearch.setCellValueFactory(new PropertyValueFactory<>("isComplete"));
  }

  /**
   * Initializes start hour columns.
   */
  private void initializeStartHourColumns() {
    TableColumn<Event, Integer>[] hourColumns = new TableColumn[] {
        startHourSun, startHourMon, startHourTues, startHourWed,
        startHourThurs, startHourFri, startHourSat
    };

    for (TableColumn<Event, Integer> column : hourColumns) {
      column.setCellValueFactory(new PropertyValueFactory<>("startHour"));
      column.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
    }
  }

  /**
   * Initializes start minute columns.
   */
  private void initializeStartMinuteColumns() {
    TableColumn<Event, Integer>[] minColumns = new TableColumn[] {
        startMinSun, startMinMon, startMinTues, startMinWed,
        startMinThurs, startMinFri, startMinSat
    };

    for (TableColumn<Event, Integer> column : minColumns) {
      column.setCellValueFactory(new PropertyValueFactory<>("startMinute"));
      column.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
    }
  }

  /**
   * Handles the action of changing the week name.
   * Updates the weekTitle with the new name
   */
  @FXML
  private void handleNameChange() {
    this.weekTitle = this.nameForWeek.getText();
    setName();
  }

  @FXML
  private void handleNameChange(TableColumn.CellEditEvent<AbstractCalendarItem, String> e) {
    e.getRowValue().setName(e.getNewValue());
    e.getTableView().refresh();
    this.allTasks.refresh();
  }

  @FXML
  private void handleDesChange(TableColumn.CellEditEvent<AbstractCalendarItem, String> e) {
    e.getRowValue().setDes(e.getNewValue());
    e.getTableView().refresh();
    this.allTasks.refresh();
  }

  @FXML
  private void handleDurChange(TableColumn.CellEditEvent<Event, Integer> e) {
    e.getRowValue().setDuration(e.getNewValue());
    e.getTableView().refresh();
    this.allTasks.refresh();
  }

  @FXML
  private void handleHrChange(TableColumn.CellEditEvent<Event, Integer> e) {
    e.getRowValue().setHr(e.getNewValue());
    e.getTableView().refresh();
    this.allTasks.refresh();
  }

  @FXML
  private void handleMinChange(TableColumn.CellEditEvent<Event, Integer> e) {
    e.getRowValue().setMin(e.getNewValue());
    e.getTableView().refresh();
    this.allTasks.refresh();
  }

  /**
   * @param choice either a task or event
   */
  private void handleChoice(String choice) {
    //either get passed json or something with the data
    if (choice.equals("Task")) {
      CreateTaskController createTask =
          new CreateTaskController(theme);
      GuiView taskView = new CreateTaskViewImp(createTask, theme);
      taskView.load();
      createTask.initialize();
      createTask.run();
      createTask.stage.setOnHidden(event -> {
        Task taskToSubmit = createTask.getItemToSubmit();
        if (!maxItems.moreThanMaxTasks(taskToSubmit)) {
          this.allTasksList.add(taskToSubmit);
          addToTaskPane(taskToSubmit);
          addToTaskDay(taskToSubmit);
        } else {
          handleMaxWarning();
        }
      });
    } else {
      CreateEventController createEvent = new CreateEventController(theme);
      GuiView eventView = new CreateEventViewImp(createEvent, theme);
      eventView.load();

      createEvent.initialize();
      createEvent.run();

      createEvent.stage.setOnHidden(event -> {
        Event eventToSubmit = createEvent.getItemToSubmit();
        if (!maxItems.moreThanMaxEvents(eventToSubmit)) {
          this.allEventsList.add(eventToSubmit);
          addToEventDay(eventToSubmit);
        } else {
          handleMaxWarning();
        }
      });
    }
  }

  /**
   * Handles the save button action by creating a new BujoController instance
   * and invoking the save() method to save the Bujo data to a file.
   */
  private void handleSave() {
    BujoController bujoController = new BujoController(
        this.name.getText(), this.theme, this.maxItems.getMax(),
        this.allEventsList, this.allTasksList, this.quotes.getText());
    bujoController.save();
  }

  /**
   * Handles the open file button action by creating a new BujoController instance
   * and invoking the open() method to open a Bujo from a file.
   */
  private void handleOpenFile() {
    BujoController bujoController = new BujoController();
    bujoController.open();
  }

  /**
   * Sets appropriate action on theme menu buttons.
   */
  private void setThemeButtonActions() {
    noTheme.setOnAction(e -> buttonChangeTheme(Theme.LIGHTMODE));
    darkMode.setOnAction(e -> buttonChangeTheme(Theme.DARKMODE));
    beachMode.setOnAction(e -> buttonChangeTheme(Theme.BEACHMODE));
    flowerMode.setOnAction(e -> buttonChangeTheme(Theme.FLOWERMODE));
  }

  /**
   * Changes the theme according to given theme.
   *
   * @param theme Week View theme
   */
  private void buttonChangeTheme(Theme theme) {
    setTheme(theme);
    handleChangeTheme();
  }

  /**
   * Clears the CSS files from the scene's stylesheets list, removing all applied styles.
   */
  @FXML
  private void clearCssFiles() {
    changeTheme.getScene().getStylesheets().clear();
  }

  /**
   * Sets the theme of the BujoController.
   *
   * @param theme The theme to set.
   */
  private void setTheme(Theme theme) {
    this.theme = theme;
  }

  /**
   * Handles the change theme button action by applying the selected theme to the BujoController.
   * If the theme is LIGHTMODE, clears the CSS files and changes the icon accordingly.
   * Otherwise, loads the CSS file associated with the theme, clears previous CSS files,
   * and adds the new CSS file to the scene's stylesheets list. Also updates the icon.
   */
  @FXML
  private void handleChangeTheme() {
    if (theme == Theme.LIGHTMODE) {
      clearCssFiles();
      changeIcon();
      return;
    }
    String css = getClass().getClassLoader().getResource(theme.getCssFile()).toExternalForm();
    clearCssFiles();
    changeTheme.getScene().getStylesheets().add(css);
    changeIcon();
  }

  /**
   * Changes the icon of the BujoController based on the selected theme.
   * Loads the icon file associated with the theme and sets it as the image of the icon ImageView.
   */
  @FXML
  private void changeIcon() {
    Image img = new Image(getClass().getClassLoader()
        .getResource(theme.getIconFile()).toExternalForm());
    icon.setImage(img);
  }

  /**
   * Sets the maximum number of items allowed in the BujoController
   * Also updates the maxAmount label to display the new maximum value.
   * If the maximum number is set to a value lower than the number of items
   * currently in the display, handleMaxWarning() is triggered.
   *
   * @param event The ActionEvent triggered by the "Set Max" button.
   */
  @FXML
  private void setMax(ActionEvent event) {
    if (!this.maxField.getText().equals("")) {
      int max = Integer.parseInt(this.maxField.getText());
      maxItems.setMax(max);
      maxAmount.setText(Objects.toString(max));
      if (maxItems.checkMax()) {
        handleMaxWarning();
      }
    }
  }

  /**
   * Handles the maximum number of items warning by displaying a warning message to the user.
   * .
   */
  public void handleMaxWarning() {
    WarningController warning = new WarningController(theme);
    GuiView warningView = new WarningView(warning, theme);
    warningView.load();
    warning.run();
  }

  /**
   * Adds the event item to the day view it corresponds to.
   *
   * @param event the item to be added
   */
  @FXML
  private void addToEventDay(Event event) {
    DayOfWeek day = event.getDay();
    if (day == DayOfWeek.SUNDAY) {
      sundayTable.getItems().add(event);
    } else if (day == DayOfWeek.MONDAY) {
      mondayTable.getItems().add(event);
    } else if (day == DayOfWeek.TUESDAY) {
      tuesdayTable.getItems().add(event);
    } else if (day == DayOfWeek.WEDNESDAY) {
      wednesdayTable.getItems().add(event);
    } else if (day == DayOfWeek.THURSDAY) {
      thursdayTable.getItems().add(event);
    } else if (day == DayOfWeek.FRIDAY) {
      fridayTable.getItems().add(event);
    } else {
      saturdayTable.getItems().add(event);
    }
    maxItems.addEventToList(day, event);
  }

  /**
   * Adds the task to the day view it corresponds to.
   *
   * @param task the task to be added
   */
  @FXML
  private void addToTaskDay(Task task) {
    DayOfWeek day = task.getDay();
    if (day == DayOfWeek.SUNDAY) {
      sundayTableTa.getItems().add(task);
    } else if (day == DayOfWeek.MONDAY) {
      mondayTableTa.getItems().add(task);
    } else if (day == DayOfWeek.TUESDAY) {
      tuesdayTableTa.getItems().add(task);
    } else if (day == DayOfWeek.WEDNESDAY) {
      wednesdayTableTa.getItems().add(task);
    } else if (day == DayOfWeek.THURSDAY) {
      thursdayTableTa.getItems().add(task);
    } else if (day == DayOfWeek.FRIDAY) {
      fridayTableTa.getItems().add(task);
    } else {
      saturdayTableTa.getItems().add(task);
    }
    maxItems.addTaskToList(day, task);
  }


  /**
   * Handles creating a dialog which prompts user to choose either to create
   * a task or an event, then shows correct custom dialog for creating either
   * a task or event.
   */

  @FXML
  private void handleCreate() {
    Dialog<String> calendarItemDialog = new SelectCalendarItemDialog(theme);
    Optional<String> result = calendarItemDialog.showAndWait();
    if (result.isPresent()) {
      String calendarItem = result.get();
      handleChoice(calendarItem);
    }
  }
  /**
   * Adds a Task to the sidebar pane
   *
   * @param task The Task to be added to the sidebar
   */

  private void addToTaskPane(Task task) {
    this.allTasks.getItems().add(task);
  }

  /**
   * Handles the action of displaying the weekly overview.
   * Creates a WeeklyOverviewController with
   * the list of all tasks and events, and the selected theme.
   * Runs the weekly overview controller to display the weekly overview.
   */
  private void handleWeekOverview() {
    WeeklyOverviewController weeklyOverview = new WeeklyOverviewController(allTasksList,
        allEventsList, theme);
    weeklyOverview.run();
  }

  /**
   * Handles the action of changing the current task status
   * Identifies the Task which is being clicked and switches its isComplete value
   */
  @FXML
  private void setComplete(MouseEvent event) {
    if (event.getClickCount() == 3) {
      String id = ((Node) event.getSource()).getId();
      switch (id) {
        case "sundayTableTa" -> {
          sundayTableTa.getSelectionModel().getSelectedItem().changeStatus();
          sundayTableTa.refresh();
        }
        case "mondayTableTa" -> {
          mondayTableTa.getSelectionModel().getSelectedItem().changeStatus();
          mondayTableTa.refresh();
        }
        case "tuesdayTableTa" -> {
          tuesdayTableTa.getSelectionModel().getSelectedItem().changeStatus();
          tuesdayTableTa.refresh();
        }
        case "wednesdayTableTa" -> {
          wednesdayTableTa.getSelectionModel().getSelectedItem().changeStatus();
          wednesdayTableTa.refresh();
        }
        case "thursdayTableTa" -> {
          thursdayTableTa.getSelectionModel().getSelectedItem().changeStatus();
          thursdayTableTa.refresh();
        }
        case "fridayTableTa" -> {
          fridayTableTa.getSelectionModel().getSelectedItem().changeStatus();
          fridayTableTa.refresh();
        }
        case "saturdayTableTa" -> {
          saturdayTableTa.getSelectionModel().getSelectedItem().changeStatus();
          saturdayTableTa.refresh();
        }
        default -> {
        }
      }
    }
    allTasks.refresh();
  }

  /**
   * Sets the name label to display the current weekTitle.
   */
  @FXML
  private void setName() {
    this.name.setText(this.weekTitle);
  }

  /**
   * Sets the quotes TextArea to display the notes.
   */
  @FXML
  private void setQuotes() {
    this.quotes.setText(this.notes);
  }

  /**
   * Searches for tasks based on the text entered in the search TextField.
   * Updates the searchTasks ListView with the search results.
   *
   * @param event The KeyEvent triggering the search.
   */
  @FXML
  private void searchTasks(KeyEvent event) {
    this.searchTasks.getItems().removeAll();
    if (!this.search.getText().trim().isEmpty()) { //make sure not empty space
      this.searchTasks.setItems(search(this.search.getText()));
    }
  }

  /**
   * Searches for tasks that contain the specified text.
   *
   * @param s The text to search for.
   * @return An ObservableList of tasks that match the search criteria.
   */
  private ObservableList<Task> search(String s) {
    ObservableList<Task> searchResults = FXCollections.observableArrayList();
    for (Task singleTask : this.allTasksList) {
      if (singleTask.toString().contains(s)) {
        searchResults.add(singleTask);
      }
    }
    return searchResults;
  }
}

package cs3500.pa05.view;

import cs3500.pa05.model.Theme;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.util.Callback;

/**
 * Dialog for selecting a calendar item to create, which results in either a dialog
 * for creating an event or a task.
 */
public class SelectCalendarItemDialog extends Dialog<String> {
  private String calendarItem;
  private ChoiceBox<String> itemChoiceBox;

  private static final ObservableList<String> itemList =
      FXCollections.observableArrayList("Event", "Task");

  /**
   * Instantiates a dialog for choosing which calendar item to add.
   */
  public SelectCalendarItemDialog(Theme theme) {
    super();
    this.setTitle("Select item");
    getDialogPane().setContent(buildUi());

    itemChoiceBox.getSelectionModel().selectedIndexProperty().addListener(
        (observable, oldValue, newValue) -> calendarItem = itemList.get(newValue.intValue()));

    getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

    if (theme != Theme.LIGHTMODE) {
      getDialogPane().getStylesheets().add(theme.getCssFile());
    }
    setResultConverter();
  }

  /**
   * Creates the UI for the calendar item selection dialog.
   *
   * @return gui for selecting a calendar item
   */
  private HBox buildUi() {
    HBox content = new HBox(10);
    Label chooseText = new Label("Choose: ");
    itemChoiceBox = new ChoiceBox<>();
    itemChoiceBox.setItems(itemList);
    content.getChildren().addAll(chooseText, itemChoiceBox);
    return content;
  }

  /**
   * Sets the result to be returned to chosen calendar item in dropdown box.
   */
  private void setResultConverter() {
    Callback<ButtonType, String> dialogResultConverter = param -> {
      if (param == ButtonType.OK) {
        return calendarItem;
      } else {
        return null;
      }
    };
    setResultConverter(dialogResultConverter);
  }
}

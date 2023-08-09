package cs3500.pa05;

import cs3500.pa05.controller.BujoController;
import cs3500.pa05.controller.JournalController;
import cs3500.pa05.view.GuiView;
import cs3500.pa05.view.GuiViewImp;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Represents a Java Journal.
 */
public class Driver extends Application {

  /**
  * Starts the GUI for Java Journal.
  *
  * @param stage the primary stage for this application, onto which
   *              the application scene can be set.
   *              Applications may create other stages, if needed, but they will not be
   *              primary stages.
  */
  @Override
  public void start(Stage stage) {
    JournalController journalController = new JournalController();
    GuiView guiView = new GuiViewImp(journalController);

    try {
      Scene scene = guiView.load();
      stage.setScene(scene);
      Image icon = new Image(getClass().getClassLoader()
          .getResourceAsStream("open-book-emoji.png"));
      stage.getIcons().add(icon);
      stage.setTitle("Java Journal");
      stage.show();
      journalController.run();
    } catch (IllegalStateException exc) {
      System.err.println("Unable to load GUI.");
    }
  }

  /**
   * Entry point for a session of Java Journal.
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch();
  }
}
package GUI.JavaFX.components;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class P05_Menu extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        MenuBar menuBar = new MenuBar();

        Menu menuFile = new Menu("File");
        MenuItem menuItemNew = new MenuItem("New");
        MenuItem menuItemOpen = new MenuItem("Open");
        menuFile.getItems().addAll(menuItemNew, menuItemOpen);

        menuBar.getMenus().add(menuFile);

        VBox root = new VBox();
        root.getChildren().add(menuBar);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Menu Example");
        primaryStage.show();
    }

}

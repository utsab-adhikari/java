
package GUI.JavaFX.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class P05_GridPane extends Application {
    public static void main(String[] arr) {
        launch(arr);
    }
    public void start(Stage primaryStage) {
        Button b1 = new Button("Press Me");
        Button b2 = new Button("Button 02");
        Button b3 = new Button("Button 03");
        Button b4 = new Button("Button 04");
        Button b5 = new Button("Button 05");
        Button b6 = new Button("Button 05");

        GridPane root = new GridPane();
        root.setPadding(new Insets(5));
        root.setHgap(10);
        root.setVgap(10);

        root.add(b1, 0, 0);
        root.add(b2, 1, 0);
        root.add(b3, 0, 1);
        root.add(b4, 1, 1);
        root.add(b5, 0, 2);
        root.add(b6, 1, 2);

        Scene s1= new Scene(root, 400, 400);
        primaryStage.setTitle("JavaFX Layout - GridPane");
        primaryStage.setScene(s1);
        primaryStage.show();
    }
}
package GUI.JavaFX.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class P04_BorderPane extends  Application{
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

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(5));

        root.setTop(b1);
        root.setBottom(b2);
        root.setRight(b3);
        root.setLeft(b4);
        root.setCenter(b5);

        Scene s1= new Scene(root, 400, 400);
        primaryStage.setTitle("JavaFX Layout - BorderPane");
        primaryStage.setScene(s1);
        primaryStage.show();
    }
}
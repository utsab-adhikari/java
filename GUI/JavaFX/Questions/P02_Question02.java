package GUI.JavaFX.Questions;

/*
Write a javaFx program to create a form to read two numbers and display their sum on button
click.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;

public class P02_Question02 extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  public void start(Stage primaryStage) throws Exception {
    Label l1 = new Label("First Number:");
    Label l2 = new Label("Second Number:");
    Label l3 = new Label("Result:");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    t3.setEditable(false);

    Button b1 = new Button("Sum");

    GridPane root = new GridPane();
    root.setPadding(new Insets(5));
    root.setHgap(10);
    root.setVgap(10);

    root.add(l1, 0, 0);
    root.add(t1, 1, 0);

    root.add(l2, 0, 1);
    root.add(t2, 1, 1);

    root.add(l3, 0, 2);
    root.add(t3, 1, 2);

    root.add(b1, 1, 3);

    Scene s1 = new Scene(root, 500, 500);
    primaryStage.setTitle("Question - 02");
    primaryStage.setScene(s1);
    primaryStage.show();

    b1.setOnAction(new EventHandler<ActionEvent> () {
      public void handle(ActionEvent e) {
        t3.setText(""+(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText())));
      }
    });
  }
}

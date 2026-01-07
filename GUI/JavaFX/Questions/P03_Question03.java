package GUI.JavaFX.Questions;

/*
Write down the javaFx code to design a login page as shown in the figure below when user
click on login button test the username is “NCIT” and password “NCIT@2024Spring” or
not.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class P03_Question03 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Label title = new Label("Welcome");
        title.setStyle("-fx-font: bold 30px 'serif'");
        Label l1 = new Label("User Name:");
        Label l2 = new Label("Password:");

        TextField t1 = new TextField();
        PasswordField p1 = new PasswordField();

        Button b1 = new Button("Sign In");

        GridPane root = new GridPane();
        root.setPadding(new Insets(5));
        root.setHgap(10);
        root.setVgap(10);

        root.add(title, 0, 0);
        root.add(l1, 0, 1);
        root.add(t1, 1, 1);
        root.add(l2, 0, 2);
        root.add(p1, 1, 2);
        root.add(b1, 2, 3);

        Scene s1 = new Scene(root, 400, 400);
        primaryStage.setTitle("JavaFX Welcome");
        primaryStage.setScene(s1);
        primaryStage.show();

        b1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                if (t1.getText().equals("NCIT") && p1.getText().equals("NCIT@2024Spring")) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Information");
                    alert.setHeaderText("Success"); 
                    alert.setContentText("Valid User Name and Password");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("Something went wrong");
                    alert.setContentText("Invalid inpuUser Name and Password!");
                    alert.showAndWait();
                }
            }
        });

    }

}

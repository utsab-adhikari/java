package GUI.JavaFX.components;

import javafx.scene.control.PasswordField;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class P04_PasswordField extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        PasswordField passwordField = new PasswordField();

        VBox root = new VBox();
        root.getChildren().add(passwordField);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PasswordField Example");
        primaryStage.show();
    }

}
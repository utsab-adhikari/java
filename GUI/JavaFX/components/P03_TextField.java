package GUI.JavaFX.components;

import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class P03_TextField extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        TextField textField = new TextField();

        VBox root = new VBox();
        root.getChildren().add(textField);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TextField Example");
        primaryStage.show();
    }

}
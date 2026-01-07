package GUI.JavaFX.components;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class P02_Button extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("Click Me");

        VBox root = new VBox();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Button Example");
        primaryStage.show();
    }

}

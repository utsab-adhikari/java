package GUI.JavaFX.components;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class P01_Label extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("This is a label");
        
        VBox root = new VBox();
        root.getChildren().add(label);
        
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Label Example");
        primaryStage.show();
    }
}
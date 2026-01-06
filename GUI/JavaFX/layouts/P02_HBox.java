package GUI.JavaFX.layouts;

import javafx.scene.layout.HBox;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class P02_HBox extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("button 01");
        Button b2 = new Button("button 02");
        Button b3 = new Button("button 03");
        
        HBox root = new HBox(10);
        root.getChildren().add(b1);
        root.getChildren().add(b2);
        root.getChildren().add(b3);
    
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("HBox Example");
        primaryStage.show();
    }
}
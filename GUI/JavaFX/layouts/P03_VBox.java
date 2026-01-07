package GUI.JavaFX.layouts;

import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class P03_VBox extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("button 01");
        Button b2 = new Button("button 02");
        Button b3 = new Button("button 03");
        
        VBox root = new VBox(10);
        root.setPadding(new Insets(5));
        root.setAlignment(Pos.BASELINE_RIGHT);
        root.getChildren().add(b1);
        root.getChildren().add(b2);
        root.getChildren().add(b3);
    
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("HBox Example");
        primaryStage.show();
    }
}
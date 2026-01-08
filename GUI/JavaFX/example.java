package GUI.JavaFX; 

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Orientation;


public class  example extends Application {
    public static void main(String arr[]) {
        launch(arr);
    }

    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("button 01");
        Button b2 = new Button("button 03");
        Button b3 = new Button("button 02");
        
        FlowPane root = new FlowPane(Orientation.HORIZONTAL, 10, 10);
        root.getChildren().add(b1);
        root.getChildren().add(b2);
        root.getChildren().add(b3);
    
        Scene s1 = new Scene(root, 400, 400);
        primaryStage.setScene(s1);
        primaryStage.setTitle("Javafx example");
        primaryStage.show();
    }
}

package GUI.JavaFX.Questions;

import java.util.Observable;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ListView;
import javafx.geometry.Insets;

public class P01_Question01 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        Label l1 = new Label("Name");
        Label l2 = new Label("Date Of Birth");
        Label l3 = new Label("Gender");
        Label l4 = new Label("Your Skills");
        Label l5 = new Label("Aceademic Qualification");
        Label l6 = new Label("Location");

        TextField t1 = new TextField();
        DatePicker dp = new DatePicker();

        RadioButton rb1 = new RadioButton("Male");
        RadioButton rb2 = new RadioButton("Female");
        RadioButton rb3 = new RadioButton("Other");

        ToggleGroup tg = new ToggleGroup();
        rb1.setToggleGroup(tg);
        rb2.setToggleGroup(tg);
        rb3.setToggleGroup(tg);

        CheckBox cb1 = new CheckBox("Java");
        CheckBox cb2 = new CheckBox("Python");
        CheckBox cb3 = new CheckBox("DotNet");

        ObservableList<String> data = FXCollections.observableArrayList("BSc.CSIT", "BIT", "BCA", "BE.Computer", "BE.IT");
        ListView<String> lv = new ListView<>(data);
        lv.setPrefSize(50, 100);

        ChoiceBox cob = new ChoiceBox();
        cob.getItems().addAll("Kathmandu", "Bhaktapur", "Pokhara", "Lalitpur", "Dhading");

        Button bt1 = new Button("Submit");
        Button bt2 = new Button("Clear");

        GridPane root = new GridPane();
        root.setPadding(new Insets(10));
        root.setVgap(10);
        root.setHgap(10);

        root.add(l1, 0, 0);
        root.add(t1, 1, 0); 
        root.add(l2, 0, 1);
        root.add(dp, 1, 1);
        root.add(l3, 0, 2);
        root.add(rb1, 1, 2);
        root.add(rb2, 2, 2);
        root.add(rb3, 3, 2);
        root.add(l4, 0, 3);
        root.add(cb1, 1, 3);
        root.add(cb2, 2, 3);
        root.add(cb3, 3, 3);
        root.add(l5, 0, 4);
        root.add(lv, 1, 4);
        root.add(l6, 0, 5);
        root.add(cob, 1, 5);
        root.add(bt1, 1, 10);
        root.add(bt2, 2, 10);

        Scene s1 = new Scene(root, 700, 300);
        primaryStage.setScene(s1);
        primaryStage.setTitle("Registration Form");
        primaryStage.show();

    }

}
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import sample.classes.Student;

public class Main extends Application {
    Stage window;
    Student test = new Student("Volga", "Undal", "47833623", "240994");
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        Button test = new Button("add");
        GridPane gridPane = new GridPane();
        
        window.setTitle("School management system");
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

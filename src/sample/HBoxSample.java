package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//import java.awt.*;

public class HBoxSample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root, 300, 275));
        Label emailLabel = new Label("Email:");
        TextField emailTxt = new TextField();
        emailTxt.setPrefColumnCount(20);
        emailTxt.setPromptText("your email");
        Button submitButton = new Button("submit");
//        HBox emailBOx = new HBox(7);
        VBox emailBOx = new VBox(7) ;
        emailBOx.setPadding(new Insets(3));
        emailBOx.getChildren().addAll(emailLabel, emailTxt, submitButton);
        Scene scene = new Scene(emailBOx, 750, 100);
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

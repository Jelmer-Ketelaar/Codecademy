package com.codecademy.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Welcome to Codecademy");

        // Create welcomeTitle
        Text welcomeTitle = new Text("Welcome");
        welcomeTitle.setFont(new Font(46));

        // Create startButton
        Button startButton = new Button("Start");
        startButton.setOnAction(event -> {
            // voer hier de code uit die je wilt uitvoeren wanneer de knop wordt ingedrukt
        });

        // Create vBoxWelcome
        VBox vBoxWelcome = new VBox(10);
        vBoxWelcome.setAlignment(Pos.CENTER);
        vBoxWelcome.getChildren().addAll(welcomeTitle, startButton);

        // Create welcomeAnchor
        AnchorPane welcomeAnchor = new AnchorPane(vBoxWelcome);
        AnchorPane.setTopAnchor(vBoxWelcome, 0.0);
        AnchorPane.setBottomAnchor(vBoxWelcome, 0.0);
        AnchorPane.setLeftAnchor(vBoxWelcome, 0.0);
        AnchorPane.setRightAnchor(vBoxWelcome, 0.0);

        // Set the scene
        Scene scene = new Scene(welcomeAnchor, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

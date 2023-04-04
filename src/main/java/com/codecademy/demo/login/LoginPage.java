package com.codecademy.demo.login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashMap;

public class LoginPage extends Application {
    private final HashMap<String, String> registeredUsers = new HashMap<>();

    private TextField registerUsernameField;
    private PasswordField registerPasswordField;
    private TextField loginUsernameField;
    private PasswordField loginPasswordField;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Login Page");

        Label registerTitle = new Label("Register");
        registerUsernameField = new TextField();
        registerUsernameField.setPromptText("Enter username");
        registerPasswordField = new PasswordField();
        registerPasswordField.setPromptText("Enter password");
        Button registerButton = new Button("Register");
        registerButton.setOnAction(event -> register());

        Label loginTitle = new Label("Login");
        loginUsernameField = new TextField();
        loginUsernameField.setPromptText("Enter username");
        loginPasswordField = new PasswordField();
        loginPasswordField.setPromptText("Enter password");
        Button loginButton = new Button("Login");
        loginButton.setOnAction(event -> login());

        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.getChildren().addAll(registerTitle, registerUsernameField, registerPasswordField, registerButton,
                loginTitle, loginUsernameField, loginPasswordField, loginButton);

        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
    }

    private void register() {
        String username = registerUsernameField.getText();
        String password = registerPasswordField.getText();

        if (isValidRegistration(username, password)) {
            // register user with provided username and password
            registeredUsers.put(username, password);
            System.out.println("User registered successfully");
        } else {
            System.out.println("Invalid registration data");
        }
    }


    private void login() {
        String username = loginUsernameField.getText();
        String password = loginPasswordField.getText();

        // TODO: Open main application window
    }

    private boolean isValidLogin(String username, String password) {
        // Check if username and password are not empty
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }

        // Check if the provided username and password match a registered user
        // Here you would typically check against a database or some other data source
        // Now we will use hardcoded values
        return username.equals("testuser") && password.equals("testpassword");
    }

    private boolean isValidRegistration(String username, String password) {
        // Check if username and password are not empty
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }

        // Check if the provided username is not already registered and the password meets certain requirements
        // Here you would typically check against a database or some other data source
        // Now we will use hardcoded values
        return !username.equals("testuser") && password.length() >= 8;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

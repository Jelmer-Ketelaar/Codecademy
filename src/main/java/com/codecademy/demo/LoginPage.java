package com.codecademy.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class LoginPage {

    @FXML
    private VBox vBoxLogin;

    @FXML
    private AnchorPane anchorLogin;

    @FXML
    private TextField loginUsername;

    @FXML
    private TextField loginPassword;

    @FXML
    private Text loginTitle;

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    public void initialize() {
        loginButton.setOnAction(event -> login());
        registerButton.setOnAction(event -> submit());
    }

    private void login() {
        // logica voor inloggen
    }

    private void submit() {
        // logica voor registreren
    }
}

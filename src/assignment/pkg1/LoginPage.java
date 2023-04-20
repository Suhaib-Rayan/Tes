/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class LoginPage extends VBox {
    private TextField usernameField = new TextField();
    private PasswordField passwordField = new PasswordField();
    private Button loginButton = new Button("Login");

    public LoginPage() {
        setSpacing(10);
        setPadding(new Insets(10));
        setAlignment(Pos.CENTER);

        usernameField.setPromptText("Username");
        passwordField.setPromptText("Password");

        loginButton.setDefaultButton(true);

        getChildren().addAll(usernameField, passwordField, loginButton);
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return passwordField.getText();
    }

    public void setLoginButtonAction(Runnable action) {
        loginButton.setOnAction(e -> action.run());
    }

    public void clearFields() {
        usernameField.clear();
        passwordField.clear();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class CurrencyConversionPage extends VBox {
    private TextField dollarField = new TextField();
    private TextField shekelField = new TextField();
    private Button convertButton = new Button("Convert");
    private Button logoutButton = new Button("Logout");

    public CurrencyConversionPage() {
        setSpacing(10);
        setPadding(new Insets(10));
        setAlignment(Pos.CENTER);

        dollarField.setPromptText("Dollar amount");
        shekelField.setPromptText("Shekel amount");
        shekelField.setEditable(false);

        convertButton.setDefaultButton(true);
        logoutButton.setOnAction(e -> {});

        getChildren().addAll(dollarField, shekelField, convertButton, logoutButton);
    }

    public String getDollarAmount() {
        return dollarField.getText();
    }

    public void setShekelAmount(String amount) {
        shekelField.setText(amount);
    }

    public void setConvertButtonAction(Runnable action) {
        convertButton.setOnAction(e -> action.run());
    }

    public void setLogoutButtonAction(Runnable action) {
        logoutButton.setOnAction(e -> action.run());
    }

    public void clearFields() {
        dollarField.clear();
        shekelField.clear();
    }
}
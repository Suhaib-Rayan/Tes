/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.beans.value.*;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class CurrencyConversionSystem extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    private TextField dollarField;

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    // Model
    static class CurrencyConverter {
        private DoubleProperty dollarAmount = new SimpleDoubleProperty();
        private DoubleProperty shekelAmount = new SimpleDoubleProperty();

        public DoubleProperty dollarAmountProperty() {
            return dollarAmount;
        }

        public DoubleProperty shekelAmountProperty() {
            return shekelAmount;
        }

        public void convertDollarToShekel() {
            double amount = dollarAmount.get();
            double conversionRate = 3.52; // example conversion rate
            double convertedAmount = amount * conversionRate;
            shekelAmount.set(convertedAmount);
        }

        public void convertShekelToDollar() {
            double amount = shekelAmount.get();
            double conversionRate = 0.28; // example conversion rate
            double convertedAmount = amount * conversionRate;
            dollarAmount.set(convertedAmount);
        }
    }


    



        public TextField getDollarAmount() {
            return dollarField;
        }}
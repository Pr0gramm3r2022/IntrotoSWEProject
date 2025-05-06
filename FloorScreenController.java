package com.example.prototyping2;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;

import java.awt.*;

import static java.awt.Color.green;


public class FloorScreen extends Application {

    private static final int NUM_TABLES = 30;
    private static final int TABLE_SIZE = 100; // Size of each table

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();  // Grid to hold the tables

        // Create tables and add them to the grid
        for (int i = 0; i < NUM_TABLES; i++) {
            int row = i / 6;  // 6 tables per row
            int col = i % 6;

            // Create table
            Rectangle table = createTable(i);
            grid.add(table, col, row);
        }

        // Set the scene and stage
        Scene scene = new Scene(grid, 800, 600);
        primaryStage.setTitle("The Tasty Spoon - Floor Screen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to create a table (a colored rectangle)
    private Rectangle createTable(int tableId) {
        Rectangle table = new Rectangle(TABLE_SIZE, TABLE_SIZE);
        table.setFill(green)// Default color (available)

        // Set event on clicking the table
        table.setOnMouseClicked(event -> {
            handleTableSelection(tableId);
        });

        return table;
    }

    // Handle table selection
    private void handleTableSelection(int tableId) {
        System.out.println("Table " + tableId + " selected.");
    }

    private Rectangle createTable(int tableId) {
        Rectangle table = new Rectangle(TABLE_SIZE, TABLE_SIZE);

        if (tableId % 3 == 0) {
            table.setFill(Color.RED);  // Occupied
        } else if (tableId % 3 == 1) {
            table.setFill(Color.YELLOW);  // Reserved
        } else {
            table.setFill(Color.GREEN);  // Available
        }

        // Set event on clicking the table
        table.setOnMouseClicked(event -> {
            handleTableSelection(tableId);
        });

        return table;
        private void handleTableSelection ( int tableId){
            System.out.println("Table " + tableId + " selected.");

        }
        private void showTableDetails ( int tableId){
            Stage detailsStage = new Stage();
            GridPane orderGrid = new GridPane();


            orderGrid.add(new javafx.scene.control.Label("Order details for Table " + tableId), 0, 0);

            Scene orderScene = new Scene(orderGrid, 400, 300);
            detailsStage.setTitle("Table " + tableId + " Orders");
            detailsStage.setScene(orderScene);
            detailsStage.show();
        }
    }
}

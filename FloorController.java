package com.example.jsrestaurantautomation;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import java.util.ArrayList;
import java.util.List;

public class FloorController {
    private Waiter waiter;

    @FXML
    private ListView<String> menuListView;

    private List<String> orderQueue = new ArrayList<>();

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
        System.out.println("Logged in as: " + waiter.getName());
    }

    @FXML
    public void initialize() {
        menuListView.getItems().addAll("Burger", "Pizza", "Coke", "Salad");
    }

    @FXML
    private void handleAddToOrder() {
        String selectedItem = menuListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            orderQueue.add(selectedItem);
            System.out.println("Order added: " + selectedItem);
        }
    }
}
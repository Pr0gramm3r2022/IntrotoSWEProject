package Resturant;

import java.util.ArrayList;
import java.util.List;

// Class to represent an order in the restaurant
public class Order {
    // Private instance variables
    private Tables table;                  // The table associated with the order
    private Staff waiter;                   // The staff (waiter) handling the order
    private List<Double> items;             // List to store item prices
    private String status;                  // Status of the order (e.g., Pending, Completed)
    private long timestamp;                 // Timestamp when the order was created
    private Customer customer;              // The customer who placed the order
    private Transaction transaction;        // Transaction details once payment is made

    // Constructor to initialize an order with a table, waiter, and customer
    public Order(Tables table, Staff waiter, Customer customer) {
        this.table = table;
        this.waiter = waiter;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.status = "Pending";            // Default status is "Pending"
        this.timestamp = System.currentTimeMillis();  // Capture the current time
    }

    // Method to add an item price to the order
    public void addItem(double itemPrice) {
        items.add(itemPrice);
    }

    // Method to manually update the order status
    public void updateStatus(String status) {
        this.status = status;
    }

    // Method to create a transaction when the order is paid
    public void createTransaction(double amount, String paymentMethod) {
        this.transaction = new Transaction(amount, paymentMethod, "Completed");
    }

    // Getter method for order status
    public String getStatus() {
        return status;
    }

    // Getter method to retrieve all items (prices) in the order
    public List<Double> getItems() {
        return items;
    }

    // Getter method to retrieve the table associated with the order
    public Tables getTable() {
        return table;
    }

    // Getter method to retrieve the waiter associated with the order
    public Staff getWaiter() {
        return waiter;
    }

    // Getter method to retrieve the customer who placed the order
    public Customer getCustomer() {
        return customer;
    }

    // Getter method to retrieve the timestamp of the order
    public long getTimestamp() {
        return timestamp;
    }

    // Getter method to retrieve the transaction details
    public Transaction getTransaction() {
        return transaction;
    }

    // Method to calculate the total cost of the order
    public double calculateTotal() {
        double total = 0;
        for (double price : items) {
            total += price;
        }
        return total;
    }

    // --- New backend methods ---

    // Cancels the order by clearing items and setting status to "Cancelled"
    public void cancelOrder() {
        this.status = "Cancelled";
        this.items.clear();
    }

    // Completes the order if a transaction exists and marks status as "Completed"
    public void completeOrder() {
        if (transaction != null) {
            this.status = "Completed";
            transaction.completePayment();
        }
    }

    // Calculates and returns the average price of items in the order
    public double calculateAverageItemPrice() {
        if (items.isEmpty()) return 0;
        return calculateTotal() / items.size();
    }
}

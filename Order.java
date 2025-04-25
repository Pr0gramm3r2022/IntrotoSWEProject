package Resturant;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Tables table;
    private Staff waiter;
    private List<Double> items; 
    private String status;
    private long timestamp;
    private Customer customer;
    private Transaction transaction;

    public Order(Tables table, Staff waiter, Customer customer) {
        this.table = table;
        this.waiter = waiter;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.status = "Pending";
        this.timestamp = System.currentTimeMillis();
    }

    public void addItem(double itemPrice) {
        items.add(itemPrice);
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    public void createTransaction(double amount, String paymentMethod) {
        this.transaction = new Transaction(amount, paymentMethod, "Completed");
    }

    public String getStatus() {
        return status;
    }

    public List<Double> getItems() {
        return items;
    }

    public Tables getTable() {
        return table;
    }

    public Staff getWaiter() {
        return waiter;
    }

    public Customer getCustomer() {
        return customer;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public double calculateTotal() {
        double total = 0;
        for (double price : items) {
            total += price;
        }
        return total;
    }

    // New backend methods
    public void cancelOrder() {
        this.status = "Cancelled";
        this.items.clear();
    }

    public void completeOrder() {
        if (transaction != null) {
            this.status = "Completed";
            transaction.completePayment();
        }
    }

    public double calculateAverageItemPrice() {
        if (items.isEmpty()) return 0;
        return calculateTotal() / items.size();
    }
}

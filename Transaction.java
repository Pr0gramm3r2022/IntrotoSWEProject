package Resturant;

// Class to represent a financial transaction in the restaurant
public class Transaction {
    // Private instance variables to store transaction details
    private double amount;            // Amount paid
    private String paymentMethod;     // Method of payment (e.g., Cash, Card)
    private String status;            // Status of the transaction (e.g., Completed, Cancelled)

    // Constructor to initialize transaction details
    public Transaction(double amount, String paymentMethod, String status) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    // Getter method to retrieve the amount of the transaction
    public double getAmount() {
        return amount;
    }

    // Getter method to retrieve the payment method used
    public String getPaymentMethod() {
        return paymentMethod;
    }

    // Getter method to retrieve the current status of the transaction
    public String getStatus() {
        return status;
    }

    // --- New backend methods ---

    // Marks the transaction as completed
    public void completePayment() {
        this.status = "Completed";
    }

    // Cancels the transaction
    public void cancelPayment() {
        this.status = "Cancelled";
    }

    // Returns a formatted string containing transaction information
    public String displayTransactionInfo() {
        return "Amount: $" + amount + ", Payment Method: " + paymentMethod + ", Status: " + status;
    }
}

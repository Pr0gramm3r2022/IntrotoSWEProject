package Resturant;

public class Transaction {
    private double amount;
    private String paymentMethod;
    private String status;

    public Transaction(double amount, String paymentMethod, String status) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    // New backend methods
    public void completePayment() {
        this.status = "Completed";
    }

    public void cancelPayment() {
        this.status = "Cancelled";
    }

    public String displayTransactionInfo() {
        return "Amount: $" + amount + ", Payment Method: " + paymentMethod + ", Status: " + status;
    }
}

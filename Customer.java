package Resturant;

// Class to represent a customer in the restaurant system
public class Customer {
    // Private instance variables to store customer information
    private String customerName;
    private String address;
    private String phoneNumber;
    private String customerID;

    // Constructor to initialize customer details
    public Customer(String customerName, String address, String phoneNumber, String customerID) {
        this.customerName = customerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.customerID = customerID;
    }

    // Getter method to retrieve the customer's name
    public String getCustomerName() {
        return customerName;
    }

    // Getter method to retrieve the customer's address
    public String getAddress() {
        return address;
    }

    // Getter method to retrieve the customer's phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Getter method to retrieve the customer's unique ID
    public String getCustomerID() {
        return customerID;
    }

    // --- New backend methods to update customer information ---

    // Updates the customer's phone number
    public void updatePhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    // Updates the customer's address
    public void updateAddress(String newAddress) {
        this.address = newAddress;
    }

    // Returns a formatted string with customer information
    public String displayCustomerInfo() {
        return "Customer Name: " + customerName + ", Phone: " + phoneNumber + ", Address: " + address;
    }
}

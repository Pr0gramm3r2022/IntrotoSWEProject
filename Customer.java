
public class Customer {
    private String customerName;
    private String address;
    private String phoneNumber;
    private String customerID;

    public Customer(String customerName, String address, String phoneNumber, String customerID) {
        this.customerName = customerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    // New backend methods
    public void updatePhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    public void updateAddress(String newAddress) {
        this.address = newAddress;
    }

    public String displayCustomerInfo() {
        return "Customer Name: " + customerName + ", Phone: " + phoneNumber + ", Address: " + address;
    }
}

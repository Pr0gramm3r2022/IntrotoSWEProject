package Resturant;

// Class to represent a table in the restaurant
public class Tables {
    // Private instance variables to store table ID and status
    private int tableID;
    private String status;

    // Constructor to initialize table ID and status
    public Tables(int tableID, String status) {
        this.tableID = tableID;
        this.status = status;
    }

    // Getter method to retrieve the table ID
    public int getTableID() {
        return tableID;
    }

    // Getter method to retrieve the current status of the table
    public String getStatus() {
        return status;
    }

    // Setter method to update the status of the table
    public void updateStatus(String status) {
        this.status = status;
    }

    // --- New backend methods for common table status changes ---

    // Marks the table status as "Occupied"
    public void markOccupied() {
        this.status = "Occupied";
    }

    // Marks the table status as "Dirty"
    public void markDirty() {
        this.status = "Dirty";
    }

    // Marks the table status as "Clean"
    public void markClean() {
        this.status = "Clean";
    }

    // Returns a string containing table information
    public String displayTableInfo() {
        return "Table ID: " + tableID + ", Status: " + status;
    }
}

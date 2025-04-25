package Resturant;

public class Tables {
    private int tableID;
    private String status;

    public Tables(int tableID, String status) {
        this.tableID = tableID;
        this.status = status;
    }

    public int getTableID() {
        return tableID;
    }

    public String getStatus() {
        return status;
    }

    public void updateStatus(String status) {
        this.status = status;
    }

    // New backend methods
    public void markOccupied() {
        this.status = "Occupied";
    }

    public void markDirty() {
        this.status = "Dirty";
    }

    public void markClean() {
        this.status = "Clean";
    }

    public String displayTableInfo() {
        return "Table ID: " + tableID + ", Status: " + status;
    }
}

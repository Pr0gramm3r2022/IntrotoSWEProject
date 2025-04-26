package Resturant;

// Class to represent a staff member in the restaurant
public class Staff {
    // Private instance variables to store staff name and role
    private String name;
    private String role;

    // Constructor to initialize staff details
    public Staff(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Getter method to retrieve the staff member's name
    public String getName() {
        return name;
    }

    // Getter method to retrieve the staff member's role
    public String getRole() {
        return role;
    }

    // --- New backend methods ---

    // Updates the staff member's role
    public void updateRole(String newRole) {
        this.role = newRole;
    }

    // Returns a formatted string containing staff information
    public String displayStaffInfo() {
        return "Staff Name: " + name + ", Role: " + role;
    }
}

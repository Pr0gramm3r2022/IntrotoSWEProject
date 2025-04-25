package Resturant;

public class Staff {
    private String name;
    private String role;

    public Staff(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    // New backend methods
    public void updateRole(String newRole) {
        this.role = newRole;
    }

    public String displayStaffInfo() {
        return "Staff Name: " + name + ", Role: " + role;
    }
}

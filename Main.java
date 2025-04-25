package Resturant;

public class Main {
    public static void main(String[] args) {
        
        // Create menu
        Menu menu = new Menu(12.99, 8.99, 6.99, 2.99);
        System.out.println(menu.displayMenu());
        
        // Create customer
        Customer customer = new Customer("John Doe", "123 Main Street", "555-1234", "C001");
        System.out.println(customer.displayCustomerInfo());
        
        // Create staff (waiter)
        Staff waiter = new Staff("Alice", "Waiter");
        System.out.println(waiter.displayStaffInfo());
        
        // Create table
        Tables table = new Tables(5, "Clean");
        System.out.println(table.displayTableInfo());
        
        // Customer sits down
        table.markOccupied();
        System.out.println("After customer seated: " + table.displayTableInfo());

        // Create order
        Order order = new Order(table, waiter, customer);
        order.addItem(menu.getPizzaPrice());
        order.addItem(menu.getDrinksPrice());
        
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Order total: $" + order.calculateTotal());
        
        // Update order status to Preparing
        order.updateStatus("Preparing");
        System.out.println("Order status updated to: " + order.getStatus());

        // Kitchen prepares the order
        order.updateStatus("Ready");
        System.out.println("Order status updated to: " + order.getStatus());

        // Waiter serves the order
        order.updateStatus("Served");
        System.out.println("Order status updated to: " + order.getStatus());

        // Create transaction for payment
        order.createTransaction(order.calculateTotal(), "Credit Card");
        order.completeOrder();
        System.out.println("Transaction Info: " + order.getTransaction().displayTransactionInfo());
        
        // Customer leaves, table becomes dirty
        table.markDirty();
        System.out.println("After customer leaves: " + table.displayTableInfo());
    }
}

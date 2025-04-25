package Resturant;

public class Menu {
    private double pizza;
    private double burger;
    private double salads;
    private double drinks;

    public Menu(double pizza, double burger, double salads, double drinks) {
        this.pizza = pizza;
        this.burger = burger;
        this.salads = salads;
        this.drinks = drinks;
    }

    public double getPizzaPrice() {
        return pizza;
    }

    public double getBurgerPrice() {
        return burger;
    }

    public double getSaladsPrice() {
        return salads;
    }

    public double getDrinksPrice() {
        return drinks;
    }

    // New backend methods
    public void updatePizzaPrice(double newPrice) {
        this.pizza = newPrice;
    }

    public void updateBurgerPrice(double newPrice) {
        this.burger = newPrice;
    }

    public void updateSaladsPrice(double newPrice) {
        this.salads = newPrice;
    }

    public void updateDrinksPrice(double newPrice) {
        this.drinks = newPrice;
    }

    public String displayMenu() {
        return "Menu:\nPizza: $" + pizza + "\nBurger: $" + burger + "\nSalads: $" + salads + "\nDrinks: $" + drinks;
    }
}

package Resturant;

public class Menu {
    // Soups/Salads
    private double caesarSalad;
    private double gardenSalad;
    private double frenchOnionSoup;
    private double broccoliCheddarSoup;

    // Desserts
    private double chocolateCake;
    private double strawberryCheesecake;
    private double applePie;
    private double tiramisu;

    // Drinks
    private double coke;
    private double sprite;
    private double icedCoffee;
    private double lemonade;

    // Appetizers/Sides
    private double fries;
    private double breadsticks;
    private double onionRings;
    private double chickenSliders;

    // Burgers/Sandwiches
    private double cheeseburger;
    private double veggieBurger;
    private double grilledChickenSandwich;
    private double grilledSalmonSandwich;

    // Constructor
    public Menu(double caesarSalad, double gardenSalad, double frenchOnionSoup, double broccoliCheddarSoup,
                double chocolateCake, double strawberryCheesecake, double applePie, double tiramisu,
                double coke, double sprite, double icedCoffee, double lemonade,
                double fries, double breadsticks, double onionRings, double chickenSliders,
                double cheeseburger, double veggieBurger, double grilledChickenSandwich, double grilledSalmonSandwich) {
        this.caesarSalad = caesarSalad;
        this.gardenSalad = gardenSalad;
        this.frenchOnionSoup = frenchOnionSoup;
        this.broccoliCheddarSoup = broccoliCheddarSoup;
        this.chocolateCake = chocolateCake;
        this.strawberryCheesecake = strawberryCheesecake;
        this.applePie = applePie;
        this.tiramisu = tiramisu;
        this.coke = coke;
        this.sprite = sprite;
        this.icedCoffee = icedCoffee;
        this.lemonade = lemonade;
        this.fries = fries;
        this.breadsticks = breadsticks;
        this.onionRings = onionRings;
        this.chickenSliders = chickenSliders;
        this.cheeseburger = cheeseburger;
        this.veggieBurger = veggieBurger;
        this.grilledChickenSandwich = grilledChickenSandwich;
        this.grilledSalmonSandwich = grilledSalmonSandwich;
    }

    // --- Getter methods ---

    // Soups/Salads
    public double getCaesarSaladPrice() { return caesarSalad; }
    public double getGardenSaladPrice() { return gardenSalad; }
    public double getFrenchOnionSoupPrice() { return frenchOnionSoup; }
    public double getBroccoliCheddarSoupPrice() { return broccoliCheddarSoup; }

    // Desserts
    public double getChocolateCakePrice() { return chocolateCake; }
    public double getStrawberryCheesecakePrice() { return strawberryCheesecake; }
    public double getApplePiePrice() { return applePie; }
    public double getTiramisuPrice() { return tiramisu; }

    // Drinks
    public double getCokePrice() { return coke; }
    public double getSpritePrice() { return sprite; }
    public double getIcedCoffeePrice() { return icedCoffee; }
    public double getLemonadePrice() { return lemonade; }

    // Appetizers/Sides
    public double getFriesPrice() { return fries; }
    public double getBreadsticksPrice() { return breadsticks; }
    public double getOnionRingsPrice() { return onionRings; }
    public double getChickenSlidersPrice() { return chickenSliders; }

    // Burgers/Sandwiches
    public double getCheeseburgerPrice() { return cheeseburger; }
    public double getVeggieBurgerPrice() { return veggieBurger; }
    public double getGrilledChickenSandwichPrice() { return grilledChickenSandwich; }
    public double getGrilledSalmonSandwichPrice() { return grilledSalmonSandwich; }

    // --- New backend methods to update prices ---

    public void updateCaesarSaladPrice(double newPrice) { this.caesarSalad = newPrice; }
    public void updateGardenSaladPrice(double newPrice) { this.gardenSalad = newPrice; }
    public void updateFrenchOnionSoupPrice(double newPrice) { this.frenchOnionSoup = newPrice; }
    public void updateBroccoliCheddarSoupPrice(double newPrice) { this.broccoliCheddarSoup = newPrice; }
    public void updateChocolateCakePrice(double newPrice) { this.chocolateCake = newPrice; }
    public void updateStrawberryCheesecakePrice(double newPrice) { this.strawberryCheesecake = newPrice; }
    public void updateApplePiePrice(double newPrice) { this.applePie = newPrice; }
    public void updateTiramisuPrice(double newPrice) { this.tiramisu = newPrice; }
    public void updateCokePrice(double newPrice) { this.coke = newPrice; }
    public void updateSpritePrice(double newPrice) { this.sprite = newPrice; }
    public void updateIcedCoffeePrice(double newPrice) { this.icedCoffee = newPrice; }
    public void updateLemonadePrice(double newPrice) { this.lemonade = newPrice; }
    public void updateFriesPrice(double newPrice) { this.fries = newPrice; }
    public void updateBreadsticksPrice(double newPrice) { this.breadsticks = newPrice; }
    public void updateOnionRingsPrice(double newPrice) { this.onionRings = newPrice; }
    public void updateChickenSlidersPrice(double newPrice) { this.chickenSliders = newPrice; }
    public void updateCheeseburgerPrice(double newPrice) { this.cheeseburger = newPrice; }
    public void updateVeggieBurgerPrice(double newPrice) { this.veggieBurger = newPrice; }
    public void updateGrilledChickenSandwichPrice(double newPrice) { this.grilledChickenSandwich = newPrice; }
    public void updateGrilledSalmonSandwichPrice(double newPrice) { this.grilledSalmonSandwich = newPrice; }

    // --- Display the full menu nicely ---
    public String displayMenu() {
        return "Menu:\n" +
                "Soups/Salads:\n" +
                "- Caesar Salad: $" + caesarSalad + "\n" +
                "- Garden Salad: $" + gardenSalad + "\n" +
                "- French Onion Soup: $" + frenchOnionSoup + "\n" +
                "- Broccoli Cheddar Soup: $" + broccoliCheddarSoup + "\n\n" +
                "Desserts:\n" +
                "- Chocolate Cake: $" + chocolateCake + "\n" +
                "- Strawberry Cheesecake: $" + strawberryCheesecake + "\n" +
                "- Apple Pie: $" + applePie + "\n" +
                "- Tiramisu: $" + tiramisu + "\n\n" +
                "Drinks:\n" +
                "- Coke: $" + coke + "\n" +
                "- Sprite: $" + sprite + "\n" +
                "- Iced Coffee: $" + icedCoffee + "\n" +
                "- Lemonade: $" + lemonade + "\n\n" +
                "Appetizers/Sides:\n" +
                "- Fries: $" + fries + "\n" +
                "- Breadsticks: $" + breadsticks + "\n" +
                "- Onion Rings: $" + onionRings + "\n" +
                "- Chicken Sliders: $" + chickenSliders + "\n\n" +
                "Burgers/Sandwiches:\n" +
                "- Cheeseburger: $" + cheeseburger + "\n" +
                "- Veggie Burger: $" + veggieBurger + "\n" +
                "- Grilled Chicken Sandwich: $" + grilledChickenSandwich + "\n" +
                "- Grilled Salmon Sandwich: $" + grilledSalmonSandwich + "\n";
    }
}

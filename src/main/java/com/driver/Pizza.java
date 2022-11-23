package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extraCheese = false;
    private boolean extraToppins = false;

    final int vegPizza = 300;
    final int nonVegPizza = 400;
    final int extraCheesePrice = 80;
    final int extraToppinsVeg = 70;
    final int extraToppinsNonVeg = 120;
    final int bag = 20;

    private int cart[] = new int[4];

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        if (isVeg) {
            this.price = vegPizza;
            this.bill = "Base Price Of The Pizza: " + vegPizza + "\n";
        } else {
            this.price = nonVegPizza;
            this.bill = "Base Price Of The Pizza: " + nonVegPizza + "\n";

        }
        // your code goes here
    }

    public int getPrice() {

        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!extraCheese) {
            this.price = this.price + extraCheesePrice;
            extraCheese = true;
            this.bill = this.bill + "Extra Cheese Added: " + extraCheesePrice + "\n";

        }

    }

    public void addExtraToppings() {
        // your code goes here
        if (!extraToppins && isVeg) {
            this.price = this.price + extraToppinsVeg;
            extraCheese = true;
            this.bill = this.bill + "Extra Toppings Added: " + extraToppinsVeg + "\n";
        } else if (!extraToppins && !isVeg) {
            this.price = this.price + extraToppinsNonVeg;
            extraCheese = true;
            this.bill = this.bill + "Extra Toppings Added: " + extraToppinsNonVeg + "\n";

        }

    }

    public void addTakeaway() {
        // your code goes here
        this.bill = this.bill + "Paperbag Added: " + bag + "\n";
    }

    public String getBill() {
        // your code goes here
        this.bill = this.bill + "Total Price: " + this.price + "\n";

        return this.bill;
    }
}

package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extraCheese = false;
    private boolean extraToppinsVegData = false;
    private boolean extraToppinsNonVegData = false;
    private boolean bagData = false;

    final int vegPizza = 300;
    final int nonVegPizza = 400;
    final int extraCheesePrice = 80;
    final int extraToppinsVeg = 70;
    final int extraToppinsNonVeg = 120;
    final int bag = 20;

    public Pizza(Boolean isVeg) {

        this.isVeg = isVeg;
        if (isVeg) {
            this.price = 300;
        } else {
            this.price = 400;

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
            // this.bill = this.bill + "Extra Cheese Added: " + extraCheesePrice + "\n";

        }

    }

    public void addExtraToppings() {
        // your code goes here
        if (!extraToppinsVegData && isVeg) {
            this.price = this.price + extraToppinsVeg;
            extraToppinsVegData = true;
            extraCheese = true;
            // this.bill = this.bill + "Extra Toppings Added: " + extraToppinsVeg + "\n";
        } else if (!extraToppinsNonVegData && !isVeg) {
            this.price = this.price + extraToppinsNonVeg;
            extraToppinsNonVegData = true;
            extraCheese = true;
            // this.bill = this.bill + "Extra Toppings Added: " + extraToppinsNonVeg + "\n";

        }

    }

    public void addTakeaway() {
        // your code goes here
        // this.bill = this.bill + "Paperbag Added: " + bag + "\n";
        if (!bagData) {
            bagData = true;
            this.price = this.price + bag;
        }
    }

    public String getBill() {
        // your code goes here
        // bill for pizza
        if (isVeg) {
            this.bill = "Base Price Of The Pizza: " + vegPizza + "\n";
        } else {
            this.bill = "Base Price Of The Pizza: " + nonVegPizza + "\n";

        }

        if (extraCheese) {
            this.bill = this.bill + "Extra Cheese Added: " + extraCheesePrice + "\n";
        }

        if (isVeg && extraToppinsVegData) {
            this.bill = this.bill + "Extra Toppings Added: " + extraToppinsVeg + "\n";
        } else if (!isVeg && extraToppinsNonVegData) {
            this.bill = this.bill + "Extra Toppings Added: " + extraToppinsNonVeg + "\n";

        }

        if (bagData) {
            this.bill = this.bill + "Paperbag Added: " + bag + "\n";
        }

        this.bill = this.bill + "Total Price: " + this.price + "\n";

        return this.bill;
    }
}

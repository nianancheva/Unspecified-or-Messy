package shoppingSystem.items.food;

import shoppingSystem.items.Item;

public class Juice implements Item {
    private static final String name = "Juice";
    private static final double price = 2;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

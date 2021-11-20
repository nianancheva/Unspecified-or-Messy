package shoppingSystem.items.food;

import shoppingSystem.items.Item;

public class Flour implements Item {
    private static final String name = "Flour";
    private static final double price = 3;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

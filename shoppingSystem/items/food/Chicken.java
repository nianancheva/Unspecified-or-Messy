package shoppingSystem.items.food;

import shoppingSystem.items.Item;

public class Chicken implements Item {
    private static final String name = "Chicken";
    private static final double price = 7;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

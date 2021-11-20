package shoppingSystem.items.electronics;

import shoppingSystem.items.Item;

public class Laptop implements Item {
    private static final String name = "Laptop";
    private static final double price = 1250;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

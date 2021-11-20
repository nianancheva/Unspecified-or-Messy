package shoppingSystem.items.clothes;

import shoppingSystem.items.Item;

public class Pants implements Item {
    private static final String name = "Pants";
    private static final double price = 65;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

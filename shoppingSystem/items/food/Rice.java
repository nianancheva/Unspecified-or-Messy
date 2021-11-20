package shoppingSystem.items.food;

import shoppingSystem.items.Item;

public class Rice implements Item {
    private static final String name = "Rice";
    private static final double price = 10;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

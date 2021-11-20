package shoppingSystem.items.electronics;

import shoppingSystem.items.Item;

public class Printer implements Item {
    private static final String name = "Printer";
    private static final double price = 250;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

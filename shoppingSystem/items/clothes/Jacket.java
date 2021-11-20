package shoppingSystem.items.clothes;

import shoppingSystem.items.Item;

public class Jacket implements Item {
    private static final String name = "Jacket";
    private static final double price = 90;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

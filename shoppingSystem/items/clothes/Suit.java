package shoppingSystem.items.clothes;

import shoppingSystem.items.Item;

public class Suit implements Item {
    private static final String name = "Suit";
    private static final double price = 275;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

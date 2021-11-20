package shoppingSystem.shoppingCart;

import shoppingSystem.items.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private List<Item> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void add (Item item) {
        if (cart.contains(item)) {
            throw new IllegalArgumentException("Item was already added to the shopping cart!");
        }
        cart.add(item);
    }

    public void remove (Item item) {
        if (!cart.contains(item)) {
            throw new IllegalArgumentException("Item was not found in the shopping cart!");
        }
        cart.remove(item);
    }

    public double getFinalPrice () {
        double finalPrice = 0;
        for (Item item : cart) {
            finalPrice += item.getPrice();
        }

        return finalPrice;
    }

    public String addedProducts () {
        StringBuilder str = new StringBuilder();

        str.append(String.format("Added products to your shopping cart:%n"));

        for (Item item : cart) {
            str.append(String.format("%s - %.2f%n", item.getClass().getSimpleName(), item.getPrice()));
        }

        return str.toString().trim();
    }

}

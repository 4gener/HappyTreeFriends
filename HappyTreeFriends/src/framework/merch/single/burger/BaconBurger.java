package framework.merch.single.burger;

import framework.ingredient.IngredientType;

import java.util.ArrayList;

public class BaconBurger extends Burger {
    public BaconBurger(ArrayList<IngredientType> requirements, double price) {
        super(requirements, price);
    }

    @Override
    public String getName() {
        return "培根汉堡";
    }
}

package framework.merch.single.burger;

import framework.ingredient.IngredientType;

import java.util.ArrayList;

public class BeefBurger extends Burger {
    public BeefBurger(ArrayList<IngredientType> requirements, double price) {
        super(requirements, price);
    }

    @Override
    public String getName() {
        return "牛肉汉堡";
    }

}

package framework.merch.single.burger;

import framework.ingredient.IngredientType;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {
    public DeluxeBurger(ArrayList<IngredientType> requirements, double price) {
        super(requirements, price);
    }

    @Override
    public String getName() {
        return "豪华双拼汉堡";
    }
}

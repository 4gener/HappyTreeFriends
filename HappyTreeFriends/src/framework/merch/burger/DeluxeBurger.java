package framework.merch.burger;

import framework.ingredient.IngredientType;
import framework.merch.Merch;
import framework.merch.MerchType;

import java.util.ArrayList;

public class DeluxeBurger extends Burger {
    public DeluxeBurger(ArrayList<IngredientType> requirements, double price) {
        super(requirements, price);
    }
}

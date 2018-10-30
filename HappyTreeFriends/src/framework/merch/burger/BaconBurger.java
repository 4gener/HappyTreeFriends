package framework.merch.burger;

import framework.ingredient.IngredientType;
import framework.merch.Merch;
import framework.merch.MerchType;

import java.util.ArrayList;

public class BaconBurger extends Burger {
    public BaconBurger(ArrayList<IngredientType> requirements, double price) {
        super(requirements, price);
    }
}

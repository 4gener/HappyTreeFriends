package framework.merch.single.burger;

import framework.ingredient.IngredientType;
import framework.merch.Merch;
import framework.merch.single.SingleOrder;

import java.util.ArrayList;

public abstract class Burger extends SingleOrder {
    private ArrayList<IngredientType> requirments = new ArrayList<>();

    Burger(ArrayList<IngredientType> requirments, double price) {
        super(price);
        this.requirments.addAll(requirments);
    }

    public ArrayList<IngredientType> getRequirments() {
        return requirments;
    }
}

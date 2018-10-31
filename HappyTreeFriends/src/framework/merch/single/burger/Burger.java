package framework.merch.single.burger;

import framework.ingredient.IngredientType;
import framework.merch.Merch;
import framework.merch.single.SingleOrder;

import java.util.ArrayList;

public abstract class Burger extends SingleOrder {
    private ArrayList<IngredientType> requirements = new ArrayList<>();

    Burger(ArrayList<IngredientType> requirements, double price) {
        super(price);
        this.requirements.addAll(requirements);
    }

    public ArrayList<IngredientType> getRequirements() {
        return requirements;
    }
}

package framework.ingredient;

import framework.cooker.Cooker;

public class Bacon extends Ingredient {
    Bacon(double baseStateUpdateRate) {
        super(baseStateUpdateRate);
    }

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.BACON;
    }

    @Override
    public String getName() {
        return "培根";
    }
}

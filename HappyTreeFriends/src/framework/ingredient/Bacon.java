package framework.ingredient;

import framework.cooker.Griller;

public class Bacon extends Ingredient {
    Bacon(double baseStateUpdateRate) {
        super(baseStateUpdateRate);
        this.setCooker(new Griller());
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

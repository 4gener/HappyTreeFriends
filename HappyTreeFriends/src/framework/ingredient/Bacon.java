package framework.ingredient;

import framework.cooker.Cooker;

public class Bacon extends Ingredient {

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.BACON;
    }
}

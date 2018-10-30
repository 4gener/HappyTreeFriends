package framework.ingredient;

import framework.cooker.Cooker;

public class Lettuce extends Ingredient {
    @Override
    public IngredientType getIngredientType() {
        return IngredientType.LETTUCE;
    }
}

package framework.ingredient;

import framework.cooker.Cooker;

public class Tomato extends Ingredient {

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.TOMATO;
    }
}

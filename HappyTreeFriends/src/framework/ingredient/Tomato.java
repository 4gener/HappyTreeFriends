package framework.ingredient;

import framework.cooker.Cooker;

public class Tomato extends Ingredient {

    public void handle(Cooker cooker) {
        // TODO
    }

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.TOMATO;
    }
}

package framework.ingredient;

import framework.cooker.Cooker;

public class Tomato extends Ingredient {

    Tomato(double baseStateUpdateRate) {
        super(baseStateUpdateRate);
    }

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.TOMATO;
    }

    @Override
    public String getName() {
        return "番茄";
    }
}

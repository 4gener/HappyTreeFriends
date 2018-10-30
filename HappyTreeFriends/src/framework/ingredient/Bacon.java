package framework.ingredient;

import framework.cooker.Cooker;

public class Bacon extends Ingredient {

    public void handle(Cooker cooker) {
        // TODO
    }

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.BACON;
    }
}

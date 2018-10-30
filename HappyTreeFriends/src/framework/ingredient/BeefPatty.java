package framework.ingredient;

import framework.cooker.Cooker;

public class BeefPatty extends Ingredient {

    public void handle(Cooker cooker) {
        // TODO
    }

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.BEEF_PATTY;
    }
}

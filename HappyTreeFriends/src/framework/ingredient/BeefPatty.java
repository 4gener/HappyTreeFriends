package framework.ingredient;

import framework.cooker.Cooker;

public class BeefPatty extends Ingredient {

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.BEEF_PATTY;
    }

    @Override
    public String getName() {
        return "牛肉";
    }
}

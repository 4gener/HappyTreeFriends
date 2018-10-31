package framework.ingredient;

import framework.cooker.Cooker;
import framework.cooker.Griller;

public class BeefPatty extends Ingredient {
    BeefPatty(double baseStateUpdateRate) {
        super(baseStateUpdateRate);
        this.setCooker(new Griller());
    }

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.BEEF_PATTY;
    }

    @Override
    public String getName() {
        return "牛肉";
    }
}

package framework.ingredient;

import framework.cooker.Cooker;

public class Lettuce extends Ingredient {
    Lettuce(double baseStateUpdateRate) {
        super(baseStateUpdateRate);
    }

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.LETTUCE;
    }

    @Override
    public String getName() {
        return "生菜";
    }
}

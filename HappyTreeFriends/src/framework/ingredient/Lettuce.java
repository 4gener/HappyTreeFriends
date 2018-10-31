package framework.ingredient;

import framework.cooker.CounterTop;

public class Lettuce extends Ingredient {
    Lettuce(double baseStateUpdateRate) {
        super(baseStateUpdateRate);
        this.setCooker(new CounterTop());
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

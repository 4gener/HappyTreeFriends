package framework.ingredient;

import framework.cooker.Cooker;

public class Lettuce extends Ingredient {
    @Override
    public IngredientType getIngredientType() {
        return IngredientType.LETTUCE;
    }

    @Override
    public void displayInfo() {
        if (this.isStale()) {
            System.out.println("一片已经变质的生菜");
        } else {
            System.out.println("一片新鲜的生菜 新鲜指数为" + this.stateRate);
        }
    }
}

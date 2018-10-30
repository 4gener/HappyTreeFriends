package framework.ingredient;

import framework.cooker.Cooker;

public class Bacon extends Ingredient {

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.BACON;
    }

    @Override
    public void displayInfo() {
        if (this.isStale()) {
            System.out.println("一片已经变质的培根");
        } else {
            System.out.println("一片新鲜的培根 新鲜指数为" + this.stateRate);
        }
    }
}

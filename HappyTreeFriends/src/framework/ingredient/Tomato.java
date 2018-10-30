package framework.ingredient;

import framework.cooker.Cooker;

public class Tomato extends Ingredient {

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.TOMATO;
    }

    @Override
    public void displayInfo() {
        if (this.isStale()) {
            System.out.println("一片已经变质的番茄");
        } else {
            System.out.println("一片新鲜的番茄 新鲜指数为" + this.stateRate);
        }
    }
}

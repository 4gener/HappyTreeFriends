package framework.ingredient;

import framework.cooker.Cooker;

public class BeefPatty extends Ingredient {

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.BEEF_PATTY;
    }

    @Override
    public void displayInfo() {
        if (this.isStale()) {
            System.out.println("一片已经变质的牛肉");
        } else {
            System.out.println("一片新鲜的牛肉 新鲜指数为" + this.stateRate);
        }
    }
}

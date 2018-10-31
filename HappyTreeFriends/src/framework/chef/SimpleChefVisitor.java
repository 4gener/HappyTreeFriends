package framework.chef;

import framework.container.Cabinet;
import framework.container.Fridge;
import framework.ingredient.Ingredient;

/**
 * Visitor
 */
public class SimpleChefVisitor implements ChefVisitor {
    @Override
    public void visit(Fridge fridge) {
        System.out.println("冰箱里装有：");
        for (Ingredient ingredient: fridge.getIngredients()) {
            ingredient.displayInfo();
        }
    }

    @Override
    public void visit(Cabinet cabinet) {
        System.out.println("橱柜里装有：");
        for (Ingredient ingredient: cabinet.getIngredients()) {
            ingredient.displayInfo();
        }
    }
}

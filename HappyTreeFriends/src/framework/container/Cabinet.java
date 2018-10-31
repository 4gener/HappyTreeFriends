package framework.container;

import framework.chef.ChefVisitor;
import framework.ingredient.Ingredient;
import framework.ingredient.IngredientType;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DP:
 * Singleton, Visitor
 */
public class Cabinet extends Container {

    private Cabinet() {
        this.availableTypes = new ArrayList<>(Arrays.asList(
                IngredientType.LETTUCE,
                IngredientType.TOMATO));

        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
        System.out.println("你的厨房里有一个橱柜！");
    }

    private static Cabinet instance;

    public static synchronized Cabinet getInstance() {
        if (instance == null) {
            instance = new Cabinet();
        }

        return instance;
    }

    @Override
    public void accept(ChefVisitor visitor) {
        visitor.visit(this);
    }
}

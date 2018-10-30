package framework.container;

import framework.ingredient.Ingredient;
import framework.ingredient.IngredientType;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DP:
 * Singleton
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
    public void displayStock() {
        System.out.println("橱柜里装有：");
        super.displayStock();
    }
}

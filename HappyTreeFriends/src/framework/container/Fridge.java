package framework.container;

import framework.ingredient.Ingredient;
import framework.ingredient.IngredientType;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DP:
 * Singleton
 * Strategy
 */
public class Fridge extends Container {

    private Fridge() {
        this.availableTypes = new ArrayList<>(Arrays.asList(
                IngredientType.BEEF_PATTY,
                IngredientType.BACON));

        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    private static Fridge instance;

    public static synchronized Fridge getInstance() {
        if (instance == null) {
            instance = new Fridge();
        }

        return instance;
    }
}

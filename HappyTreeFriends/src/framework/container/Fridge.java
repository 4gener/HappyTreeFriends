package framework.container;

import framework.ingredient.IngredientType;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DP:
 * Singleton
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

    @Override
    public void displayStock() {
        System.out.println("冰箱里装有：");
        super.displayStock();
    }
}


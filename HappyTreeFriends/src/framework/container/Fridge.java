package framework.container;

import framework.ingredient.Ingredient;

/**
 * DP:
 * Singleton
 */
public class Fridge implements Container {
    private Fridge() {
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
    public void put(Ingredient ingredient) {

    }

    @Override
    public Ingredient fetch(Ingredient ingredient) {
        return null;
    }
}

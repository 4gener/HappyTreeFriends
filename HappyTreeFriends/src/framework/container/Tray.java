package framework.container;

import framework.ingredient.Ingredient;

/**
 * DP:
 * Singleton
 */
public class Tray implements Container {
    private Tray() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    private static Tray instance;

    public static synchronized Tray getInstance() {
        if (instance == null) {
            instance = new Tray();
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

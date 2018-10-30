package framework.container;

import framework.ingredient.Ingredient;

public class Cabinet implements Container {

    private Cabinet() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    private static Cabinet instance;

    public static synchronized Cabinet getInstance() {
        if (instance == null) {
            instance = new Cabinet();
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

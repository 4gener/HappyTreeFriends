package framework.container;

import framework.ingredient.Ingredient;

public interface Container {
    void put(Ingredient ingredient);

    Ingredient fetch(Ingredient ingredient);
}

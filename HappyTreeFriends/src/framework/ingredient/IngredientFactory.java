package framework.ingredient;

import java.util.ArrayList;

/**
 * Factory Pattern
 */
public class IngredientFactory {
    public Ingredient createIngredient(IngredientType ingredientType) {
        switch (ingredientType) {
            case BACON:
                return new Bacon(0.5);
            case TOMATO:
                return new Tomato(0.8);
            case LETTUCE:
                return new Lettuce(0.2);
            case BEEF_PATTY:
                return new BeefPatty(1.1);
            default:
                throw new IllegalArgumentException("no such ingredient");
        }
    }

    public ArrayList<Ingredient> createIngredientList(IngredientType ingredientType, Integer count) {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        for (Integer i = 0; i < count; i++) {
            ingredients.add(this.createIngredient(ingredientType));
        }
        return ingredients;
    }
}

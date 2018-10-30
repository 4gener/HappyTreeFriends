package framework.ingredient;

import java.util.ArrayList;

/**
 * Factory Pattern
 */
public class IngredientFactory {
    public Ingredient createIngredient(IngredientType ingredientType) {
        switch (ingredientType) {
            case BACON:
                return new Bacon();
            case TOMATO:
                return new Tomato();
            case LETTUCE:
                return new Lettuce();
            case BEEF_PATTY:
                return new BeefPatty();
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

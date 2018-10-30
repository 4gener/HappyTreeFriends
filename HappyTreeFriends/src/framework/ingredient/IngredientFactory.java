package framework.ingredient;

import javax.lang.model.type.ErrorType;

public class IngredientFactory {
    public Ingredient create(IngredientType ingredientType) {
        switch (ingredientType) {
            case BACON:
                return new Bacon(1.0);
            case TOMATO:
                return new Tomato(0.5);
            case LETTUCE:
                return new Lettuce(0.25);
            case BEEF_PATTY:
                return new BeefPatty(2.0);
            default:
                throw new IllegalArgumentException("no such ingredient");
        }
    }
}

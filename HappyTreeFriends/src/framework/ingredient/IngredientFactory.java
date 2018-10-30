package framework.ingredient;

/**
 * Factory Pattern
 */
public class IngredientFactory {
    public Ingredient createIngredient(IngredientType ingredientType) {
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

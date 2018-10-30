package framework.factory;

import framework.ingredient.Ingredient;
import framework.ingredient.IngredientType;

public abstract class Factory {
    public abstract Ingredient createIngredient(IngredientType ingredientType);
}

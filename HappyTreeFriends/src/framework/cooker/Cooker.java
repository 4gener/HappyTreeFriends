package framework.cooker;

import framework.ingredient.Ingredient;
import framework.ingredient.IngredientType;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Cooker {
    protected ArrayList<IngredientType> availableTypes = new ArrayList<IngredientType>();

    private boolean isIngredientTypeLegal(IngredientType type) {
        return Arrays.asList(availableTypes).contains(type);
    }

    public void cook(Ingredient ingredient){
        if (!(this.isIngredientTypeLegal(ingredient.getIngredientType()))) {
            throw new IllegalArgumentException("this ingredient doesn't belong here");
        }
    }
}

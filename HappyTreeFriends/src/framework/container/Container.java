package framework.container;

import framework.ingredient.Ingredient;
import framework.ingredient.IngredientFactory;
import framework.ingredient.IngredientType;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Container {
    ArrayList<Ingredient> ingredients;

    protected ArrayList<IngredientType> availableTypes = new ArrayList<IngredientType>();

    Container() {
        IngredientFactory factory = new IngredientFactory();
        for (IngredientType type : availableTypes) {
            ingredients.addAll(factory.createIngredientList(type, 2));
        }
    }

    private boolean isIngredientTypeLegal(IngredientType type) {
        return Arrays.asList(availableTypes).contains(type);
    }

    public void put(Ingredient ingredient) {
        if (!(this.isIngredientTypeLegal(ingredient.getIngredientType()))) {
            throw new IllegalArgumentException("this ingredient doesn't belong here");
        }

        ingredients.add(ingredient);
    }

    public Ingredient fetch(IngredientType type) {
        if (!(this.isIngredientTypeLegal(type))) {
            throw new IllegalArgumentException("this ingredient doesn't belong here");
        }

        for (Ingredient ingredient : ingredients) {
            if (ingredient.getIngredientType() == type) {
                ingredients.remove(ingredient);
                return ingredient;
            }
        }
        throw new IllegalArgumentException("no more stock of this ingredient");
    }

    public boolean has(IngredientType type) {
        if (!(this.isIngredientTypeLegal(type))) {
            throw new IllegalArgumentException("this ingredient doesn't belong here");
        }

        for (Ingredient ingredient : ingredients) {
            if (ingredient.getIngredientType() == type) {
                ingredients.remove(ingredient);
                return true;
            }
        }
        return false;
    }

    protected void displayStock(){
        for (Ingredient ingredient: ingredients){
            ingredient.displayInfo();
        }
    }
}

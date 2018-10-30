package framework.cooker;

import framework.ingredient.Ingredient;
import framework.ingredient.IngredientType;

import java.util.ArrayList;
import java.util.Arrays;

public class CounterTop extends Cooker {
    private CounterTop() {
        this.availableTypes = new ArrayList<>(Arrays.asList(
                IngredientType.TOMATO,
                IngredientType.LETTUCE));
    }

    @Override
    public String getName() {
        return "操作台";
    }
}

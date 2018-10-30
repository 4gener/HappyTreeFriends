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
    public void cook(Ingredient ingredient) {
        super.cook(ingredient);
        System.out.println("你成功在操作台上处理好了该食材。");
    }
}

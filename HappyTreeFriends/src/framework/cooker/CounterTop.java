package framework.cooker;

import framework.ingredient.Ingredient;
import framework.ingredient.IngredientType;
import framework.ingredient.state.IngredientStateType;

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

    @Override
    public void cook(Ingredient ingredient) {
        super.cook(ingredient);
        ingredient.changeState(IngredientStateType.COOKED);
        System.out.println("你成功地使用" + this.getName() + "加工好了" + ingredient.getName());
    }
}

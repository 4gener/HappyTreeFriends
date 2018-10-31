package framework.cooker;

import framework.ingredient.Ingredient;
import framework.ingredient.IngredientType;
import framework.ingredient.state.IngredientStateType;

import java.util.ArrayList;
import java.util.Arrays;

public class Griller extends Cooker {
    public Griller() {
        this.availableTypes = new ArrayList<>(Arrays.asList(
                IngredientType.BACON,
                IngredientType.BEEF_PATTY));
    }

    @Override
    public String getName() {
        return "烤架";
    }

    @Override
    void startCooking(Ingredient ingredient) {
        System.out.println("开始烧烤" + ingredient.getName() + "...");
    }

    @Override
    void finishCooking(Ingredient ingredient) {
        ingredient.changeState(IngredientStateType.COOKED);
        System.out.println("你成功地使用" + this.getName() + "加工好了" + ingredient.getName());
    }
}

package framework.cooker;

import framework.ingredient.Ingredient;
import framework.ingredient.IngredientType;

import java.util.ArrayList;
import java.util.Arrays;

public class Griller extends Cooker {
    private Griller() {
        this.availableTypes = new ArrayList<>(Arrays.asList(
                IngredientType.BACON,
                IngredientType.BEEF_PATTY));
    }

    @Override
    public String getName() {
        return "烤架";
    }
}

package framework.container;

import framework.chef.ChefVisitor;
import framework.ingredient.IngredientType;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DP:
 * Singleton, Visitor
 */
public class Fridge extends Container {

    private Fridge() {
        this.availableTypes = new ArrayList<>(Arrays.asList(
                IngredientType.BEEF_PATTY,
                IngredientType.BACON));

        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
        System.out.println("你的厨房里有一台冰箱！");
    }

    private static Fridge instance;

    public static synchronized Fridge getInstance() {
        if (instance == null) {
            instance = new Fridge();
        }

        return instance;
    }

    @Override
    public void accept(ChefVisitor visitor) {
        visitor.visit(this);
    }
}


package framework.ingredient;

import framework.cooker.Cooker;
import framework.ingredient.state.IngredientFreshState;
import framework.ingredient.state.IngredientStaleState;
import framework.ingredient.state.IngredientState;

/**
 * Strategy
 */
public abstract class Ingredient {

    private IngredientState state = new IngredientFreshState();

    private Integer stateRate;

    Ingredient() {
        this.stateRate = (int) (Math.random() * 100);
    }

    public void handle(Cooker cooker) {
        cooker.cook(this);
    }

    public void updateStateRate() {
        if (isStale()) return;
        this.stateRate++;
        if (stateRate >= 100) {
            state = new IngredientStaleState();
        }
    }

    /**
     * 是否过期
     * @return boolean
     */
    public boolean isStale() {
        return state.isStale(this);
    }

    public abstract IngredientType getIngredientType();
}

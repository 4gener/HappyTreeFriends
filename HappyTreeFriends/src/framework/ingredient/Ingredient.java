package framework.ingredient;

import framework.cooker.Cooker;

/**
 * Strategy
 */
public abstract class Ingredient {

    private IngredientState state = IngredientState.OK;

    private Integer stateRate;

    Ingredient() {
        this.stateRate = (int) (Math.random() * 101);
    }

    public void handle(Cooker cooker) {
        cooker.cook(this);
    }

    public void updateStateRate() {
        if (state != IngredientState.OK) return;
        this.stateRate++;
        if (stateRate >= 100) {
            state = IngredientState.SPOILED;
        }
    }

    public boolean isStateOK() {
        return (state == IngredientState.OK);
    }

    public abstract IngredientType getIngredientType();
}

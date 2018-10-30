package framework.ingredient;

import framework.cooker.Cooker;

public abstract class Ingredient {

    private IngredientState state = IngredientState.OK;

    private Integer stateRate;

    Ingredient() {
        this.stateRate = (int) (Math.random() * 81);
    }

    public abstract void handle(Cooker cooker);

    public void updateStateRate() {
        this.stateRate++;
        if (stateRate >= 80) {
            state = IngredientState.SPOILED;
        }
    }

    public boolean isStateOK() {
        return (state == IngredientState.OK);
    }

    public abstract IngredientType getIngredientType();
}

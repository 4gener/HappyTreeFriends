package framework.ingredient;

import framework.cooker.Cooker;
import framework.ingredient.state.IngredientFreshState;
import framework.ingredient.state.IngredientStaleState;
import framework.ingredient.state.IngredientState;
import framework.time.TimeObserver;

/**
 * Strategy
 */
public abstract class Ingredient implements TimeObserver {

    private IngredientState state = new IngredientFreshState();

    private Integer stateRate;

    Ingredient() {
        this.stateRate = (int) (Math.random() * 100);
    }

    public void handle(Cooker cooker) {
        cooker.cook(this);
    }

    /**
     * 食材新鲜程度更新
     * 由 Timer.tick() 触发
     */
    public final void update() {
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

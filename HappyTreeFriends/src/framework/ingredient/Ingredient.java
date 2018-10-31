package framework.ingredient;

import framework.cooker.Cooker;
import framework.ingredient.state.IngredientFreshState;
import framework.ingredient.state.IngredientStaleState;
import framework.ingredient.state.IngredientState;
import framework.time.TimeObserver;

/**
 * Strategy, Prototype
 */
public abstract class Ingredient implements TimeObserver, Cloneable {

    private IngredientState state = new IngredientFreshState();

    private double stateRate;

    // 基础腐烂速率
    // 实际腐烂速率为 baseStateUpdateRate * stateUpdateRate
    private double baseStateUpdateRate;

    // 腐烂速率基准
    private double stateUpdateRate = 1;

    Ingredient(double stateUpdateRate) {
        this.stateRate = Math.random() * 100;
        this.baseStateUpdateRate = stateUpdateRate;
    }

    public void handle(Cooker cooker) {
        cooker.cook(this);
    }

    /**
     * 食材新鲜程度更新
     * 由 Timer.tick() 触发
     */
    public final void update() {
        if (isStale() || isCooked()) return;
        this.stateRate += baseStateUpdateRate * stateUpdateRate;
        if (stateRate >= 100) {
            state = new IngredientStaleState();
        }
    }

    /**
     * 是否过期
     *
     * @return boolean
     */
    public boolean isStale() {
        return state.isStale(this);
    }

    public boolean isCooked() { return state.isCooked(this); }

    public abstract IngredientType getIngredientType();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return clone;
    }

    public abstract String getName();

    public void displayInfo() {
        if (this.isStale()) {
            System.out.println("一片已经变质的" + this.getName());
        } else {
            System.out.println("一片新鲜的" + this.getName() + " 新鲜指数为" + this.stateRate);
        }
    }
}

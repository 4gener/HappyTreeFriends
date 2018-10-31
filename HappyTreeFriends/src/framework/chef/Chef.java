package framework.chef;

import framework.container.Cabinet;
import framework.container.Fridge;
import framework.ingredient.Ingredient;
import framework.ingredient.IngredientType;
import framework.order.Order;

/**
 * DP:
 * Singleton
 */
public final class Chef implements ChefCommand {
    private Chef() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }

        System.out.println("大厨，准备开工啦！\n");
    }

    private static Chef instance;

    private ChefVisitor visitor = new SimpleChefVisitor();

    public static synchronized Chef getInstance() {
        if (instance == null) {
            instance = new Chef();
        }
        return instance;
    }

    @Override
    public void showStock() {
        System.out.println("查看库存中...");
        Cabinet cabinet = Cabinet.getInstance();
        Fridge fridge = Fridge.getInstance();
        System.out.println("这就是你厨房里所有的容器了！\n");
        cabinet.accept(visitor);
        fridge.accept(visitor);
    }

    public boolean hasIngredient(IngredientType type) {
        if (type == IngredientType.LETTUCE || type == IngredientType.TOMATO) {
            return Cabinet.getInstance().has(type);
        } else {
            return Fridge.getInstance().has(type);
        }
    }

    public Ingredient getIngredient(IngredientType type) {
        if (type == IngredientType.LETTUCE || type == IngredientType.TOMATO) {
            return Cabinet.getInstance().fetch(type);
        } else {
            return Fridge.getInstance().fetch(type);
        }
    }

    @Override
    public void processOrder(Order order) {
        System.out.println("大厨，你刚刚接到了新订单！");
        order.displayMerches();
        order.handle();
        System.out.println("订单完成啦！");
    }
}

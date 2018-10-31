package framework.chef;

import framework.container.Cabinet;
import framework.container.Fridge;
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
    }

    private static Chef instance;

    public static synchronized Chef getInstance() {
        if (instance == null) {
            instance = new Chef();
        }

        System.out.println("大厨，准备开工啦！");
        return instance;
    }

    @Override
    public void showStock() {
        Cabinet cabinet = Cabinet.getInstance();
        Fridge fridge = Fridge.getInstance();
        cabinet.displayStock();
        fridge.displayStock();
    }

    @Override
    public void processOrder(Order order) {
        // todo
    }
}

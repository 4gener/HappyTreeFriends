package framework.chef;

import framework.order.Order;

/**
 * DP:
 *   Singleton
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

        return instance;
    }

    @Override
    public void processOrder(Order order) {
        // todo
    }
}

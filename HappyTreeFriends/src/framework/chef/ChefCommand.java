package framework.chef;

import framework.order.Order;

public interface ChefCommand {
    void processOrder(Order order);
}

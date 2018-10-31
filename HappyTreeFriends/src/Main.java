import framework.chef.Chef;
import framework.merch.Merch;
import framework.merch.MerchType;
import framework.order.Order;
import framework.order.OrderBuilder;

public class Main {

    public static void main(String[] args) {
        Chef chef = Chef.getInstance();

        chef.showStock();

        OrderBuilder builder = new OrderBuilder();

        builder.orderBurger(MerchType.BEEF_BURGER);

        builder.orderSet(MerchType.SET_BEEF_BURGER_COKE);

        builder.orderBeverage(MerchType.COKE);

        Order order = builder.order();

        chef.processOrder(order);
    }
}

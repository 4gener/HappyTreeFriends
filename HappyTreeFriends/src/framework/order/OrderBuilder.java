package framework.order;

import framework.merch.Merch;
import framework.merch.MerchFactory;
import framework.merch.MerchFactoryMaker;
import framework.merch.MerchType;

import java.util.ArrayList;

/**
 * DP: Builder
 */
public class OrderBuilder {

    private ArrayList<Merch> merches = new ArrayList<>();


    /**
     * 点汉堡
     *
     * @param type 汉堡类型
     */
    public void orderBurger(MerchType type) {
        try {
            MerchFactory factory = MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.BURGER);
            merches.add(factory.createMerch(type));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 点饮料
     *
     * @param type 饮料类型
     */
    public void orderBeverage(MerchType type) {
        try {
            MerchFactory factory = MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.BEVERAGE);
            merches.add(factory.createMerch(type));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void orderSet(MerchType type) {
        try {
            // todo
//            MerchFactory factory = MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.SET);
//            merches.add(factory.createMerch(type));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 下订单
     *
     * @return 返回订单对象
     */
    public Order order() {
        Order order = new Order();

        for (Merch merch : merches) {
            order.add(merch);
        }

        return order;
    }
}

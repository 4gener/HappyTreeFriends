package framework.merch.set;

import framework.merch.MerchFactoryMaker;
import framework.merch.MerchType;
import framework.merch.single.SingleOrder;

import java.util.ArrayList;
import java.util.Arrays;

public class DeluxeBurgerCoke extends Set {
    public DeluxeBurgerCoke() {
        super(new ArrayList<SingleOrder>(Arrays.asList(
                MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.BURGER).createSingleOrder(MerchType.DELUXE_BURGER),
                MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.BEVERAGE).createSingleOrder(MerchType.COKE)
        )));
    }

    @Override
    public String getName() {
        return "豪华汉堡套餐";
    }

    @Override
    public void handle() {

    }
}

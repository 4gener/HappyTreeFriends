package framework.merch.set;

import framework.merch.MerchFactoryMaker;
import framework.merch.MerchType;
import framework.merch.single.SingleOrder;

import java.util.ArrayList;
import java.util.Arrays;

public class BeefBurgerCoke extends Set {
    public BeefBurgerCoke() {
        super(new ArrayList<SingleOrder>(Arrays.asList(
                MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.BURGER).createSingleOrder(MerchType.BEEF_BURGER),
                MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.BEVERAGE).createSingleOrder(MerchType.COKE)
        )));
    }

    @Override
    public String getName() {
        return "牛肉汉堡套餐";
    }
}

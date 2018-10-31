package framework.merch.set;

import framework.merch.MerchFactoryMaker;
import framework.merch.MerchType;
import framework.merch.single.SingleOrder;

import java.util.ArrayList;
import java.util.Arrays;

public class BaconBurgerCoke extends Set {
    public BaconBurgerCoke() {
        super(new ArrayList<SingleOrder>(Arrays.asList(
                MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.BURGER).createSingleOrder(MerchType.BACON_BURGER),
                MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.BEVERAGE).createSingleOrder(MerchType.COKE)
        )));
    }

    @Override
    public String getName() {
        return "培根汉堡套餐";
    }
}

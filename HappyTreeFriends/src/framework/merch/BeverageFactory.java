package framework.merch;

import framework.merch.beverage.Coke;
import framework.merch.beverage.OrangeJuice;

class BeverageFactory extends MerchFactor {
    @Override
    Merch createMerch(MerchType merchType) {
        switch (merchType) {
            case COKE:
                return new Coke();
            case ORANGE_JUICE:
                return new OrangeJuice();
            default:
                throw new IllegalArgumentException("no such beverage in factory");
        }
    }
}

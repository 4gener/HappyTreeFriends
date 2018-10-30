package framework.merch;

import framework.merch.beverage.Coke;

class BeverageFactory extends MerchFactor {
    @Override
    Merch createMerch(MerchType merchType) {
        switch (merchType) {
            case COKE:
                return new Coke(1.5);
            default:
                throw new IllegalArgumentException("no such beverage in factory");
        }
    }
}

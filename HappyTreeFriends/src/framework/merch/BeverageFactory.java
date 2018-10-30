package framework.merch;

import framework.merch.set.Set;
import framework.merch.single.SingleOrder;
import framework.merch.single.beverage.Coke;

class BeverageFactory extends MerchFactory {
    @Override
    public SingleOrder createSingleOrder(MerchType merchType) {
        switch (merchType) {
            case COKE:
                return new Coke(1.5);
            default:
                throw new IllegalArgumentException("no such beverage in factory");
        }
    }

    @Override
    public Set createSet(MerchType merchType) {
        return null;
    }
}

package framework.merch;

import framework.merch.set.BaconBurgerCoke;
import framework.merch.set.BeefBurgerCoke;
import framework.merch.set.DeluxeBurgerCoke;
import framework.merch.set.Set;
import framework.merch.single.SingleOrder;

public class SetFactory extends MerchFactory {
    @Override
    public SingleOrder createSingleOrder(MerchType merchType) {
        return null;
    }

    @Override
    public Set createSet(MerchType merchType) {
        switch (merchType) {
            case SET_BEEF_BURGER_COKE:
                return new BeefBurgerCoke();
            case SET_BACON_BURGER_COKE:
                return new BaconBurgerCoke();
            case SET_DELUXE_BURGER_COKE:
                return new DeluxeBurgerCoke();
                default:
                    throw new IllegalArgumentException("no such set in factory");
        }
    }
}

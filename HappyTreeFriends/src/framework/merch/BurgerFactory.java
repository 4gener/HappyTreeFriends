package framework.merch;

import framework.merch.burger.BaconBurger;
import framework.merch.burger.BeefBurger;
import framework.merch.burger.DeluxeBurger;

class BurgerFactory extends MerchFactor {
    @Override
    public Merch createMerch(MerchType merchType) {
        switch (merchType) {
            case BEEF_BURGER:
                return new BeefBurger();
            case BACON_BURGER:
                return new BaconBurger();
            case DELUXE_BURGER:
                return new DeluxeBurger();
            default:
                throw new IllegalArgumentException("no such burger in factory");
        }
    }
}

package framework.merch;

import framework.ingredient.IngredientType;
import framework.merch.set.Set;
import framework.merch.single.SingleOrder;
import framework.merch.single.burger.BaconBurger;
import framework.merch.single.burger.BeefBurger;
import framework.merch.single.burger.DeluxeBurger;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DP: Factory
 */
class BurgerFactory extends MerchFactory {
    @Override
    public SingleOrder createSingleOrder(MerchType merchType) {
        switch (merchType) {
            case BEEF_BURGER:
                return new BeefBurger(
                        new ArrayList<>(Arrays.asList(
                                IngredientType.BEEF_PATTY,
                                IngredientType.LETTUCE,
                                IngredientType.TOMATO)),
                        5);
            case BACON_BURGER:
                return new BaconBurger(
                        new ArrayList<>(Arrays.asList(
                                IngredientType.BACON,
                                IngredientType.LETTUCE,
                                IngredientType.TOMATO)),
                        4);
            case DELUXE_BURGER:
                return new DeluxeBurger(
                        new ArrayList<>(Arrays.asList(
                                IngredientType.BEEF_PATTY,
                                IngredientType.BACON,
                                IngredientType.LETTUCE,
                                IngredientType.TOMATO)),
                        8.8);
            default:
                throw new IllegalArgumentException("no such burger in factory");
        }
    }

    @Override
    public Set createSet(MerchType merchType) {
        return null;
    }
}

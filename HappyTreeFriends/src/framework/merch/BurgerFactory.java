package framework.merch;

import framework.ingredient.IngredientType;
import framework.merch.burger.BaconBurger;
import framework.merch.burger.BeefBurger;
import framework.merch.burger.DeluxeBurger;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DP: Factory
 */
class BurgerFactory extends MerchFactory {
    @Override
    public Merch createMerch(MerchType merchType) {
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
}

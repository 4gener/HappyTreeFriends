package framework.merch;

/**
 * Abstract Factory
 */
public class MerchFactoryMaker {
    public enum MerchFactoryType {
        BEVERAGE,
        BURGER,
        SET
    }

    public static MerchFactory create(MerchFactoryType type) {
        switch (type) {
            case SET:
                // todo
//                return null;
            case BURGER:
                return new BurgerFactory();
            case BEVERAGE:
                return new BeverageFactory();
            default:
                throw new IllegalArgumentException("no such merch factory.");
        }
    }
}

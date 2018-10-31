package framework.merch;

/**
 * Abstract Factory, Null Object
 */
public class MerchFactoryMaker {
    public enum MerchFactoryType {
        BEVERAGE,
        BURGER,
        SET,
        NULL
    }

    public static MerchFactory create(MerchFactoryType type) {
        switch (type) {
            case SET:
                return new SetFactory();
            case BURGER:
                return new BurgerFactory();
            case BEVERAGE:
                return new BeverageFactory();
            default:
                return new NullMerchFactory();
        }
    }
}

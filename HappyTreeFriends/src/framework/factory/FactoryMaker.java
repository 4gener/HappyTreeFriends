package framework.factory;

/**
 * Abstract Factory Pattern
 */
public class FactoryMaker {
    public enum FactoryType {
        INGREDIENT
    }

    public static Factory create(FactoryType type) {
        switch (type) {
            case INGREDIENT:
                return new IngredientFactory();
            default:
                throw new IllegalArgumentException("KingdomType not supported.");
        }
    }
}

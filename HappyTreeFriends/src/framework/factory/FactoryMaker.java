package framework.factory;

public class FactoryMaker {
    public enum FactoryType {
        INGREDIENT
    }

    public static Factory FactoryMaker(FactoryType type) {
        switch (type) {
            case INGREDIENT:
                return new IngredientFactory();
            default:
                throw new IllegalArgumentException("KingdomType not supported.");
        }
    }
}

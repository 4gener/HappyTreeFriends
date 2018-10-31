package framework.ingredient;

public enum IngredientType {
    BACON("培根"), BEEF_PATTY("牛肉"), LETTUCE("生菜"), TOMATO("番茄");

    String name;

    IngredientType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

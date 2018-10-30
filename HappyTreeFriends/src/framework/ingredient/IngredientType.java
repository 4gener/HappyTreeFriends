package framework.ingredient;

public enum IngredientType {
    BACON("bacon"), BEEF_PATTY("beef patty"), LETTUCE("lettuce"), TOMATO("tomato");

    private String title;

    IngredientType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

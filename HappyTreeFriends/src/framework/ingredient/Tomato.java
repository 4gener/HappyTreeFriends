package framework.ingredient;


import framework.cooker.CounterTop;

public class Tomato extends Ingredient {

    Tomato(double baseStateUpdateRate) {
        super(baseStateUpdateRate);
        this.setCooker(new CounterTop());
    }

    @Override
    public IngredientType getIngredientType() {
        return IngredientType.TOMATO;
    }

    @Override
    public String getName() {
        return "番茄";
    }
}

package framework.ingredient;

public abstract class Ingredient {
    private double price;

    public Ingredient(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

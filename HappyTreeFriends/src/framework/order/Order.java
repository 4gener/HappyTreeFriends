package framework.order;

import framework.merch.Merch;

import java.util.ArrayList;

/**
 * DP: Composite
 */
public class Order implements OrderInterface {
    private ArrayList<Merch> merches = new ArrayList<>();

    public void add(Merch merch) {
        merches.add(merch);
    }

    /**
     * DP: Iterator
     * @return
     */
    @Override
    public double totalPrice() {
        double price = 0;
        for (Merch merch : merches) {
            price += merch.getPrice();
        }
        return price;
    }

    @Override
    public boolean hasTray() {
        return false;
    }
}

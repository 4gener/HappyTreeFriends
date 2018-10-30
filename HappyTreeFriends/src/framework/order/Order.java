package framework.order;

import framework.merch.Merch;

import java.util.ArrayList;

public class Order implements OrderInterface {
    private ArrayList<Merch> merches = new ArrayList<>();

    public void add(Merch merch) {
        merches.add(merch);
    }

    @Override
    public double totalPrice() {
        return 0;
    }

    @Override
    public boolean hasTray() {
        return false;
    }
}

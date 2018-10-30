package framework.order;

import framework.merch.Merch;

import java.util.ArrayList;

public class Order {
    private ArrayList<Merch> merches = new ArrayList<>();

    public void add(Merch merch) {
        merches.add(merch);
    }

    public double totalPrice() {
        return 0;
    }
}

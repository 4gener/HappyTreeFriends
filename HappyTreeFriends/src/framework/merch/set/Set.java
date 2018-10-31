package framework.merch.set;

import framework.merch.Merch;
import framework.merch.single.SingleOrder;

import java.util.ArrayList;

public abstract class Set extends Merch {
    private ArrayList<SingleOrder> merchComposite = new ArrayList<>();

    Set(ArrayList<SingleOrder> merchComposite) {
        super(
                merchComposite.stream().mapToDouble(Merch::getPrice).reduce(0, (sum, price) -> sum + price)
        );

        this.merchComposite.addAll(merchComposite);
    }

    @Override
    public void handle() {
        for (Merch merch : merchComposite) {
            merch.handle();
        }
    }
}

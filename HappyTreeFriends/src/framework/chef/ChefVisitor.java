package framework.chef;

import framework.container.Cabinet;
import framework.container.Fridge;

public interface ChefVisitor {
    void visit(Cabinet cabinet);
    void visit(Fridge fridge);
}

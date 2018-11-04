### 程序 Test 清单

| Design Pattern   | Class / Interface                                            | Framework score | Sample program score |
| ---------------- | ------------------------------------------------------------ | --------------- | -------------------- |
| Singleton        | `Chef.getInstance()` <br />`Cabinet.getInstance()`<br />`Fridge.getInstance()` | 7               | 3                    |
| Abstract Factory | `MerchFactory`<br /> `BurgerFactory`<br /> `BeverageFactory`<br />`MerchFactoryMaker` | 7               | 3                    |
| Factory          | `BurgerFactory`<br />`BeverageFactory`                       | 7               | 3                    |
| Template         | `Cooker.startCooking()`<br />`Cooker.finishCooking`          | 7               | 3                    |
| Observer         | `Timer.addObserver`<br />`Timer.removeObserver`<br />`Timer.tick()` | 7               | 3                    |
| Iterator         | `java.util.Iterator`                                         | 7               | 3                    |
| State            | `IngredientState`<br />`IngredientCookedState`<br />`IngredientFreshState` | 7               | 3                    |
| Command          | `ChefCommand`                                                | 7               | 3                    |
| Decorator        | `TrayDecorator`<br />`OrderInterface`                        | 7               | 3                    |
| Strategy         | `Ingredient.setCooker(cooker)`                               | 7               | 3                    |
| Builder          | `OrderBuilder.order`                                         | 7               | 3                    |
| Bridge           | `OrderInterface.totalPrice()`                                | 7               | 3                    |
| Facade           | `Chef.processOrder(order)`                                   | 7               | 3                    |
| Flyweight        | `IngredientFactory.getState(type)`                           | 7               | 3                    |
| Prototype        | `Ingredient.clone()`                                         | 7               | 3                    |
| Memento          | `IngredientMementoInternal`<br />`IngredientMemento`         | 7               | 3                    |
| Null Object      | `NullMerchFactory`                                           | 7               | 3                    |
| Composite        | `Order.add(merch)`                                           | 7               | 3                    |
| Visitor          | `Visitor.visit(container)`                                   | 7               | 3                    |
| Adapter          | `BeverageAdapter`                                            | 7               | 3                    |
| Mediator         | `Order.TakeMeal`                                             | 7               | 3                    |
| Proxy            | `Order.PlaceOrder`                                           | 7               | 3                    |
| Chain of Res.    | `Griller.GrillerResponsibility`                              | 7               | 3                    |
| Interpreter      | `Order.OrderInterpreter`                                     | 7               | 3                    |  

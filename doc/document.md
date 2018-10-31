## 1. 题材综述
上海是一座繁华的城市，在这座魔幻之都里，一切皆有可能。比如，就有这样一家欢乐餐厅，它只售卖汉堡和饮料，却隐含着设计模式的迷幻奥秘。

当顾客来到餐厅时，他可以下单一份汉堡或饮料，如果是大胃王的话，点上几个汉堡或是几个饮料也没什么不可能。当顾客付钱、厨师接到订单时，他会按照顾客的要求呈现美味，聪明地他也会无视订单中各种商品的下单顺序，用他的智慧完成烹饪的过程。如果需要制作一个汉堡，厨师会从壁橱中拿出汉堡坯，然后根据不同的汉堡种类做出不同的反应——烤一块牛肉饼做成牛肉汉堡，烤一片培根做成培根汉堡，或是两个都来，做成双拼豪华汉堡，享受双份美味。肉被厨师从冰箱中取出，放上烤架，烤熟后放入操作台上的汉堡坯中，别忘了加上生菜和西红柿，做成的汉堡就可以放到托盘里了。

啊呀？汉堡肉烤糊了？没关系，神奇的欢乐餐厅总有办法，哔哔哔叭叭哔嗙！肉就复原到生的状态了！

诶？没有牛肉饼/培根/汉堡坯/西红柿/生菜了？没关系，欢乐餐厅里的厨师说话好听又厉害，他可以去进货，也可以暂时创建一个缺少材料的“空汉堡”，原料到了再加进去。

当顾客想要的所有美味都进入托盘后，顾客就可以享用了。享用美味，就在神奇的欢乐餐厅！




## 2. Design Pattern 汇总表

| 编号 | Design pattern name           | 实现个（套）数 | sample programs个数 | 备注 |
| ---- | ----------------------------- | -------------- | ------------------- | ---- |
| 1    | 单例模式 Singleton            | 3              | 2                   |      |
| 2    | 抽象工厂模式 Abstract Factory | 1              | 2                   |      |
| 3    | 工厂模式 Factory              | 2              | 2                   |      |
| 4    | 模板模式 Template             | 1              | 1                   |      |
| 5    | 观察者模式 Observer           | 1              | 2                   |      |
| 6    | 迭代器模式 Iterator           | 2              | 1                   |      |
| 7    | 状态模式 State                | 1              | 1                   |      |
| 8    | 命令模式 Command              | 1              | 1                   |      |
| 9    | 装饰器模式 Decorator          | 1              | 1                   |      |
| 10   | 策略模式 Strategy             | 1              | 1                   |      |
| 11   | 建造者模式 Builder            | 1              | 2                   |      |
| 12   | 桥接模式 Bridge               | 1              | 1                   |      |
| 13   | 外观模式 Facade               | 1              | 2                   |      |
| 14   | 享元模式 Flyweight            | 1              | 1                   |      |
| 15   | 原型模式 Prototype            | 1              | 1                   |      |
| 16   | 备忘录模式 Memento            | 1              | 1                   |      |
| 17   | 空对象模式 Null Object        | 2              | 1                   |      |
| 18   | 组合模式 Composite            | 1              | 1                   |      |
| 19   | 访问者模式 Visitor            | 1              | 1                   |      |



## 3. Design Pattern 详述

### 3.1 单例模式 Singleton

#### 3.1.1 模式简介

单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。

#### 3.1.2 应用场景

在欢乐厨房中，有且仅有一个厨师，因此我们采用了单例模式来创建实例，并向其它对象提供这一实例。厨房中的容器（包括冰箱与壁橱）也符合这一模式。

#### 3.1.3 Class diagram

![](..\UMLDiagrams\DesignPatternView\Singleton_7.png)

#### 3.1.4 API描述

- **Chef 厨师**

   为了保证仅有一个厨师，Chef类具有私有构造函数和本身的一个静态实例，并提供了getInstance()方法，供外界进行访问。

  ```java
  public final class Chef {
      private Chef() {
          if (instance == null) {
              instance = this;
          } else {
              throw new IllegalStateException("Already initialized.");
          }
      }
  
      private static Chef instance;
  
      public static synchronized Chef getInstance() {
          if (instance == null) {
              instance = new Chef();
          }
  
          return instance;
      }
  }
  ```

- **Container 容器 **

  Fridge类与Cabinet类扩展自Container类，也采用了Singleton模式，同样具有自身的私有构造函数与静态实例，提供了 getInstance() 方法。




### 3.2 抽象工厂模式 Abstract Factory

#### 3.2.1 模式简介

抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。

#### 3.2.2 应用场景

商品分为单点、套餐两类。创建商品时，通过抽象的商品工厂生成单点（或套餐）的工厂，再通过该工厂生成具体的商品。

#### 3.2.3 Class diagram

![](..\UMLDiagrams\DesignPatternView\AbstractFactory_8.png)

#### 3.2.4 API描述

创建了抽象工厂类MerchFactory，工厂类BurgerFactory、BeverageFactory等都是继承自MerchFactory。然后创建了一个工厂创造器类MerchFactoryMaker，通过传递type信息来获取工厂类型。

```java
public class MerchFactoryMaker {
    public enum MerchFactoryType {
        BEVERAGE,
        BURGER,
        SET,
        NULL
    }

    public static MerchFactory create(MerchFactoryType type) {
        switch (type) {
            case SET:
                return new SetFactory();
            case BURGER:
                return new BurgerFactory();
            case BEVERAGE:
                return new BeverageFactory();
            default:
                return new NullMerchFactory();
        }
    }
}
```



### 3.3 工厂模式 Factory

#### 3.3.1 模式简介

工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

#### 3.3.2 应用场景

生成汉堡、套餐等商品时，根据提供的商品类型生成对象。

#### 3.3.3 Class diagram

![](..\UMLDiagrams\DesignPatternView\Factory_9.png)

#### 3.3.4 API描述

- **汉堡工厂/饮品工厂/套餐工厂**

  创建了工厂类BurgerFactory、BeverageFactory等，生成基于MerchType信息的实体类的对象

  ```java
  class BurgerFactory extends MerchFactory {
      @Override
      public SingleOrder createSingleOrder(MerchType merchType) {
          switch (merchType) {
              case BEEF_BURGER:
                  return new BeefBurger(
                          new ArrayList<>(Arrays.asList(
                                  IngredientType.BEEF_PATTY,
                                  IngredientType.LETTUCE,
                                  IngredientType.TOMATO)),
                          5);
              case BACON_BURGER:
                  return new BaconBurger(
                          new ArrayList<>(Arrays.asList(
                                  IngredientType.BACON,
                                  IngredientType.LETTUCE,
                                  IngredientType.TOMATO)),
                          4);
              case DELUXE_BURGER:
                  return new DeluxeBurger(
                          new ArrayList<>(Arrays.asList(
                                  IngredientType.BEEF_PATTY,
                                  IngredientType.BACON,
                                  IngredientType.LETTUCE,
                                  IngredientType.TOMATO)),
                          8.8);
              default:
                  throw new IllegalArgumentException("no such burger in factory");
          }
      }
  
      @Override
      public Set createSet(MerchType merchType) {
          return null;
      }
  }
  ```

- **原料工厂**

  创建了工厂类IngredientFactory，生成基于IngredientType信息的实体类的对象。


### 3.4 模板模式 Template

#### 3.4.1 模式简介

在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。这种类型的设计模式属于行为型模式。

#### 3.4.2 应用场景

在烹饪过程中，具体的烹饪方法将根据不同的厨具类型来确定，因此我们采用了模板模式来将制作步骤延迟到子类中。

#### 3.4.3 Class diagram

![](..\UMLDiagrams\DesignPatternView\Template_10.png)

#### 3.4.4 API描述

CounterTop类和Giller类是扩展了Cooker的实体类，它们重写了抽象类的方法startCooking和finishCooking。

```java
public abstract class Cooker {
    protected ArrayList<IngredientType> availableTypes = new ArrayList<IngredientType>();

    private boolean isIngredientTypeLegal(IngredientType type) {
        return availableTypes.contains(type);
    }

    public final void cook(Ingredient ingredient) {
        if (!(this.isIngredientTypeLegal(ingredient.getIngredientType()))) {
            throw new IllegalArgumentException("this ingredient doesn't belong here");
        }
        startCooking(ingredient);
        finishCooking(ingredient);
    }

    abstract void startCooking(Ingredient ingredient);

    abstract void finishCooking(Ingredient ingredient);

    public abstract String getName();
}
```



### 3.5 观察者模式 Observer

#### 3.5.1 模式简介

当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。比如，当一个对象被修改时，则会自动通知它的依赖对象。观察者模式属于行为型模式。

#### 3.5.2 应用场景

在欢乐厨房中，当系统时间发生变化时，会被食材观测到，从而影响食材的新鲜程度。

#### 3.5.3 Class diagram

![](..\UMLDiagrams\DesignPatternView\Observer_11.png)

#### 3.5.4 API描述



```java
	private ArrayList<TimeObserver> observers = new ArrayList<>();

    /**
     * 更新内部时间，加快历史的进程
     */
    public void tick() {
        for (TimeObserver o : observers) {
            o.update();
        }
    }

    public void addObserver(TimeObserver o) {
        observers.add(o);
    }

    public void removeObserver(TimeObserver o) {
        observers.remove(o);
    }
```



### 3.6 迭代器模式 Iterator

#### 3.6.1 模式简介

迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。迭代器模式属于行为型模式。

#### 3.6.2 应用场景

我们使用了迭代器模式来提供方法遍历容器中的食材。此外，订单总价实际上为订单内部所有汉堡或套餐价格相加的总价，也采用了迭代器模式。

#### 3.6.3 Class diagram

#### 3.6.4 API描述

totalPrice()遍历所有商品，返回商品的总价格。

```java
 public double totalPrice() {
        double price = 0;
        for (Merch merch : merches) {
            price += merch.getPrice();
        }
        return price;
    }
```



### 3.7 状态模式 State

#### 3.7.1 模式简介

在状态模式（State Pattern）中，类的行为是基于它的状态改变的。这种类型的设计模式属于行为型模式。在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。

#### 3.7.2 应用场景

食材的状态（生、熟、腐烂）会影响它的行为，决定它是否可以被加入菜品。

#### 3.7.3 Class diagram

![](..\UMLDiagrams\DesignPatternView\State_12.png)

#### 3.7.4 API描述

创建了IngredientState接口和实现了接口的实体类IngredientCookedState、IngredientFreshState等。

```java
public interface IngredientState {
    public abstract boolean isStale(Ingredient ingredient);

    public abstract boolean isCooked(Ingredient ingredient);
}
```



### 3.8 命令模式 Command

#### 3.8.1 模式简介

命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。

#### 3.8.2 应用场景

厨师可以对食材和菜品进行操作，包括处理食材、制作菜品等等。

#### 3.8.3 Class diagram

#### 3.8.4 API描述

创建了作为命令的接口ChefCommand，而实体类Chef实现了ChefCommand接口。

```java
public interface ChefCommand {
    void showStock();
    void processOrder(Order order);
}
```



### 3.9 装饰器模式 Decorator

#### 3.9.1 模式简介

装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。

#### 3.9.2 应用场景

菜品装盘

#### 3.9.3 Class diagram

![](..\UMLDiagrams\DesignPatternView\Decorator_13.png)

#### 3.9.4 API描述

这种模式创建了一个装饰类TrayDecorator，用来实现接口 OrderInterface，

```java
  public class TrayDecorator implements OrderInterface {
    private Order order;

    public TrayDecorator(Order order) {
        this.order = order;
    }

    @Override
    public double totalPrice() {
        return order.totalPrice();
    }

    @Override
    public boolean hasTray() {
        return true;
    }
}
```



### 3.10 策略模式 Strategy

#### 3.10.1 模式简介

在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。策略对象改变 context 对象的执行算法。

#### 3.10.2 应用场景

处理原材料的时候，不同材料需要使用不同的厨具（Strategy），从而烹饪的方法也不同。

#### 3.10.3 Class diagram

![](..\UMLDiagrams\DesignPatternView\Strategy_14.png)

#### 3.10.4 API描述

设置处理食材的厨具

```java
 protected void setCooker(Cooker cooker) {
        this.cooker = cooker;
    }
```



### 3.11 建造者模式 Builder

#### 3.11.1 模式简介

建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

#### 3.11.2 应用场景

在创建订单的过程中，汉堡、饮料或套餐的选择顺序对订单的最终产出没有影响。

#### 3.11.3 Class diagram

![](..\UMLDiagrams\DesignPatternView\Builder.png)

#### 3.11.4 API描述

创建了 OrderBuilder 类，其中包含带有 Merch 的 ArrayList 以及根据 MerchType 创建不同类型的Order对象。

- orderBurger(MerchType type)

点汉堡

```java
 protected void setCooker(Cooker cooker) {
        this.cooker = cooker;
    }
```

- orderBeverage

点饮料

```java
 public void orderBeverage(MerchType type) {
        try {
            MerchFactory factory = MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.BEVERAGE);
            merches.add(factory.createSingleOrder(type));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
```

- orderSet(MerchType type)

点套餐

```java
  public void orderSet(MerchType type) {
        try {
            MerchFactory factory = MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.SET);
            merches.add(factory.createSet(type));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
```

- Order order()

下订单

```java
public Order order() {
        Order order = new Order();

        for (Merch merch : merches) {
            order.add(merch);
        }

        return order;
    }
```



### 3.12 桥接模式 Bridge
#### 3.12.1 模式简介
桥接模式（Bridge）是软件设计模式中较为复杂的模式之一，用于把抽象化和现实化解耦，使二者可以独立变化，这种类型的设计模式属于结构型模式，它通过提供抽象化和现实化之间的桥接结构来实现二者的解耦。这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。
#### 3.12.2 应用场景
当原料盛放在容器中时，容器在检测原料的可食用状态变化时实际上使用的是原料的内部方法；此外在订单部分，我们在计算订单总价的时候也使用了订单内部食物内部的抽象方法来获取食物的单价。

#### 3.12.3 Class diagram

#### 3.12.4 API描述

```java

```



### 3.13 外观模式 Facade
#### 3.13.1 模式简介
外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。这种模式涉及到一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。外观模式多用于为复杂模块提供外部访问接口，提高子系统的相对独立性。
#### 3.13.2 应用场景
汉堡的制作是一个极为复杂的过程，我们这里想对顾客隐藏后厨的制作细节，因此我们在这里使用“制作”这个接口来隐藏具体实现。

#### 3.13.3 Class diagram

![](..\UMLDiagrams\DesignPatternView\Facade_17.png)

#### 3.13.4 API描述

```java

```



### 3.14 享元模式 Flyweight
#### 3.14.1 模式简介
享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。享元模式大多用在系统中有大量相似的对象或者需要缓冲池的场景。
#### 3.14.2 应用场景
欢乐厨房里食材的状态对象（State）只需要创建一次，以后会被多处共享同一个对象，因此我们在这里使用享元模式来实现共享。 

#### 3.14.3 Class diagram

![](..\UMLDiagrams\DesignPatternView\Flyweight_19.png)

#### 3.14.4 API描述

定义了工厂类IngredientStateFactory来获取IngredientState对象，向IngredientStateFactory传递信息以便获取它所需状态对象。

```java
public class IngredientStateFactory {
    private static HashMap<IngredientStateType, IngredientState> map = new HashMap<>();

    public static IngredientState getState(IngredientStateType type) {
        IngredientState state = map.get(type);
        if (state == null) {
            switch (type) {
                case FRESH:
                    state = new IngredientFreshState();
                    map.put(type, state);
                    break;
                case STALE:
                    state = new IngredientStaleState();
                    map.put(type, state);
                    break;
                case COOKED:
                    state = new IngredientCookedState();
                    map.put(type, state);
                    break;
            }
        }
        return state;
    }
}
```



### 3.15 原型模式 Prototype
#### 3.15.1 模式简介
原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。该模式实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。
#### 3.15.2 应用场景
当欢乐厨房中的原料用尽时，厨师可以补充原料，因此为了简化模型复杂度我们这里使用原型模式对原有原料进行克隆。

#### 3.15.3 Class diagram

#### 3.15.4 API描述

```java

```



### 3.16 备忘录模式 Memento
#### 3.16.1 模式简介
备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。备忘录模式属于对象行为型模式。备忘录对象是一个用来存储另外一个对象内部状态的快照的对象。备忘录模式的用意是在不破坏封装的条件下，捕获一个对象的状态捕捉，并外部化，存储起来，从而可以在将来合适的时候把这个对象还原到存储起来的状态。
#### 3.16.2 应用场景
食材处理过程可能出现意外，需要备忘录机制来进行处理。食材的状态和新鲜程度保存在备忘录中，处理食材之前可以先保存当前状态。

#### 3.16.3 Class diagram

![](..\UMLDiagrams\DesignPatternView\Memento_18.png)

#### 3.16.4 API描述

用于保存食材的状态和新鲜程度。

```java
public static class IngredientMementoInternal implements IngredientMemento {

    private IngredientState state;

    private double stateRate;

    public IngredientState getState() {
        return state;
    }

    public void setState(IngredientState state) {
        this.state = state;
    }

    public double getStateRate() {
        return stateRate;
    }

    public void setStateRate(double stateRate) {
        this.stateRate = stateRate;
    }

}
```



### 3.17 空对象模式 Null Object
#### 3.17.1 模式简介
空对象模式（Null Object Pattern），用一个空对象取代 NULL 对象实例的检查。Null 对象不是检查空值，而是反应一个不做任何动作的关系。这样的 Null 对象也可以在数据不可用的时候提供默认的行为。
#### 3.17.2 应用场景
在创建订单时，有可能出现指定的商品不存在，直接返回一个空商品（价格为0）。

#### 3.17.3 Class diagram

#### 3.17.4 API描述

创建订单时，可能出现单品或套餐为空的情况，这时直接返回一个空的单品订单或套餐订单。

```java
public class NullMerchFactory extends MerchFactory {
    @Override
    public SingleOrder createSingleOrder(MerchType merchType) {
        return new NullSingleOrder();
    }

    @Override
    public Set createSet(MerchType merchType) {
        return new NullSet();
    }
}
```



### 3.18 组合模式 Composite

#### 3.18.1 模式简介

组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。

#### 3.18.2 应用场景

订单中既可以包含食品、又可以包含食品组成的套餐。

#### 3.18.3 Class diagram

![](..\UMLDiagrams\DesignPatternView\Composite.png)

#### 3.18.4 API描述

- **add(Merch merch)**

  订单的行为，向订单中增加商品，商品类型是merch，merch又有Coke和Burger两个子类。

  ```java
  public void add(Merch merch) {
          merches.add(merch);
      }
  ```



### 3.19 访问者模式 Visitor

#### 3.19.1 模式简介

在访问者模式（Visitor Pattern）中，我们使用了一个访问者类，它改变了元素类的执行算法。通过这种方式，元素的执行算法可以随着访问者改变而改变。这种类型的设计模式属于行为型模式。根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。

#### 3.19.2 应用场景

厨师查看冰箱、橱柜的东西时，不需要在冰箱、橱柜中设计遍历的方法，可以设计一个外部的厨师的visitor类来访问。 

#### 3.19.3 Class diagram

![](..\UMLDiagrams\DesignPatternView\Visitor_16.png)

#### 3.19.4 API描述

- **visit(Container container)**

访问冰箱或是橱柜中的食材

```java
public void visit(Container container) {
        System.out.println(container.getName() + "里装有：");
        for (Ingredient ingredient : container.getIngredients()) {
            ingredient.displayInfo();
        }
        System.out.println();
    }
```

## 1. 题材综述
上海是一座繁华的城市，在这座魔幻之都里，一切皆有可能。比如，就有这样一家欢乐餐厅，它只售卖汉堡和饮料，却隐含着设计模式的迷幻奥秘。

当顾客来到餐厅时，他可以下单一份汉堡或饮料，如果是大胃王的话，点上几个汉堡或是几个饮料也没什么不可能。当顾客付钱、厨师接到订单时，他会按照顾客的要求呈现美味，聪明地他也会无视订单中各种商品的下单顺序，用他的智慧完成烹饪的过程。如果需要制作一个汉堡，厨师会从壁橱中拿出汉堡坯，然后根据不同的汉堡种类做出不同的反应——烤一块牛肉饼做成牛肉汉堡，烤一片培根做成培根汉堡，或是两个都来，做成双拼豪华汉堡，享受双份美味。肉被厨师从冰箱中取出，放上烤架，烤熟后放入操作台上的汉堡坯中，别忘了加上生菜和西红柿，做成的汉堡就可以放到托盘里了。

啊呀？汉堡肉烤糊了？没关系，神奇的欢乐餐厅总有办法，哔哔哔叭叭哔嗙！肉就复原到生的状态了！

诶？没有牛肉饼/培根/汉堡坯/西红柿/生菜了？没关系，欢乐餐厅里的厨师说话好听又厉害，他可以去进货，也可以暂时创建一个缺少材料的“空汉堡”，原料到了再加进去。

当顾客想要的所有美味都进入托盘后，顾客就可以享用了。享用美味，就在神奇的欢乐餐厅！


## 2. Design Pattern 汇总表

| 编号 | Design pattern name           | 实现个（套）数 | sample programs个数 | 备注 |
| ---- | ----------------------------- | -------------- | ------------------- | ---- |
| 1    | 单例模式 Singleton            |                |                     |      |
| 2    | 抽象工厂模式 Abstract Factory |                |                     |      |
| 3    | 工厂模式 Factory              |                |                     |      |
| 4    | 模板模式 Template             |                |                     |      |
| 5    | 观察者模式 Observer           |                |                     |      |
| 6    | 迭代器模式 Iterator           |                |                     |      |
| 7    | 状态模式 State                |                |                     |      |
| 8    | 命令模式 Command              |                |                     |      |
| 9    | 装饰器模式 Decorator          |                |                     |      |
| 10   | 策略模式 Strategy             |                |                     |      |
| 11   | 建造者模式 Builder            |                |                     |      |
| 12   | 桥接模式 Bridge               |                |                     |      |
| 13   | 中介者模式 Mediator           |                |                     |      |
| 14   | 外观模式 Facade               |                |                     |      |
| 15   | 享元模式 Flyweight            |                |                     |      |
| 16   | 原型模式 Prototype            |                |                     |      |
| 17   | 备忘录模式 Memento            |                |                     |      |
| 18   | 代理模式 Proxy                |                |                     |      |
| 19   | 空对象模式 Null Object        |                |                     |      |
| 20   | 组合模式 Composite            |                |                     |      |
| 21   | 访问者模式 Visitor            |                |                     |      |



## 3. Design Pattern 详述

### 3.1 单例模式 Singleton

单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。

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

  ```java
  代码
  ```



### 3.2 抽象工厂模式 Abstract Factory

抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

- **API **

  创建了抽象工厂类MerchFactory，工厂类BurgerFactory和BeverageFactory都是扩展自MerchFactory。然后创建了一个工厂创造器类MerchFactoryMaker，通过传递type信息来获取工厂类型。



### 3.3 工厂模式 Factory

工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

- **汉堡工厂/饮品工厂**

  创建了两个工厂类BurgerFactory/BeverageFactory，生成基于MerchType信息的实体类的对象

- **材料工厂**

  创建了一个工厂类IngredientFactory，生成基于IngredientType信息的实体类的对象。



### 3.4 模板模式 Template



### 3.5 观察者模式 Observer



### 3.6 迭代器模式 Iterator

- **totalPrice()**

  遍历所有商品，返回商品的总价格。

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



### 3.8 命令模式 Command



### 3.9 装饰器模式 Decorator

装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。

- **API**

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



### 3.11 建造者模式 Builder

建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

- API

在创建订单的过程中，汉堡、饮料或套餐的选择顺序对订单的最终产出没有影响

创建了 OrderBuilder 类，其中包含带有 Merch 的 ArrayList 以及根据 MerchType 创建不同类型的Order对象。





### 3.12 桥接模式 Bridge
#### 模式简介
桥接模式（Bridge）是软件设计模式中较为复杂的模式之一，用于把抽象化和现实化解耦，使二者可以独立变化，这种类型的设计模式属于结构型模式，它通过提供抽象化和现实化之间的桥接结构来实现二者的解耦。这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。
#### 应用场景
当原料盛放在容器中时，容器在检测原料的可食用状态变化时实际上使用的是原料的内部方法；此外在订单部分，我们在计算订单总价的时候也使用了订单内部食物内部的抽象方法来获取食物的单价。

### 3.13 中介者模式 Mediator
#### 模式简介
中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性，这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护，中介者模式属于行为模式。中介者模式大多用在系统中对象之间依赖关系结构混乱或者想利用中间类来封装多个类中的行为的情况下。
#### 应用场景
当食物放进托盘中时，我们会使用一个中介者来访问订单，修改其状态为代待取餐。

### 3.14 外观模式 Facade
#### 模式简介
外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。这种模式涉及到一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。外观模式多用于为复杂模块提供外部访问接口，提高子系统的相对独立性。
#### 应用场景
汉堡的制作是一个极为复杂的过程，我们这里想对顾客隐藏后厨的制作细节，因此我们在这里使用“制作”这个接口来隐藏具体实现。

### 3.15 享元模式 Flyweight
#### 模式简介
享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。享元模式大多用在系统中有大量相似的对象或者需要缓冲池的场景。
#### 应用场景
欢乐厨房里的原料会被厨具、容器和汉堡等多处共享，因此我们在这里使用享元模式来实现共享。

### 3.16 原型模式 Prototype
#### 模式简介
原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。该模式实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。
#### 应用场景
当欢乐厨房中的原料用尽时，厨师可以补充原料，因此为了简化模型复杂度我们这里使用原型模式对原有原料进行克隆。

### 3.17 备忘录模式 Memento



### 3.18 代理模式 Proxy



### 3.19 空对象模式 Null Object



### 3.20 组合模式 Composite

- **add(Merch merch)**

  订单的行为，向订单中增加商品，商品类型是merch，merch又有Coke和Burger两个子类。

  ```java
  public void add(Merch merch) {
          merches.add(merch);
      }
  ```



### 3.21 访问者模式 Visitor

## 1. 题材综述



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



### 3.13 中介者模式 Mediator



### 3.14 外观模式 Facade



### 3.15 享元模式 Flyweight



### 3.16 原型模式 Prototype



### 3.17 备忘录模式 Memento



### 3.18 代理模式 Proxy



### 3.19 空对象模式 Null Object



### 3.20 组合模式 Composite



### 3.21 访问者模式 Visitor
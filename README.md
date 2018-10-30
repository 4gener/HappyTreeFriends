# HappyTreeFriends
 420260 Fall2018 Design Pattern (course project) by Jie HOU @ SSE, Tongji University



### Class Design

- **厨师 Chef**

  行为：

  - 制作汉堡
  - 查看现有食材及状态
  - 查看订单
  - 补充食材

  属性：

  - 容器及其存储的食材列表
  - 厨具列表

- **食材 Ingredients**

  食材分为西红柿 (Tomato)，生菜(Lettuce)，牛肉饼 (BeefPatty) ，培根(Bacon)。

  行为：

  - 可食用状态变化（可食用、腐烂）

  属性：

  - 可食用状态百分比

- **厨具 Cooker**

  厨具分为操作台(CounterTop)，烤架(Griller)。

- **容器 Container**

  容器分为冰箱(Fridge)，壁橱(Cabinet)，托盘(Tray)。

  行为：

  - 存放食材/汉堡
  - 取出

- **商品 Merch**

- **汉堡 Burger**

  汉堡分为：牛肉汉堡(BeefBurger)，培根汉堡(BaconBurger)，双拼豪华汉堡(DeluxeBurger)。

  属性：

  - 所需食材列表
  - 价格

- **饮品 Beverage**
  饮品分为：可乐(Coke)，橙汁(OrangeJuice)。

- **套餐 Set**

  属性：

  - 商品列表



### Design Pattern

- **单例模式 Singleton✅**

  厨师自身

- **抽象工厂模式 AbstractFactory✅**

  订单工厂通过汉堡工厂、饮品工厂创建

- **工厂模式 Factory✅**

  生成汉堡，根据原料的类型确定汉堡类型

- **模版模式 Template**

  制作菜品，制作过程与菜品类型相关联

- **观察者模式 Observer**

  原料可食用状态变化变化（由熟变为腐烂）

- **迭代器模式 Iterator**

  遍历容器中的食材

  订单总价实际上为订单内部所有汉堡的总价

- **状态模式 State**

  食材的状态会影响它是否可以被加入菜品

- **命令模式 Command**

  厨师操控食材、菜品

- **装饰器模式 Decorator✅**

  菜品装盘

- **策略模式 Strategy**

  处理原材料的时候，不同材料需要使用不同的厨具进行处理。

- **建造者模式 Builder✅**

  创建订单，订单中汉堡、饮料的选择顺序对订单的最终产出没有影响

- **桥接模式 Bridge**

  容器在监测原料的可食用状态变化时实际上使用的是原料的内部方法

  订单总价实际上为订单内部所有汉堡的总价

- **中介者模式 Mediator**

  汉堡放进托盘，通知订单修改状态为待取餐

- **外观模式 Facade**

  汉堡制作过程复杂，我们用一个简单的“制作”接口来隐藏这些细节

- **享元模式 Flyweight**

  原料对象会被厨具、容器、汉堡多处共享，在使用时直接返回在内存中已有的对象，避免重新创建

- **原型模式 Prototype**

  厨师可以补充原材料，此处可用现有原材料进行克隆

- **备忘录模式 Memento**

  食材处理过程可能出现意外，需要备忘录机制来进行处理

- **代理模式 Proxy**

  下单时虽然目标是商品本身，但是实际实现是通过订单中添加商品

- **空对象模式 Null Object**

  制作汉堡时有可能遇到原料不足的状态，在创建汉堡实体时使用

- **组合模式 Composite**

  订单中既可以包含食品、又可以包含食品组成的套餐

- **访问者模式 Visitor**

  厨师在处理套餐的时候，实际上是对套餐内部了食品进行了处理

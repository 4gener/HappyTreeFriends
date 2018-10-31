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

  - **单点**

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

* **订单 Order**

### Design Pattern

- **单例模式 Singleton** ✅

  厨师自身，厨具都是唯一一个

- **抽象工厂模式 AbstractFactory** ✅

  商品分为单点、套餐两类。创建商品时，通过抽象工厂生成单点（或套餐）的工厂，再通过该工厂生成具体的商品

- **工厂模式 Factory** ✅

  生成汉堡、套餐等商品时，根据提供的商品类型生成对象。

- **模版模式 Template** :white_check_mark: 

  不同厨具的烹饪方法不同

- **观察者模式 Observer** :white_check_mark:

  ~~原料可食用状态变化变化（由熟变为腐烂）~~ 没写

  系统时间的改变，会被食材观测到，影响食材的新鲜程度

- **迭代器模式 Iterator** ✅

  遍历容器中的食材

  遍历订单的商品

- **状态模式 State** :white_check_mark:

  食材的状态（生、熟、腐烂）会影响它是否可以被加入菜品

- **命令模式 Command** WIP

  厨师操控食材、菜品

- **装饰器模式 Decorator** ✅

  菜品装盘

- **策略模式 Strategy** :white_check_mark:

  处理原材料的时候，不同材料设置不同的厨具（Strategy）从而烹饪的方法也不同

- **建造者模式 Builder** ✅

  创建订单，订单中汉堡、饮料的选择顺序对订单的最终产出没有影响

- **桥接模式 Bridge** :white_check_mark:😳

  容器在监测原料的可食用状态变化时实际上使用的是原料的内部方法

  订单总价实际上为订单内部所有汉堡的总价

- **中介者模式 Mediator**

  汉堡放进托盘，通知订单修改状态为待取餐

- **外观模式 Facade**

  汉堡制作过程复杂，我们用一个简单的“制作”接口来隐藏这些细节

- **享元模式 Flyweight** :white_check_mark:

  食材的状态对象（State）只需要创建一次，以后共享同一个对象。

- **原型模式 Prototype** :white_check_mark:

  厨师可以补充原材料，此处可用现有原材料进行克隆

- **备忘录模式 Memento** :white_check_mark:

  食材处理过程可能出现意外，需要备忘录机制来进行处理。食材的状态和新鲜程度保存在备忘录中，处理食材之前可以先保存当前状态。

- **代理模式 Proxy**

  下单时虽然目标是商品本身，但是实际实现是通过订单中添加商品

- **空对象模式 Null Object** :white_check_mark:

  ~~制作汉堡时有可能遇到原料不足的状态，在创建汉堡实体时使用~~

  在创建订单时，有可能出现指定的商品不存在，直接返回一个空商品（价格为0）

- **组合模式 Composite** ✅

  订单中既可以包含食品、又可以包含食品组成的套餐

- **访问者模式 Visitor** :white_check_mark:

  厨师通过访问者访问冰箱、橱柜里的食材

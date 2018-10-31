import com.sun.tools.corba.se.idl.constExpr.Or;
import framework.chef.Chef;
import framework.chef.SimpleChefVisitor;
import framework.container.Cabinet;
import framework.container.Fridge;
import framework.container.TrayDecorator;
import framework.cooker.CounterTop;
import framework.cooker.Griller;
import framework.ingredient.Ingredient;
import framework.ingredient.IngredientFactory;
import framework.ingredient.IngredientMemento;
import framework.ingredient.IngredientType;
import framework.ingredient.state.IngredientStateType;
import framework.ingredient.state.IngredientStateFactory;
import framework.merch.Merch;
import framework.merch.MerchFactory;
import framework.merch.MerchFactoryMaker;
import framework.merch.MerchType;
import framework.merch.set.Set;
import framework.order.Order;
import framework.order.OrderBuilder;
import framework.time.Timer;

public class Main {

    public static void main(String[] args) {
        Main.TestServeOrder();
//        Main.TestSingleton();
//        Main.TestAbstractFactory();
//        Main.TestFactory();
//        Main.TestTemplate();
//        Main.TestObserver();
//        Main.TestState();
//        Main.TestDecorator();
//        Main.TestStrategy();
//        Main.TestBuilder();
//        Main.TestBridge();
//        Main.TestFacade();
//        Main.TestFlyweight();
//        Main.TestPrototype();
//        Main.TestNullObject();
//        Main.TestComposite();
//        Main.TestVisitor();
//        Main.TestMemento();

    }

    public static void TestServeOrder() {
        // 下单测试
        // 单例模式 Singleton
        Chef chef = Chef.getInstance();

        // Command && Facade
        chef.showStock();

        System.out.println("内部时间流动 10 个 tick，食材的新鲜度发生变化！");
        for (int i = 0; i < 10; i++) {
            Timer.getInstance().tick();
        }
        chef.showStock();

        // Builder
        OrderBuilder builder = new OrderBuilder();
        builder.orderBurger(MerchType.BEEF_BURGER);
        // Composite
        builder.orderSet(MerchType.SET_BEEF_BURGER_COKE);
        builder.orderBeverage(MerchType.COKE);
        Order order = builder.order();

        // Command && Facade
        chef.processOrder(order);
    }

    public static void TestSingleton() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.printf("比较大厨实例地址是否相等: %b\n", Chef.getInstance() == Chef.getInstance());
        System.out.printf("比较橱柜实例地址是否相等: %b\n", Cabinet.getInstance() == Cabinet.getInstance());
        System.out.printf("比较冰箱实例地址是否相等: %b\n", Fridge.getInstance() == Fridge.getInstance());
        System.out.println("==================");
    }

    public static void TestAbstractFactory() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        MerchFactory factory1 = MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.SET);
        MerchFactory factory2 = MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.BURGER);
        System.out.printf("使用抽象工厂创建一个套餐工厂: %s; 再使用该工厂创建商品: %s\n", factory1.getClass().getCanonicalName(), factory1.createSet(MerchType.SET_BEEF_BURGER_COKE).getName());
        System.out.printf("使用抽象工厂创建一个套餐工厂: %s\n", factory2.getClass().getCanonicalName());

        System.out.println("==================");
    }

    public static void TestFactory() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        IngredientFactory factory = new IngredientFactory();
        System.out.printf("创建食材工厂: %s\n", factory.getClass().getCanonicalName());
        System.out.printf("创建食材: %s\n", factory.createIngredient(IngredientType.BEEF_PATTY).getName());
        System.out.println("==================");
    }

    public static void TestTemplate() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Ingredient beef = new IngredientFactory().createIngredient(IngredientType.BEEF_PATTY);
        Ingredient tomato = new IngredientFactory().createIngredient(IngredientType.TOMATO);
        new Griller().cook(beef);
        new CounterTop().cook(tomato);
        System.out.println("==================");
    }

    public static void TestObserver() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Ingredient beef = new IngredientFactory().createIngredient(IngredientType.BEEF_PATTY);
        beef.displayInfo();
        Timer.getInstance().tick();
        beef.displayInfo();
        System.out.println("==================");
    }

    public static void TestState() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Ingredient beef = new IngredientFactory().createIngredient(IngredientType.BEEF_PATTY);
        System.out.println("> 初始状态");
        System.out.printf("牛肉是否加工： %b；腐烂: %b\n", beef.isCooked(), beef.isStale());
        System.out.println("> 状态->加工");
        beef.changeState(IngredientStateType.COOKED);
        System.out.printf("牛肉是否加工： %b；腐烂: %b\n", beef.isCooked(), beef.isStale());
        System.out.println("> 状态->腐烂");
        beef.changeState(IngredientStateType.STALE);
        System.out.printf("牛肉是否加工： %b；腐烂: %b\n", beef.isCooked(), beef.isStale());
        System.out.println("==================");
    }

    public static void TestDecorator() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        OrderBuilder builder = new OrderBuilder();
        builder.orderBeverage(MerchType.COKE);
        Order order = builder.order();

        order.displayMerches();

        TrayDecorator decorator = new TrayDecorator(order);
        System.out.println("> 经过 TrayDecorator 后");
        decorator.displayMerches();
        System.out.println("==================");
    }

    public static void TestStrategy() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Ingredient beef = new IngredientFactory().createIngredient(IngredientType.BEEF_PATTY);
        System.out.println("> 设置牛肉的加工工具为 烤架");
        beef.setCooker(new Griller());
        beef.doCook();
        System.out.println("==================");
    }

    public static void TestBuilder() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        OrderBuilder builder = new OrderBuilder();
        builder.orderBurger(MerchType.BEEF_BURGER);
        builder.orderSet(MerchType.SET_BEEF_BURGER_COKE);
        builder.orderSet(MerchType.SET_BEEF_BURGER_COKE);
        builder.orderBeverage(MerchType.COKE);
        Order order = builder.order();

        order.displayMerches();
        System.out.println("==================");
    }

    public static void TestBridge() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        OrderBuilder builder = new OrderBuilder();
        builder.orderBurger(MerchType.BEEF_BURGER);
        builder.orderSet(MerchType.SET_BEEF_BURGER_COKE);
        builder.orderBeverage(MerchType.COKE);
        Order order = builder.order();
        System.out.printf("订单价格，通过内部商品计算 %f\n", order.totalPrice());
        System.out.println("==================");
    }

    public static void TestFacade() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("> 厨师的操作对外简化成几个简单的接口，内部操作对外隐藏");
        Chef chef = Chef.getInstance();

        chef.showStock();
        System.out.println("==================");
    }

    public static void TestFlyweight() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("> 食材状态对象全局共享");
        System.out.printf("fresh: %b\n", IngredientStateFactory.getState(IngredientStateType.FRESH) == IngredientStateFactory.getState(IngredientStateType.FRESH));
        System.out.println("==================");
    }

    public static void TestPrototype() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Ingredient beef = new IngredientFactory().createIngredient(IngredientType.BEEF_PATTY);
        try {
            Ingredient beef2 = (Ingredient) beef.clone();
            System.out.printf("beef1==beef2: %b\n", beef == beef2);
            System.out.println("> beef1 info");
            beef.displayInfo();
            System.out.println("> beef2 info");
            beef2.displayInfo();
        } catch (CloneNotSupportedException e) {

        }
        System.out.println("==================");
    }

    public static void TestNullObject() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("> 尝试创建一个不存在的工厂");
        MerchFactory factory1 = MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.NULL);
        Merch merch = factory1.createSet(MerchType.SET_BEEF_BURGER_COKE);
        System.out.printf("对象: %s, 价格: %f\n", merch.getClass().getCanonicalName(), merch.getPrice());
        System.out.println("==================");
    }

    public static void TestComposite() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        MerchFactory factory1 = MerchFactoryMaker.create(MerchFactoryMaker.MerchFactoryType.SET);
        Set set = factory1.createSet(MerchType.SET_BEEF_BURGER_COKE);
        System.out.printf("套餐名：%s, 套餐价格：%s\n", set.getName(), set.getPrice());
        System.out.println("==================");
    }

    public static void TestVisitor() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Cabinet.getInstance().accept(new SimpleChefVisitor());
        System.out.println("==================");
    }

    public static void TestMemento() {
        System.out.println("==================");
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Ingredient ingredient = new IngredientFactory().createIngredient(IngredientType.BEEF_PATTY);
        ingredient.displayInfo();
        // 保存状态
        IngredientMemento memento = ingredient.getMemento();

        System.out.println("1000 tick");
        for (int i = 0; i < 1000; ++i) {
            Timer.getInstance().tick();
        }
        ingredient.displayInfo();

        System.out.println("复原");
        ingredient.setMemento(memento);
        ingredient.displayInfo();
        System.out.println("==================");
    }
}

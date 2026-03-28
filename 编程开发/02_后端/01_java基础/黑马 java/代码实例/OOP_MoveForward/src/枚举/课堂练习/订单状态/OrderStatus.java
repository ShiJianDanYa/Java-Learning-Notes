package 枚举.课堂练习.订单状态;

/**
 * ClassName: OrderStatus
 * Package: 枚举.课堂练习.订单状态
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/17 - 22:47
 * @Version: v1.0
 *
 */
public enum OrderStatus {
    /*
    电商项目中，订单的状态只有以下6种，请编写代码实现。
    待支付     PAYMENT_PENDING
    处理中     PROCESSING
    已发货     SHIPPED
    配送中     OUT_FOR_DELIVERY
    已送达     DELIVERED
    已取消     CANCELLED
    */
    //枚举项 格式
    //对象名 需要调用的构造方法
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    OUT_FOR_DELIVERY("配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消");
    private String name;
    //构造方法
    //为什么用private修饰,因为不能让外界创建对象啊
    //补充灰色代表可以省略不写
    //即使我们不用private 虚拟机也会自动为我们加上
    OrderStatus(String name) {
        this.name = name;
    }
    //方法
    public String getName() {
        return name;
    }
}

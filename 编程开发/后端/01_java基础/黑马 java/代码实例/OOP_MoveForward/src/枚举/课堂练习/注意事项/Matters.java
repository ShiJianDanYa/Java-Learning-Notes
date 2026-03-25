package 枚举.课堂练习.注意事项;

/**
 * ClassName: Matters
 * Package: 枚举.课堂练习.注意事项
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/18 - 11:34
 * @Version: v1.0
 *
 */
public class Matters {
    /*
    1.每一个枚举项，都是该枚举类的对象,每一个对象都是通过构造方法创建出来的
    2.枚举项在底层其实就是常量，默认用public static final修饰
    3.枚举类的第一行上必须是枚举项，枚举项之间用逗号隔开，以分号作为结尾
    4.枚举类的构造方法必须是private修饰，不让外界创建本类的对象
    5．编译器会给枚举类新增两个默认存在的方法：values()，valueOf()


    values（）：表示获取本类所有的枚举项
    valueOf（）：表示获取一个指定的枚举项OrderState.
    */
    public static void main(String[] args){
        //两个方法调用
        OrderStatus2[] values = OrderStatus2.values();
        //输出
        for (int i = 0; i < values.length; i++) {
                System.out.println(values[i]);
        }

        System.out.println("-------------------------------------------");
        //注意()里面的名字是枚举项中对象名可不是name属性名
        OrderStatus2 outForDelivery = OrderStatus2.valueOf("OUT_FOR_DELIVERY");
        //输出
        System.out.println(outForDelivery);

    }
}

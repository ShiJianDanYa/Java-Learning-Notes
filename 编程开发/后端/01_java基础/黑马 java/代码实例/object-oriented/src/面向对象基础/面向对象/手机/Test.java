package 面向对象基础.面向对象.手机;

/**
 * ClassName: Test
 * Package: 面向对象基础.面向对象.手机
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/10 - 15:48
 * @Version: v1.0
 *
 */
public class Test {
    public static void main(String[] args){
        //手机类
        MobilePhone uj = new MobilePhone();
        //属性赋值
        uj.price = 7000;
        uj.brand = "苹果";
        uj.colour = '红';

        //输出
        System.out.println("品牌:"+uj.brand);
        System.out.println("颜色:"+uj.colour);
        System.out.println("价格:"+uj.price);

    }
}

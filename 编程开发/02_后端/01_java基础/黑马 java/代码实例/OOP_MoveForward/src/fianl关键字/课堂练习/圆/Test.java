package fianl关键字.课堂练习.圆;

/**
 * ClassName: Test
 * Package: fianl关键字.课堂练习.圆
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/17 - 22:24
 * @Version: v1.0
 *
 */
public class Test {
    public static void main(String[] args) {
        //创建圆对象
        circle c1 = new circle();
        //半径赋值
        c1.setRadius(6);
        //调用方法
        System.out.println("面积："+c1.area());
        System.out.println("周长："+c1.perimeter());
    }
}

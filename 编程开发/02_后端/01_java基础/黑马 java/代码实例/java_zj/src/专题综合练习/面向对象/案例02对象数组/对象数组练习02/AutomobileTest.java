package 专题综合练习.面向对象.案例02对象数组.对象数组练习02;

import java.util.Scanner;

/**
 * ClassName: AutomobileTest
 * Package: 专题综合练习.面向对象.案例02对象数组.对象数组练习02
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/811:13
 * @Version1.0
 */
/*
    定义数组存储3部汽车对象。
    汽车的属性：品牌，价格，颜色。
    创建三个汽车对象，数据通过键盘录入而来，
    并把数据存入到数组当中

*/
public class AutomobileTest {
    public static void main(String[] args) {
        Automobile[] arr = new Automobile[3];

        for (int i = 0; i < arr.length; i++) {
            //创建对象,不要在外层循环中创建对象，因为数组当中存储的是对象的地址值，
            //如果在循环里面创建对象，那么每次循环都会创建一个新的对象，
            //那么数组当中存储的就是不同的对象的地址值，
            //再循环外面创建一个对象,那么每次循环都会使用同一个对象，
            //这样，就会导致数组当中存储的是同一个对象的地址值，
            Automobile a = new Automobile();
            System.out.println("请输入第"+(i+1)+"辆车的属性");
            System.out.println("请输入品牌：");
            Scanner  sc = new Scanner(System.in);
            String brand = sc.next();
            System.out.println("请输入价格：");
            int price = sc.nextInt();
            System.out.println("请输入颜色：");
            String color = sc.next();
            //为对象属性赋值
            a.setBrand(brand);
            a.setPrice(price);
            a.setColor(color);
            //把对象放入数组
            arr[i] = a;
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Automobile a = arr[i];
            System.out.println(a.getBrand()+","+a.getPrice()+","+a.getColor());
        }
        System.out.println("程序结束");
    }
}

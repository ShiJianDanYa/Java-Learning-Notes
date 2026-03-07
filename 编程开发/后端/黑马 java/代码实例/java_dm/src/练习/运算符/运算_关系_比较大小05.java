package 练习.运算符;

import java.util.Scanner;

/**
 * ClassName: 运算_关系_比较大小05
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2722:27
 * @Version1.0
 */

/*
您和您的约会对象在餐厅里面正在约会。
键盘录入两个整数,表示你和你约会对象衣服的时髦度。
(手动录入0~10之间的整数,不能录其他)如果你的时髦程度大于你对象的时髦程度,相亲就成功,输出true。
否则输出false。

 */

public class 运算_关系_比较大小05 {
    public static void main(String[] args) {

        int a=0,b=0;
        boolean smd = false;
        //录入两整数，来表示对象时髦度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入男士的时髦度：");
        a=sc.nextInt();
        System.out.println("请输入女士的时髦度：");
        b=sc.nextInt();
        //判断
        smd = a>=b;
        //输出
        System.out.println(smd);
    }
}

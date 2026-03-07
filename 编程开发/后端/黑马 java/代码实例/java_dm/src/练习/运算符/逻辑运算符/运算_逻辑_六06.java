package 练习.运算符.逻辑运算符;

import java.util.Scanner;

/**
 * ClassName: 运算_逻辑_六06
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2811:25
 * @Version1.0
 */
/*
数字6
在键盘输入两个整数
其中一个数为6 输出true
它们和为6的倍数 输出true
其他情况 false
其实就是判断是否满足其中一个条件即可
1. 如果两个整数其中一个数是6，则输出true。
2. 如果两个数之和是6的倍数，则输出true。
 */
public class 运算_逻辑_六06 {
    public static void main(String[] args) {
        int a = 0,b = 0,c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        b = sc.nextInt();
        c = a+b;
        /*
        判断以下三个条件是否至少满足一个：
            1.第一个整数 a 是否等于 6。
            2.第二个整数 b 是否等于 6。
            3.两个整数之和 c 是否能被 6 整除。
        最终输出结果为布尔值（true 或 false）。
         */
        System.out.println(a == 6|| b == 6 || c % 6 == 0);

    }
}

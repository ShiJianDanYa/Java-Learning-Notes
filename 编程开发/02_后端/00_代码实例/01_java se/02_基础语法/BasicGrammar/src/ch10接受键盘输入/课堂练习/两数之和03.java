package ch10接受键盘输入.课堂练习;

/**
 * ClassName: 变量_两数之和03
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2717:05
 * @Version1.0
 */
/*
    从键盘接受输入，为两个整数
    然后输出两数之和

 */

import java.util.Scanner;

public class 两数之和03 {
    public static void main(String[] args) {
        /*需求：键盘录入两个整数，求出他们的和并打印出来。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请为数据赋值1，只能为整数");
        int i = sc.nextInt();
        System.out.println("数据1的值为"+i);
        System.out.println("请为数据赋值2，只能为整数");
        int o = sc.nextInt();
        System.out.println("数据2的值为"+o);
        int p = i+o;
        System.out.println("数据1和2的和为"+p);
        //关闭Scanner
        sc.close();
    }
}

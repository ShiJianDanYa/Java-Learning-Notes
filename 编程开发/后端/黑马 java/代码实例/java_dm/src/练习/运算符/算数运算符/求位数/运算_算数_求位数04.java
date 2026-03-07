package 练习.运算符.算数运算符.求位数;

import java.util.Scanner;

/**
 * ClassName: 运算_算数_求位数04
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2720:05
 * @Version1.0
 */

//求123百 十 个 位数

public class 运算_算数_求位数04 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个最高百位整数：");
        num = sc.nextInt();
        //num/100 得到百位数
        int num1 = num/100;
        //num/10 得到百位与十位数
        int num2 = num/10%10;
        //num%10 得到个位数
        int num3 = num%10;
        System.out.println("百位数为："+num1);
        System.out.println("十位数为："+num2);
        System.out.println("个位数为："+num3);

    }
}

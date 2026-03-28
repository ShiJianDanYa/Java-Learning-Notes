package 练习.流程.循环;

import java.util.Scanner;

/**
 * ClassName: 流程_循环_求商余20
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2920:32
 * @Version1.0
 */

/* 需求如下
    给定两个整数，求出商和余数。
    输入两个整数，分别为被除数和除数。
    输出商和余数，用空格隔开。
    要求不使用乘法，除法和模运算符。
 */
public class 流程_循环_求商余20 {
    public static void main(String[] args) {
        //先从键盘获取两数
        int num1 = 0,num2 = 0,cs=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数：");
        num1 = sc.nextInt();
        sum = num1;
        System.out.println("请输入除数：");
        num2 = sc.nextInt();

        //开始运算
        //num1 = 10, num2 = 3
        //结束条件 被除数 小于除数
        while(num1 >= num2){
            //被除数-除数 次数就是商
            num1 -= num2;
            cs++;
        }
        int ys =sum-(num2*cs);

        System.out.println("商为："+cs+"余数为："+ys);


        System.out.println("程序结束");
    }
}

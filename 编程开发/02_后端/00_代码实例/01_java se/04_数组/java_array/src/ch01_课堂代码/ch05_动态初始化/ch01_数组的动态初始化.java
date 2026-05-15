package ch01_课堂代码.ch05_动态初始化;

import java.util.Scanner;

/**
 * ClassName: Dynamic_initialization
 * Package: 数组的练习.动态初始化
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/2 - 16:57
 * @Version: v1.0
 *
 */
public class ch01_数组的动态初始化 {
    public static void main(String[] args) {
        /*需求：键盘录入5个的整数，存入数组当中，并进行遍历
        * 动态初始化的格式：
        * 数据类型[] 数组名= new 数据类型[数组的长度];
        * */
        int [] ageArr = new int[5];
        System.out.println("请输入5个整数");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ageArr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个整数");
            ageArr[i] = sc.nextInt();
        }
        //一个循环只做一件事情
        //遍历数组
        for (int i = 0; i < ageArr.length; i++) {
            System.out.println(ageArr[i]);
        }
    }
}

package 课堂.数组.java11;

import java.util.Scanner;

/**
 * ClassName: 动态初始化04
 * Package: 课堂.数组.java11
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/3122:36
 * @Version1.0
 */

/*
 定义一个数组，用来存储全班50个学生成绩，
 姓名未知，报道后，在进行添加

 //格式
 课堂.数据类型[] 数组名 = new 课堂.数据类型[数组长度];
 创建时自己指定数组长度
 */
public class 动态初始化04 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入全班学生人数");
        int num = sc.nextInt();
        int[] score = new int[num];

        //为数组赋值
        score[0] = 1000;
        System.out.println("学生总人数为"+score.length);

        //不同数据类型的数组，其初始化值不同
        int[] arr = new int[5];
        String[] arr1 = new String[5];

        System.out.println(arr[2]);
        System.out.println(arr1[2]);


    }
}

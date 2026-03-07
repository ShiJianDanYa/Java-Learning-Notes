package 练习.流程.循环.回文数;

import java.util.Scanner;

/**
 * ClassName: 流程_循环_回文数19
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2918:21
 * @Version1.0
 */

/*
回文数：正读和倒读都一样的数字
给一个数字
求是否为回文数
是返回true 不是返回false
 */
public class 流程_循环_回文数19 {
    public static void main(String[] args) {
        // 初始化变量i和temp，用于存储输入的数字和临时变量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int temp = sc.nextInt();

        // 初始化num变量用于构建数字的反向形式
        int num = 0;
        // 循环直到wei小于用户输入数字的十倍，用于处理每个数字位
        //假设 为输入为123
        for(int i=10;(temp * 10) > i;i *= 10 ) {
            //wei<1230
            // 计算当前数字的个位数
            //第一次 123处于10，得12余3，3除余1，得3
            //第二次 123处于100，得1余23，23除余10得2
            //第三次 123处于1000，余123，123除余100得1
            //ge 存储从右到左的个位数
            int ge = temp % i / (i / 10);
            // 构建反向形式的数字
            //第一次 num=3
            num = num * 10 + ge;

        }
        // 输出反向后的数字
        System.out.println(num);
        // 比较反向后的数字和原始数字，判断是否为回文数
        if (num == temp) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}


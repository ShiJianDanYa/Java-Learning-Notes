package 练习.流程.循环;

import java.util.Scanner;

/**
 * ClassName: 流程_循环_平方根22
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/3111:23
 * @Version1.0
 */

/*
需求，键盘录入一个大于二的整数，计算并返回该整数的平方根
结果只保留整数部分，小数部分舍弃。
 */
public class 流程_循环_平方根22 {
    public static void main(String[] args) {
        int num = 0;
        Scanner  sc = new Scanner(System.in);
        System.out.println("请输入一个大于2的整数：");
        num = sc.nextInt();

        /*
        思路分析
        x 的平方=x*x
        所以，x可以从1，逐渐递增直到平方大于所给定得值

         */
        if(num>2)
        {
            int x = 1;
            int lf =0;

            while(lf<=num)
            {
                ++x;
                lf=x*x;
            }
            //这时求得数必然大于平方根一位，所以需要⚔️一
            System.out.println("你输入的数字的平方根是："+(x-1));

        }else{
            System.out.println("输入的整数不大于2");
        }



        System.out.println("程序结束");
    }
}

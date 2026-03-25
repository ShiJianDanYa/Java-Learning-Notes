package 练习.流程.循环.求质数;

import java.util.Scanner;

/**
 * ClassName: 流程_循环_求质数23
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/3115:16
 * @Version1.0
 */

/*
从键盘接受一个整数，判断是否为一个质数。
质数：只能被1和自身整除的数。
 */
public class 流程_循环_求质数23 {
    public static void main(String[] args) {
        int x=0,count=9;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        x = sc.nextInt();
        //开始判断
        //从2开始到x-1结束，如果结果有一个为0，则不是质数，否则是质数
        //标记思想 定义一个布尔类型
        // 他是质数，默认是true，不是质数，默认是false

        int i = 2;
        boolean flag = true;
        while(i< x){
            //傻逼了 这里只能是取模 如果是除法运算，9%3=3
             count = x%i;
             if(count == 0){
                 flag = false;
                 break;
             }
            i++;
        }
        if(flag){
            System.out.println("这个数是质数");
        }else{
            System.out.println("这个数不是质数");
        }

    }
}

package 练习.流程.双分支;

import java.util.Scanner;

/**
 * ClassName: 流程_双分支_账户余额10
 * Package: 练习
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2913:08
 * @Version1.0
 */
/*
商品付款
客户在商店中购买商品，总价600元
1. 如果付款大于600元付款，成功
2.小于600元 付款失败
 */

public class 流程_双分支_账户余额10 {
    public static void main(String[] args) {
        int money = 0;
        System.out.println("输入用户账户余额");
        //接受键盘输入
        Scanner sc = new Scanner(System.in);
        money = sc.nextInt();
        if (money >= 600) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }
    }
}

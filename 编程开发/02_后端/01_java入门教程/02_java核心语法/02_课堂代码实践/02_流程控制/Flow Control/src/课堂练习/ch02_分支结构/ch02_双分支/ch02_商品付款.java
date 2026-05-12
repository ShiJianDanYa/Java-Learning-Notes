package 课堂练习.ch02_分支结构.ch02_双分支;

import java.util.Scanner;

/**
 * ClassName: 商品付款
 * Package: 课堂练习.ch02分支结构.ch02双分支
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/21 - 13:16
 * @Version: v1.0
 *
 */
public class ch02_商品付款 {
	/*商品付款
	在实际开发中，如果要根据两种不同的情况来执行不同的代码，就需要用到if的第二种格式。
	需求:
	假设，用户在超市实际购买，商品总价为：600元。
	键盘录入一个整数表示用户实际支付的钱。
	如果付款大于等于600，表示付款成功。
	否则付款失败。*/
	public static void main(String[] args){
		//定义价格
		int price = 600;
		//键盘输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入实际付款金额");
		int pay = sc.nextInt();

		//开始判断
		if(pay>=price)System.out.println("付款成功");
		else System.out.println("付款失败");
		//手动关闭 Scanner
		sc.close();
	}
}

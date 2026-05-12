package 课堂练习.ch03_循环结构.ch02_while循环;

import java.util.Scanner;
/**
 * ClassName: ch03_位数之和
 * Package: 课堂练习.ch03_循环结构.ch02_while循环
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/25 - 12:55
 * @Version: v1.0
 *
 */
public class ch03_位数之和 {
	public static void main(String[] args){
		/*
		描述
		给定一个整数n，请计算其所有数位之和。若n为负数，请先取其绝对值。

		示例1
		输入：12
		说明：1+2=3
		输出：3

		示例2
		输入：-305
		说明：获取绝对值305，再求和3+0+5=8输出：8
		*/

		//获取用户输出数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int number = sc.nextInt();
		//变量记录位数之和
		int sum = 0;
		//获取number的绝对值
		//正数本身 负数 相反数
		if(number<0){
			number = -number;
		}
		//开始获取位数之和
		while(number>0){
			//逐级获取位数
			//%取余  102%10 = 2
			sum+=number%10;
			//逐级减位
			// /除号 102/10 = 10
			number=number/10;
		}
		//输出结果
		System.out.println(sum);
	}
}

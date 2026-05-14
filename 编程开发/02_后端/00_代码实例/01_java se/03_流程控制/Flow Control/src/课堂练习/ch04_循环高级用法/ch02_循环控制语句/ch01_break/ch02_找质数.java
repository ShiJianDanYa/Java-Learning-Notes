package 课堂练习.ch04_循环高级用法.ch02_循环控制语句.ch01_break;

import java.util.Scanner;

/**
 * ClassName: ch02_找质数
 * Package: 课堂练习.ch04_循环高级用法.ch02_循环控制语句.ch01_break
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/25 - 18:39
 * @Version: v1.0
 *
 */
public class ch02_找质数 {
	public static void main(String[] args) {
		/*
		键盘录入一个大于等于2的整数，
		判断是否为质数

		质数：只能被1和自身整除的数
		2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53
		59 61 67 71 73 79 83 89 97

		判定条件
		1~n: 2个 是质数
		2~n-1:0个 是质数
		19为例
		2~18:0个 是质数

		number = 100
		1 100
		2 50
		4 25
		5 20
		10 10
		成对出现的，其中一个数字是小于等于平方根的，另一个数字是大于等于平方根的
		<-----10--------------------------->

		我们可以得出结论,以平方根为界,只要左面有可以被整除的数字,那右面一定有其对应的数字

		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个大于等于2整数");
		//判断输出合法性
		int num;
		do {
			num = sc.nextInt();
			if(num<2) System.out.println("请输入一个大于等于2的整数");
		}while (num<2);

		//定义一个布尔类型变量,判定是否为质数
		boolean flag = true;
		for(int i=2;i<Math.sqrt(num);i++){
			if(num%i==0){
				flag = false;
				//跳出循环
				// 只要有一个可以被整除,他就不是质数,后面的数据就没有必要再判断了
				System.out.println(num+"不是质数");
				break;
			}
		}
		//判断flag
		if(flag){
			System.out.println(num+"是质数");
		}

	}
}

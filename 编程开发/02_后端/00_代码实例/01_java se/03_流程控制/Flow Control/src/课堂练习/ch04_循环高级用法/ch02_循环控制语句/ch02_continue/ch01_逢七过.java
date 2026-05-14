package 课堂练习.ch04_循环高级用法.ch02_循环控制语句.ch02_continue;

/**
 * ClassName: ch01_逢七过
 * Package: 课堂练习.ch04_循环高级用法.ch02_循环控制语句.ch02_continue
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/26 - 14:16
 * @Version: v1.0
 *
 */
public class ch01_逢七过 {
	public static void main(String[] args){
		/*
		循环打印1~100之间的数字，
		如果数字包含7
		或者是7的倍数，输出"过"

		分析
		7的倍数 就是对7进行取模 结果为0
		包含7
		个位是7 对 十取模 结果为7
		十位是7 除于10 结果为7
		*/
		for (int i = 1; i <= 100; i++) {
			if(i%7==0||i/10==7||i%10==7){
				System.out.println("过");
				continue;
			}
			System.out.println(i);
		}
		System.out.println("结束");
	}
}

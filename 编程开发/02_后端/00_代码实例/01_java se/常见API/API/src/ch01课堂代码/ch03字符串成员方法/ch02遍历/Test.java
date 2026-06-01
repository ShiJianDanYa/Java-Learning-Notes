package ch01课堂代码.ch03字符串成员方法.ch02遍历;

import java.util.Scanner;

/**
 * ClassName: TEST
 * Package: ch01课堂代码.ch03字符串成员方法.ch02遍历
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/1 - 15:26
 * @Version: v1.0
 *
 */
public class Test {
	/*public char charAt(int index)：根据索引返回字
	public int length()：返回此字符串的长度
		需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串*/
	public static void main(String[] args) {
	    // charAt
		String s = "于苦难中扎根,以坚韧铸荣光";
		//注意和数组一样也存在索引越界问题
		char c1 = s.charAt(3); //'中'
		System.out.println(c1);
		//length()
		int len = s.length();
		System.out.println(len);

		//需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String s1 = sc.next();
		//字符串遍历中循环的快速生成方式s.length().fori
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			System.out.println(c);
		}

	}
}

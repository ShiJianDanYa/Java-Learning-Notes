package ch03作业.ch02统计字符出现次数;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: ch03作业.ch02统计字符出现次数
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 20:48
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*
		写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，
		然后输出输入字符串中该字符的出现次数。
		(不区分大小写字母)数据范围：
		1≤n≤1000
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str = sc.nextLine();
		System.out.println("请输入字符：");
		char ch = sc.next().charAt(0);
		//循环遍历统计次数
		//创建变量统计次数
		int count = 0;

		//循环遍历
		 for (int i = 0; i < str.length(); i++) {
			 char c = str.charAt(i);
			 //首先判断是否相等 转换大小写判断
			 if(c == ch || c == ((ch >= 'A' && ch <= 'Z') ? ch + 32 : ch - 32)){
				 count++;
			 }

		 }
		//输出次数
		System.out.println(count);
	}
}

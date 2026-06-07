package ch03作业.ch05字符转换;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: ch03作业.ch05字符转换
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/3 - 11:33
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*将一个字符串中所有的整数前后加上符号“*”，其他字符保持不变。
		连续的数字视为一个整数。数据范围：字符串长度满足
		1≤n≤100
		输入描述：
		输入一个字符串
		输出描述：
		字符中所有出现的数字前后加上符号“*”，其他字符保持不变*/
		//接收用户输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = sc.nextLine();
		//拼接字符对象
		StringBuilder result = new StringBuilder();
		int i = 0;
		//循环遍历字符串
		while (i < str.length()) {
			//获取当前字符
			char c = str.charAt(i);
			//判断当前字符是否是数字
			if (c >= '0' && c <= '9') {
				//是数字 添加前缀 *
				result.append('*');
				//遍历后面字符是否为数字
				//i < str.length() 防止数组越界
				//str.charAt(i) >= '0' && str.charAt(i) <= '9'  判断当前字符是否为数字
				//将连续的数字作为一个整体处理，直到遇到非数字或字符串结束
				while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
					result.append(str.charAt(i));
					// 继续下个字符
					i++;
				}
				// 添加后缀 *
				result.append('*');
			} else {
				//不是数字 直接添加
				result.append(c);
				// 继续下一次循环
				i++;
			}
		}
		System.out.println(result.toString());
	}
}

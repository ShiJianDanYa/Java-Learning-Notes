package ch02课堂练习.ch04_StringBuilder.ch04打乱字符串;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: Test
 * Package: ch02课堂练习.ch04_StringBuilder.ch04打乱字符串
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 15:40
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*定义一个任意的字符串，打乱里面的内容*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入任意字符串：");
		String str = sc.next();
		//字符转换为字符数组
		char[] chs = str.toCharArray();
		//循环遍历指定长度的字符串
		Random rd = new Random();
		for(int i = 0;i < str.length();i++){
			int index = rd.nextInt(str.length());
			//开始交换
			//定义一个临时变量
			char temp = chs[i];
			chs[i] = chs[index];
			chs[index] = temp;
		}
		//变为字符
		String newStr = new String(chs);
		System.out.println(newStr);
	}
}

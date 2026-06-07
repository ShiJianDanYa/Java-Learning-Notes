package ch02课堂练习.ch04_StringBuilder.ch03字符串分离;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: ch02课堂练习.ch04_StringBuilder.ch03字符串分离
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 10:58
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*
		键盘录入任意字符串，请按长度为8拆分
		每个输入字符串并进行输出长度
		不是8整数倍的字符串请在后面补数字
		0空字符串不处理。
		举例:
		输入：abcdabcda
		输出：第一行：abcdabcd
			  第二行：a0000000
			  */
		//接收用户输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String str = sc.next();
		//得到长度
		int len = str.length();
		//循环截取能够=8的字符串
		while(true){
			if(len <= 8){
				//补0
				for(int i = str.length();i<8;i++) {str += "0";}
				System.out.println(str);
				break;
			}else{
				//截取 8个
				System.out.println(str.substring(0,8));
				//截取后的长度
				str = str.substring(8);
				//截取后的长度
				len = str.length();
			}
		}
	}


}

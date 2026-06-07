package ch02课堂练习.ch03_字符串成员方法.ch02遍历.ch01统计字符次数;

import java.util.Scanner;

/**
 * ClassName: CharacterCount
 * Package: ch02课堂练习.ch03字符串成员方法.ch02遍历.ch01统计字符次数
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/1 - 15:40
 * @Version: v1.0
 *
 */
public class CharacterCount {
	/*键盘录入一个字符串，
	统计该字符串中大写字母字符，
	小写字母字符，
	数字字符出现的次数（不考虑其他字符）*/
	static void main(String[] args) {
		//接收键盘输入的字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = sc.next();
		int capitalLetters = 0;//大写
		int lowercase = 0;     //小写
		int number = 0;        //数字

		 for (int i = 0; i <str.length() ; i++) {
			 char c = str.charAt(i);
			if(c >= 'A' && c <= 'Z'){
				capitalLetters++;
			}else if(c >= 'a' && c <= 'z'){
				lowercase++;
			}else if(c>='0'&&c<='9'){
				number++;
			}else {
			}
		}
		System.out.println("大写字母的个数为"+capitalLetters+
			"小写字母的个数为"+lowercase+
			"数字的个数为"+number);

	}
}

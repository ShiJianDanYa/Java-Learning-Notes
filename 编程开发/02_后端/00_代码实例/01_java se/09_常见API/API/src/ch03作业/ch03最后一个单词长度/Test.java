package ch03作业.ch03最后一个单词长度;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: ch03作业.ch03最后一个单词长度
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/3 - 10:48
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*给你一个字符串s，由若干单词组成，
		单词前后用一些空格字符隔开。
		返回字符串中最后一个单词的长度。
		单词是指仅由字母组成、不包含任何空格字符的最大子字符串。*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		//变量计算长度
		int word = 0;
		//从后往前找空格
		for (int length = s.length(); length > 0; length--) {
			if(s.charAt(length-1) == ' '){
				break;
			}
			word++;
		}
		System.out.println("最后一个单词的长度是：" + word);
	}
}

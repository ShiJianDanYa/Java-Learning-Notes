package ch02课堂练习.ch04_StringBuilder.ch03字符串分离;

import java.util.Scanner;

/**
 * ClassName: StandardSolution_01
 * Package: ch02课堂练习.ch04_StringBuilder.ch03字符串分离
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 14:57
 * @Version: v1.0
 *
 */
public class StandardSolution_01 {
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
		//2.遍历字符串，每8个字符打印一行
		for(int i = 0;i < str.length();i++){
			//获取字符串里面的每一个字符
			char c = str.charAt(i);
			//打印字符，不换行
			System.out.print(c);
			//判断，打印8次，才进行换行
			//为了避免第一个i=0时,
			// 0%8=0,第一个就自动换行,
			// 所以i+1
			if((i+1)% 8 == 0){
				//换行
				System.out.println();
			}
		}
		//后面补零
		int lastLineCount = str.length() % 8;
		//判断是否需要补零
		if(lastLineCount != 0){
			//在最后一行补多少个0
			int count = 8 - lastLineCount;
			//循环打印
			for (int i = 0;i < count;i++) {
				System.out.print("0");
			}
		}
	}
}

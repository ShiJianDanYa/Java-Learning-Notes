package ch02课堂练习.ch04_StringBuilder.ch03字符串分离;

import java.util.Scanner;

/**
 * ClassName: StandardSolution_02
 * Package: ch02课堂练习.ch04_StringBuilder.ch03字符串分离
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 15:28
 * @Version: v1.0
 *
 */
public class StandardSolution_02 {
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
		//先补零
		//计算最后一行有多少个字符
		int lastLineCount = str.length() % 8;
		//计算最后一行补多少个0
		int count = 8 - lastLineCount;
		//补0零
		if(count != 0){
			// 获取最后一行补的0
			String line = "00000000".substring(0, count);
			// 把最后一行补的0拼接到字符串的后面
			str = str + line;
		}
		//循环截取
		//每8个打印一行
		//截取是包头不包尾
		//第一次是 0~8 截取的就是 0~7
		//第二次是 8~16 截取的就是 8~15
		for(int i = 0;i < str.length();i+=8){
			//每8个截取
			System.out.println(str.substring(i,i+8));
		}
	}
}

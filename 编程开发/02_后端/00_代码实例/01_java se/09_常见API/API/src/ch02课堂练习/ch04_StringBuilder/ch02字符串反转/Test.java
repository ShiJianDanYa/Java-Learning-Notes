package ch02课堂练习.ch04_StringBuilder.ch02字符串反转;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: ch02课堂练习.ch04_StringBuilder.ch02字符串反转
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 10:40
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		/*字符串反转
		键盘录入字符串，
		将该字符串进行反转，
		当输入拜拜的时候程序停止运行例如，
		键盘录入abc，输出结果cba*/
		//创建对象

		Scanner sc = new Scanner(System.in);
		while (true) {
			StringBuilder sb = new StringBuilder();
			System.out.println("请输入字符串：");
			String str = sc.next();
			//拜拜
			if ("拜拜".equals(str)) {
				break;
			}
			//添加
			sb.append(str);
			sb.reverse();
			//转换字符
			String s = sb.toString();
			System.out.println(s);

		}
	}
}

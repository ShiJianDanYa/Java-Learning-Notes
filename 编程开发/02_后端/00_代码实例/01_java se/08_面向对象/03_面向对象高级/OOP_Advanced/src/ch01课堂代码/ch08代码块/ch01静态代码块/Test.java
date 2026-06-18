package ch01课堂代码.ch08代码块.ch01静态代码块;

import ch02课堂练习.ch02this和super关键字.ch01同学.Schoolmate;

import java.util.Arrays;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch08代码块.ch01静态代码块
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/18 - 18:39
 * @Version: v1.0
 *
 */
public class Test {
	public static String  schoolName;
	public static String[] cards = new String[54];
	//静态代码块：有static修饰，属于类，与类一起优先加载，自动执行一次
	//基本作用：可以完成对类的静态资源的初始化
	static{
		System.out.println("=======静态代码块执行了=======");
		schoolName = "黑马程序员";
		cards[0] = "A";
		cards[1] = "B";
		cards[2] = "C";
	}
	static void main(String[] args) {
		//目标 :认识代码块,搞清楚代码块的基本作用
		System.out.println("=======main方法执行=======");
		System.out.println(schoolName);
		System.out.println(Arrays.toString(cards));
	}
}

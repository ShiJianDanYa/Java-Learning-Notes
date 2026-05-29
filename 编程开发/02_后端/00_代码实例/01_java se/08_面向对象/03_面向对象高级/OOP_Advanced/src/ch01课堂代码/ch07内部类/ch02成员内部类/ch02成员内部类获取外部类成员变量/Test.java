package ch01课堂代码.ch07内部类.ch02成员内部类.ch02成员内部类获取外部类成员变量;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch07内部类.ch02成员内部类.ch02成员内部类获取外部类成员变量
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/29 - 07:23
 * @Version: v1.0
 *
 */
public class Test {
	public static void main(String[] args){
		Outer.Inner li = new Outer().new Inner();
		li.show();

		Scanner sc = new Scanner(System.in);
		sc.next();
	}
}

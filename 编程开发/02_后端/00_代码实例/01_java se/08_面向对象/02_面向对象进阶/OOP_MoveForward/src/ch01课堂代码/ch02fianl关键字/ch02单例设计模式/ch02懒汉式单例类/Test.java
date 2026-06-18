package ch01课堂代码.ch02fianl关键字.ch02单例设计模式.ch02懒汉式单例类;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch02fianl关键字.ch02单例设计模式.ch02懒汉式单例类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/17 - 21:34
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		B b1 = B. getobject();
		B b2 = B. getobject();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1 == b2);
	}
}

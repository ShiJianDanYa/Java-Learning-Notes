package ch01课堂代码.ch07内部类.ch03静态内部类;

/**
 * ClassName: Outer
 * Package: ch01课堂代码.ch07内部类.ch03静态内部类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/29 - 09:24
 * @Version: v1.0
 *
 */
public class Outer {
	int a = 10;
	static int b = 20;
	//静态内部类
	static class Inner{
		public void show1(){
			System.out.println("非静态方法被调用了");
		}
		public static void show2(){
			System.out.println("静态方法被调用了");
		}
	}
}

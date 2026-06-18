package ch01课堂代码.ch02fianl关键字.ch02单例设计模式.ch01饱汉式单例类;

/**
 * ClassName: A
 * Package: ch01课堂代码.ch02fianl关键字.ch02单例设计模式
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/17 - 20:34
 * @Version: v1.0
 *
 */
public class A {
	//设计成单例设计模式
	//2. 定义一个静态变量，用于基本本类的一个唯一对象。
	//为什么是私有修饰
	// 如果 是共有修饰
	// 那 通过类名调用 = null 这种情况怎么办?
	private static A a = new A();
	//1. 私有化构造器 确保单例类对外不能创建太多对象，单例才有可能性。
	private A() {
	}
	//3、提供一个公开的静态方法，返回这个类的唯一对象。
	public static A getInstance() {
		return a;
	}
}

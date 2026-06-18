package ch01课堂代码.ch02fianl关键字.ch02单例设计模式.ch01饱汉式单例类;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch02fianl关键字.ch02单例设计模式
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/17 - 20:33
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		//设计单例类
		A a = A.getInstance();
		A a1 = A.getInstance();
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a == a1);
	}
}

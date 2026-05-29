package ch01课堂代码.ch07内部类.ch04局部内部类;

/**
 * ClassName: Outer
 * Package: ch01课堂代码.ch07内部类.ch04局部内部类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/29 - 09:56
 * @Version: v1.0
 *
 */
public class Outer {
	int b = 20;
	public void show(){
		int a = 10;
		//局部内部类
		class Inner{
			String name;
			int age;
			public void method1() {
				System.out.println(a);
				System.out.println(b);
				System.out.println("局部内部类中的method1方法");
			}
			public static void method2() {
				System.out.println("局部内部类中的method2静态方法");
			}
		}
		//局部内部类对象
		Inner i = new Inner();
		System.out.println(i.name);
		System.out.println(i.age);
		i.method1();
		Inner.method2();
	}
}

package ch01课堂代码.ch07内部类.ch03静态内部类;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch07内部类.ch03静态内部类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/29 - 09:23
 * @Version: v1.0
 *
 */
public class Test {
	public static void main(String[] args){
		//注意事项：
		//1.静态内部类也是成员内部类中的一种
		//2.静态内部类只能访问外部类中的静态变量和静态方法，
		//如果想要访问非静态的需要创建外部类对象。

		//创建静态内部类对象的格式：
		// 外部类名.内部类名对象名 = new 外部类名.内部类名（）;
		// 只要是静态的东西，都可以用类名点直接获取
		Outer.Inner oi = new Outer.Inner();
		//调用非静态方法
		 oi.show1();
		//调用静态方法的格式：
		//外部类名.内部类名.方法名（）;
		Outer.Inner.show2();
		//通过对象名也可以调用静态方法
		 oi.show2();  //但是我们不提倡
	}
}

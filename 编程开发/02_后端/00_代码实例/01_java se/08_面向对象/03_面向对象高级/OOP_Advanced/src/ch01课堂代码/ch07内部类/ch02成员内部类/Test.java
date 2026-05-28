package ch01课堂代码.ch07内部类.ch02成员内部类;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch07内部类.ch02成员内部类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 18:30
 * @Version: v1.0
 *
 */
public class Test {
	public static void main(String[] args){
		/*
		编写成员内部类的注意点：
		1.成员内部类可以被一些修饰符所修饰，比如：private，默认，protected，public，static等
		2.在成员内部类里面，JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量。

		获取成员内部类对象的两种方式：
		方式一：外部类编写方法，对外提供内部类对象
		方式二：直接创建
		格式：外部类名.内部类名对象名=外部类对象.内部类对象;
		范例:Outer.Inner oi = new Outer().new Inner();
		*/
		//获取成员内部类对象的方式
		//Outer.Inner oi = new Outer().new Inner();

		Outer o = new Outer();
		//报错因为 Inner类私有,无法访问,自然不会知道此类型
		//Outer.Inner inner= o.getInstance();
		//第一种利用父类 多态接收
		Object  inner= o.getInstance();
		//第二种直接使用即可
		System.out.println(o.getInstance());
	}
}

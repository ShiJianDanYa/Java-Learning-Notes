package ch01课堂代码.ch07内部类.ch04局部内部类;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch07内部类.ch04局部内部类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/29 - 09:56
 * @Version: v1.0
 *
 */
public class Test {
	/*
	局部内部类
	1.将内部类定义在方法里面就叫做局部内部类，类似于方法里面的局部变量。
	2.外界是无法直接使用局部内部类，需要在方法内部创建对象并使用。
	3.该类可以直接访问外部类的成员，也可以访问方法内的局部变量。
	*/
	public static void main(String[] args){
		//无法直接使用show方法里面的局部变量a
		Outer o = new Outer();
		//o.a;    这种方式调用的成员a 不是局部 a

		//调用show方法，让代码执行
		o.show();

	}
}

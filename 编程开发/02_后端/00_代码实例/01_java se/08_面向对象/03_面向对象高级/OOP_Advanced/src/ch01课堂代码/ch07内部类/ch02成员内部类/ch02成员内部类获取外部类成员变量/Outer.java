package ch01课堂代码.ch07内部类.ch02成员内部类.ch02成员内部类获取外部类成员变量;

/**
 * ClassName: Outer
 * Package: ch01课堂代码.ch07内部类.ch02成员内部类.ch02成员内部类获取外部类成员变量
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/29 - 07:21
 * @Version: v1.0
 *
 */
public class Outer {
	private int a = 10;

	class Inner{
		private int a = 20;

		public void show(){
			int a = 30;
			System.out.println(a);  //30
			System.out.println(this.a);  //20
			//Outer.this获取了外部类对象的地址值
			System.out.println(Outer.this.a);  //10
		}
	}
}

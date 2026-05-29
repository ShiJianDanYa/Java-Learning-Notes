package ch01课堂代码.ch07内部类.ch02成员内部类.ch01创建内部类对象;

/**
 * ClassName: Outer
 * Package: ch01课堂代码.ch07内部类.ch02成员内部类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 18:43
 * @Version: v1.0
 *
 */
public class Outer {

	private class Inner{
		//定义静态变量
		static int a = 10;
	}

	//外部类 直接提供获取方法即可
	public Inner getInstance(){
		return new Inner();
	}

}

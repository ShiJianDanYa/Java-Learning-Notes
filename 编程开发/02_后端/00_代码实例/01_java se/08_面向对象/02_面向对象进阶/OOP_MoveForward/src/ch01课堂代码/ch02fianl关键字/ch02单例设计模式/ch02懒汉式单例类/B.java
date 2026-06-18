package ch01课堂代码.ch02fianl关键字.ch02单例设计模式.ch02懒汉式单例类;

/**
 * ClassName: B
 * Package: ch01课堂代码.ch02fianl关键字.ch02单例设计模式.ch02懒汉式单例类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/17 - 21:34
 * @Version: v1.0
 *
 */
//懒汉式单例类。
public class B {
	//私有化静态变量
	private static B b ;  //null
	//1、单例必须私有构造器
	private B( ){
	}
	//3、提供一个类方法返回类的一个对象 真正需要对象的时候才开始创建对象
	public static B getobject(){
		if(b == null){
			//第一次拿对象时，会创建对象，给静态变量b记住。
			b= new B();
		}
		return b;
	}
}

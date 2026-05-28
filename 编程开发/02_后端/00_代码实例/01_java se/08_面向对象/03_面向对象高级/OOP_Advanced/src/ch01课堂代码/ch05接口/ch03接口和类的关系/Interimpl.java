package ch01课堂代码.ch05接口.ch03接口和类的关系;

/**
 * ClassName: Interimpl
 * Package: ch01课堂代码.ch05接口.ch03接口和类的关系
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 07:49
 * @Version: v1.0
 *
 */
//继承必须在接口的前面
public class Interimpl extends Person implements Inter1,Inter2{
	//如果一个类实现了多个接口，那么就要重写多个接口中所有的抽象方法
	//注意点：
	//  1.如果父类Person也是一个抽象类的话，那么在子类当中，需要把所有的抽象方法进行重写,要么子类本身也是一个抽象类
	//  2.如果在重写的时候出现了重复的抽象方法，此时我们只要重写一次就可以了

	@Override
	public void aaa() {
		System.out.println("aaaaaa");
	}

	@Override
	public void method1() {

	}

	@Override
	public void method2() {

	}

	@Override
	public void bbb() {
		System.out.println("bbbbbbb");
	}

	@Override
	public void function1() {

	}

	@Override
	public void function2() {

	}
}

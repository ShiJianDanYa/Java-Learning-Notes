package ch01课堂代码.ch05接口.ch03接口和类的关系;

/**
 * ClassName: MyInterImpl
 * Package: ch01课堂代码.ch05接口.ch03接口和类的关系
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 08:16
 * @Version: v1.0
 *
 */
public class MyInterImpl implements MyInter{
	/*
	接口与接口之间
	继承关系，可以单继承，也可以多继承
	注意点：
		1.如果有一个接口A继承了多个接口，此时相当于是把多个接口中的抽象方法全部继承下来了
	在以后，实现类实现接口A的时候，就要把所有的抽象方法进行重写*/
	@Override
	public void method1() {

	}

	@Override
	public void method2() {

	}

	@Override
	public void function1() {

	}

	@Override
	public void function2() {

	}

	@Override
	public void bbb() {

	}
}

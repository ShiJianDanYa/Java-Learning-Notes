package ch01课堂代码.ch05接口.ch01动物;

/**
 * ClassName: Dog
 * Package: ch01课堂代码.ch05接口.ch01动物
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 20:55
 * @Version: v1.0
 *
 */
public class Dog extends animal implements Swim{
	//构造方法

	public Dog() {
	}

	public Dog(String name, String color) {
		super(name, color);
	}

	@Override
	public void eat() {
		System.out.println("狗吃🦴");
	}


	@Override
	public void swim() {
		System.out.println("游泳");
	}
}

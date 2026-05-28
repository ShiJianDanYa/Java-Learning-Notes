package ch01课堂代码.ch04抽象类和抽象方法.ch01猫狗;

/**
 * ClassName: Dog
 * Package: ch01课堂代码.ch04抽象类和抽象方法.ch01猫狗
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 18:37
 * @Version: v1.0
 *
 */
public class Dog extends Animal {
	/*狗类:
	行为：狗吃骨头，狗看家*/
	//构造方法
	public Dog() {}

	public Dog(String name, String color) {
		super(name, color);
	}

	@Override
	public void eat() {
		System.out.println("狗吃骨头");
	}
	public void lookHome() {
		System.out.println("狗看家");
	}


}

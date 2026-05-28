package ch01课堂代码.ch04抽象类和抽象方法.ch02注意事项;

/**
 * ClassName: Cat
 * Package: ch01课堂代码.ch04抽象类和抽象方法.ch01猫狗
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 18:29
 * @Version: v1.0
 *
 */
public class Cat extends Animal {
	/*行为：猫吃鱼，猫抓老鼠*/
	//构造方法
	public Cat() {}

	public Cat(String name, String color) {
		super(name, color);
	}

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
	public void catchMouse(){
		System.out.println("猫抓老鼠");
	}
}

package ch01课堂代码.ch04抽象类和抽象方法.ch01猫狗;

import ch03课外作业.ch02多态.ch03饲养动物.animal;
import ch03课外作业.ch02多态.ch03饲养动物.cat;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch04抽象类和抽象方法.ch01猫狗
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 16:51
 * @Version: v1.0
 *
 */
public class Test {
	/*
	注意点 1：抽象类不能实例化
	注意点 2：抽象类中不一定有抽象方法，有抽象方
	注意点 3：抽象类中可以有构造方法
	注意点 4：抽象类的子类
				要么重写抽象类中的所有抽象方法
				要么子类也是抽象类
	*/
	public static void main(String[] args) {
		//创建猫对象
		Cat c = new Cat("咪咪","白色");
		//创建狗对象
		Dog d = new Dog("小黄","黑色");
		System.out.println("猫的名字是："+c.getName()+"，颜色是："+c.getColor());
		c.eat();
		c.catchMouse();
		System.out.println("狗的名字是："+d.getName()+"，颜色是："+d.getColor());
		d.eat();
		d.lookHome();
		//创建抽象类对象
		//Animal a = new Animal();
	}
}

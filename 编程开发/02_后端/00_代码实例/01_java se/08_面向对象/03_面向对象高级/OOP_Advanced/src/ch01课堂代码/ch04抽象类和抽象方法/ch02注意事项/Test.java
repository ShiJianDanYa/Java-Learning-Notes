package ch01课堂代码.ch04抽象类和抽象方法.ch02注意事项;

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
	猫类:
	属性：名字，颜色
	行为：猫吃鱼，猫抓老鼠，喝水
	狗类:
	属性：名字，颜色
	行为：狗吃骨头，狗看家，喝水
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


	}
}

package ch03课外作业.ch02多态.ch03饲养动物;

/**
 * ClassName: Test
 * Package: ch03课外作业.ch02多态.ch03饲养动物
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 16:20
 * @Version: v1.0
 *
 */
public class Test {
	/*1.定义狗类
	属性：年龄，颜色
	行为：eat(String something)(something表示吃的东西)
	看家lookHome方法(无参数)

	2.定义猫类
	属性：年龄，颜色
	行为：eat(String something)方法(something表示吃的东西)
	逮老鼠catchMouse方法(无参数)

	3.定义Person饲养员类
	属性：姓名，年龄
	行为：饲养动物keepPet(Dog dog,String something)方法

	要求:
	1.Person的饲养动物的方法需要两个参数
	第一个参数：表示饲养的动物，既能饲养猫又能饲养狗。第二个参数：是给动物喂的食物
	2.在Person的keepPet方法中调用子类的特有功能*/
	public static void main(String[] args) {
		//狗对象
		dog d = new dog(18,"黄色");
		//猫对象
		cat c = new cat(12,"黑色");

		//饲养员
		Person p = new Person("张三",18);
		p.keepPet(d,"🦴");
		p.keepPet(c,"鱼");

	}
}

package ch03课外作业.ch02多态.ch03饲养动物;

/**
 * ClassName: Person
 * Package: ch03课外作业.ch02多态.ch03饲养动物
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 16:14
 * @Version: v1.0
 *
 */
public class Person {
	/*属性：姓名，年龄
	行为：饲养动物keepPet(Dog dog,String something)方法*/

	private String name;
	private int age;
	//构造方法
	public Person() {}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//get/set

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//行为

	public void keepPet(animal am,String something){
		System.out.println(name+"饲养员"+age+"岁");
		if(am instanceof dog){
			dog d = (dog)am;
			d.eat(something);
			d.lookHome();
		}else if(am instanceof cat){
			cat c = (cat)am;
			c.eat(something);
			c.catchMouse();
		}else{
			System.out.println("请输入正确的动物");
		}
	}
}

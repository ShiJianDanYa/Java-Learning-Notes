package ch01课堂代码.ch05接口.ch03接口和类的关系;

/**
 * ClassName: Person
 * Package: ch01课堂代码.ch05接口.ch03接口和类的关系
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 07:50
 * @Version: v1.0
 *
 */
public abstract class Person {
	private String name;
	private int age;
	//构造

	public Person() {

	}

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

	public void show(){
		System.out.println("姓名："+name+"，年龄："+age);
	}
	public abstract void aaa();
}

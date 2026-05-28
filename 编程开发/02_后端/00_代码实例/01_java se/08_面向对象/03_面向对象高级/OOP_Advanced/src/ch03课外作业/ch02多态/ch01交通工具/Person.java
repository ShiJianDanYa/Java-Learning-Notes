package ch03课外作业.ch02多态.ch01交通工具;

/**
 * ClassName: Person
 * Package: ch03课外作业.ch02多态.ch01交通工具
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 14:38
 * @Version: v1.0
 *
 */
public class Person {
	/*属性：名字，年龄，性别
	行为：行驶交通工具（能使用所有交通工具）*/
	private String name;
	private int age;
	private String sex;
	//构造方法
	public Person() {}

	public Person(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	//get/set方法

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	//行为 使用交通工具
	public void useVehicle(Vehicle vehicle){
		vehicle.move();
		//调用独有方法
		//先判断
		if(vehicle instanceof Bicycle){
			Bicycle bl = (Bicycle)vehicle;
			bl.ringBell();
		}else if(vehicle instanceof Car){
			Car cl = (Car)vehicle;
			cl.honk();
		}else {
			System.out.println("没有这个交通工具");
		}
	}
}

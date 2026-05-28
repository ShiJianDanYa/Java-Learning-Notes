package ch03课外作业.ch02多态.ch02面积周长;

/**
 * ClassName: student
 * Package: ch03课外作业.ch02多态.ch02面积周长
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 15:30
 * @Version: v1.0
 *
 */
public class student {
	/*
	属性：姓名，年龄
	行为：使用图形，打印图形信息，并打印周长和面积
	*/
	private String name;
	private int age;

	//构造
	public student() {
	}

	public student(String name, int age) {
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
	public void useGraph(diagram d){
		System.out.println(name + "正在使用图形");
		System.out.println("周长: " + d.getPerimeter());
		System.out.println("面积: " + d.getArea());
		System.out.println("-------------------");
	}
}

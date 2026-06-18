package ch01课堂代码.ch07内部类.ch05匿名内部类.ch02使用场景;


/**
 * ClassName: Student
 * Package: ch01课堂代码.ch07内部类.ch05匿名内部类.ch02使用场景
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/18 - 19:47
 * @Version: v1.0
 *
 */

public class Student {
	//学生类
	//姓名 年龄 身高 性别
	private String name;
	private int age;
	private double height;
	private char sex;

	public Student() {
	}

	public Student(String name, int age, double height, char sex) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.sex = sex;
	}

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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
}

package ch01课堂代码.ch09函数式编程.ch02方法引用.ch02实例方法引用;


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

	//静态方法
	public static int compareAge(Student o1, Student o2) {
		return o1.getAge() - o2.getAge();
	}
	//实例方法
	public int compareByHeight(Student o1, Student o2) {
		//按照身高比较
		//为什么用Double.compare这个方法？
		//因为这个方法可以比较double类型的数据，返回正数、0、负数
		//直接结果强转为int类型 如果是17.2-17.1=0.1  强转为int类型会变成0
		//认为相等 你觉得相等吗?
		return Double.compare(o1.getHeight(), o2.getHeight());
	}
}

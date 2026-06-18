package ch01课堂代码.ch01继承.ch05方法重写.ch02方法重写常见应用场景;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch01继承.ch05方法重写.ch02方法重写常见应用场景
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/17 - 10:31
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		//目标：方法重写的常见应用场景：子类重写object的toString方法，以便返回对象的内容。
		Student s = new Student();
		s.setName("张三");
		s.setSex('女');
		s.setAge(25);
		//这里我们想看的是对象的所有属性全部打印出来
		System.out.println(s);
		//直接输出对象 默认会调用object的toString方法
		//s是省略写法
		//完整写法是s.toString()
		//但是输出对象的地址实际上是没有什么意义的，
		// 开发中更希望输出对象时看对象的内容信息，
		// 所以 类需要重写Object的toString方法。
		//以便以后输出对象时默认就近调用子类重写的toString方法返回对象的内容

	}
}
class Student{
	private String name;
	private char sex;
	private int age;
	//构造方法

	public Student() {
	}

	public Student(String name, char sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	//set/get方法

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//重写方法
	@Override
	public String toString() {
		return "名字: "+name+"\n 性别: "+sex+"\n年龄: "+age;
	}
}

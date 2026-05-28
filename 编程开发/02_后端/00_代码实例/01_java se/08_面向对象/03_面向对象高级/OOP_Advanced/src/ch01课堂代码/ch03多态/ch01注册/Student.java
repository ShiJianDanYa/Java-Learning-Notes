package ch01课堂代码.ch03多态.ch01注册;

/**
 * ClassName: Student
 * Package: ch01课堂代码.ch03多态.ch01注册
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 10:17
 * @Version: v1.0
 *
 */
public class Student extends Person{
	//构造方法

	public Student() {
	}

	public Student(String name, String account, int password) {
		super(name, account, password);
	}
	@Override
	public void work() {
		System.out.println("学生的工作是学习");
	}
}

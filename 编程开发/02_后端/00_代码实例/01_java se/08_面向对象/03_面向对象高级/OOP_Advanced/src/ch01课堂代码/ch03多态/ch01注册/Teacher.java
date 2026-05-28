package ch01课堂代码.ch03多态.ch01注册;

/**
 * ClassName: Teacher
 * Package: ch01课堂代码.ch03多态.ch01注册
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 10:20
 * @Version: v1.0
 *
 */
public class Teacher extends Person{
	//构造方法

	public Teacher() {
	}

	public Teacher(String name, String account, int password) {
		super(name, account, password);
	}
	@Override
	public void work() {
		System.out.println("老师的工作是教📚");
	}
}

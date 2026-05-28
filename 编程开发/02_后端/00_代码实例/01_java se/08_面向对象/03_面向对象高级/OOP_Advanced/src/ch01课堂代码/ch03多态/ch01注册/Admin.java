package ch01课堂代码.ch03多态.ch01注册;

/**
 * ClassName: Admin
 * Package: ch01课堂代码.ch03多态.ch01注册
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 10:21
 * @Version: v1.0
 *
 */
public class Admin extends Person{
	//构造方法

	public Admin() {
	}

	public Admin(String name, String account, int password) {
		super(name, account, password);
	}
	@ Override
	public void work() {
		System.out.println("管理员的工作是管理网站");
	}
}

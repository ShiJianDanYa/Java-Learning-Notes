package ch01课堂代码.ch03多态.ch01注册;

/**
 * ClassName: Person
 * Package: ch01课堂代码.ch03多态.ch01注册
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 10:12
 * @Version: v1.0
 *
 */
public class Person {
	//属性
	private String name;
	private String account;
	private int password;
	//构造方法
	public Person() {
	}

	public Person(String name, String account, int password) {
		this.name = name;
		this.account = account;
		this.password = password;
	}
	//get/set方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	//行为
	public void work() {
		System.out.println("工作");
	}
}

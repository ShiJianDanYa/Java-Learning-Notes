package ch02课堂练习.ch05接口.ch01教练运动员;

/**
 * ClassName: Hoopster
 * Package: ch02课堂练习.ch05接口.ch01教练运动员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 10:54
 * @Version: v1.0
 *
 */
public class Hoopster extends Athletes{
	//构造
	public Hoopster() {}

	public Hoopster(String name, int age) {
		super(name, age);
	}
	//行为
	public void playHoop() {
		System.out.println("姓名"+getName()+"年龄"+getAge());
		study();
	}

	@Override
	public void study() {
		System.out.println("篮球运动员学习打篮球");
	}
}

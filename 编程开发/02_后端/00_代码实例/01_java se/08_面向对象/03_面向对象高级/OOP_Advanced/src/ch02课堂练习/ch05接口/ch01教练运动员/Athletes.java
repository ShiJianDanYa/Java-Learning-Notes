package ch02课堂练习.ch05接口.ch01教练运动员;

/**
 * ClassName: athletes
 * Package: ch02课堂练习.ch05接口.ch01教练运动员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 10:46
 * @Version: v1.0
 *
 */
public abstract class Athletes extends Person{
	//构造方法
	public Athletes() {}

	public Athletes(String name, int age) {
		super(name, age);
	}
	//抽象方法 学习
	public abstract void study();

}

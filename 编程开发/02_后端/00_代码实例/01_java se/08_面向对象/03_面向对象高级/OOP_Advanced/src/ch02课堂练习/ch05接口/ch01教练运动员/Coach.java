package ch02课堂练习.ch05接口.ch01教练运动员;

/**
 * ClassName: Coach
 * Package: ch02课堂练习.ch05接口.ch01教练运动员
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 10:49
 * @Version: v1.0
 *
 */
public abstract class Coach extends Person{
	//构造方法
	public Coach() {}

	public Coach(String name, int age) {
		super(name, age);
	}
	//方法
	public abstract void teaching();
}

package ch03课外作业.ch02多态.ch03饲养动物;

/**
 * ClassName: animal
 * Package: ch03课外作业.ch02多态.ch03饲养动物
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 15:51
 * @Version: v1.0
 *
 */
public class animal {
	/*属性：年龄，颜色
	行为：eat(Stringsomething)(something表示吃的东西)*/
	//属性
	private int age;
	private String color;
	//构造方法
	public animal() {
	}

	public animal(int age, String color) {
		this.age = age;
		this.color = color;
	}
	//get/set

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//行为
	public void eat(String something){
		System.out.println("吃"+something);
	}
}

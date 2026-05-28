package ch01课堂代码.ch05接口.ch01动物;

/**
 * ClassName: animal
 * Package: ch01课堂代码.ch05接口.ch01动物
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 20:52
 * @Version: v1.0
 *
 */
public abstract class animal {
	/*
	属性：名字，颜色
	行为：进食
	*/
	//属性
	private String name;
	private String color;
	//构造方法
	public animal() {}

	public animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
	//get/set

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//行为
	public abstract void eat();
}

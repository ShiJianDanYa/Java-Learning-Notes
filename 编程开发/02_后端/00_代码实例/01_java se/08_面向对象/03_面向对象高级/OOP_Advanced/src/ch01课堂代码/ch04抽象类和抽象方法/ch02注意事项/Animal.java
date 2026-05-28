package ch01课堂代码.ch04抽象类和抽象方法.ch02注意事项;

/**
 * ClassName: Animal
 * Package: ch01课堂代码.ch04抽象类和抽象方法.ch01猫狗
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 16:53
 * @Version: v1.0
 *
 */
public abstract class Animal {
	/*
	Animal类（抽象类）：属性：名字，颜色
	行为：eat()抽象方法，喝水
	*/
	//属性
	private String name;
	private String color;
	//构造方法
	public Animal() {}

	public Animal(String name, String color) {
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
	//抽象方法
	//alt + ↩︎ 自动修复代码中的bug
	//好处1：让父类不再纠结方法体到底写什么
	//好处2：强制让子类必须要重写抽象方法，否则代码就会报错
	public abstract void eat();
	//喝水
	public void drink(){
		System.out.println("喝水");
	}

}

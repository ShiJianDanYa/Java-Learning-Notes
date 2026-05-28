package ch01课堂代码.ch05接口.ch01动物;

/**
 * ClassName: Rabbit
 * Package: ch01课堂代码.ch05接口.ch01动物
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 20:56
 * @Version: v1.0
 *
 */
public class Rabbit  extends animal{
	//构造方法
	public Rabbit() {}

	public Rabbit(String name, String color) {
		super(name, color);
	}
	//行为重写
	@Override
	public void eat() {
		System.out.println("兔子吃胡萝卜");
	}
}

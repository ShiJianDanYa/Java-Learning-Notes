package ch01课堂代码.ch05接口.ch01动物;

/**
 * ClassName: Forg
 * Package: ch01课堂代码.ch05接口.ch01动物
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 22:03
 * @Version: v1.0
 *
 */
public class Forg extends  animal implements Swim{
	//构造方法

	public Forg() {
	}

	public Forg(String name, String color) {
		super(name, color);
	}

	@Override
	public void swim() {
		System.out.println("游泳");
	}

	@Override
	public void eat() {
		System.out.println("青蛙吃虫子");
	}
}

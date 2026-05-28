package ch03课外作业.ch02多态.ch02面积周长;

/**
 * ClassName: round
 * Package: ch03课外作业.ch02多态.ch02面积周长
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 15:26
 * @Version: v1.0
 *
 */
public class round extends diagram {
	private final double pai = 3.14;
	private double radius;
	//构造

	public round() {
	}

	public round(double radius) {
		this.radius = radius;
	}
	//get/set

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	//行为
	@Override
	public double getPerimeter() {
		return 2*pai*radius;
	}
	@Override
	public double getArea() {
		return pai*radius*radius;
	}
}

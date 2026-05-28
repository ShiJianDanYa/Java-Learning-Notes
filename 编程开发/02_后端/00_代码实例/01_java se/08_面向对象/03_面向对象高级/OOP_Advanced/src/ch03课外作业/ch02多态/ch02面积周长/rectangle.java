package ch03课外作业.ch02多态.ch02面积周长;

/**
 * ClassName: rectangle
 * Package: ch03课外作业.ch02多态.ch02面积周长
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 15:25
 * @Version: v1.0
 *
 */
public class rectangle extends  diagram {
	//属性
	private double length;
	private double width;
	//构造方法
	public rectangle() {
	}
	public rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	//get/set方法

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public double getPerimeter() {
		return 2*(length+width);
	}
	@Override
	public double getArea() {
		return length*width;
	}
}

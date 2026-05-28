package ch03课外作业.ch02多态.ch01交通工具;

/**
 * ClassName: Vehicle
 * Package: ch03课外作业.ch02多态.ch01交通工具
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 14:30
 * @Version: v1.0
 *
 */
public class Vehicle {
	private String brand;
	private int maxSpeed;
	//构造方法

	public Vehicle() {
	}

	public Vehicle(String brand, int maxSpeed) {
		this.brand = brand;
		this.maxSpeed = maxSpeed;
	}
	//get/set方法

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	//行为 移动
	public void move(){
		System.out.println(brand+"品牌的交通工具,正在以"+maxSpeed+"的,最高速度移动");
	}

}

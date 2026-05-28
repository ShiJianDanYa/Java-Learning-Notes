package ch03课外作业.ch02多态.ch01交通工具;

/**
 * ClassName: Car
 * Package: ch03课外作业.ch02多态.ch01交通工具
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 14:37
 * @Version: v1.0
 *
 */
public class Car extends  Vehicle{
	/*属性：品牌，行驶速度
	行为：移动move，鸣笛honk（）*/
	//构造方法
	public Car() {
	}
	public Car(String brand, int maxSpeed) {
		super(brand, maxSpeed);
	}

	//重写方法
	@Override
	public void move(){
		System.out.println(getBrand()+"品牌的汽车正在以"+getMaxSpeed()+"的速度移动");
	}


	//独有方法
	public void honk(){
		System.out.println("汽车鸣笛");
	}
}

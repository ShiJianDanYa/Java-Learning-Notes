package ch03课外作业.ch02多态.ch01交通工具;

/**
 * ClassName: Bicycle
 * Package: ch03课外作业.ch02多态.ch01交通工具
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 14:36
 * @Version: v1.0
 *
 */
public class Bicycle extends  Vehicle{
	/*属性：品牌，行驶速度
	行为：移动move，响铃ringBell（）*/
	//构造方法
	public Bicycle() {
	}
	public Bicycle(String brand, int maxSpeed) {
		super(brand, maxSpeed);
	}
	//重写方法
	@Override
	public void move(){
		System.out.println(getBrand()+"自行车正在以"+getMaxSpeed()+"移动");
	}

	//独有方法响铃
	public void ringBell(){
		System.out.println("自行车响铃");
	}
}

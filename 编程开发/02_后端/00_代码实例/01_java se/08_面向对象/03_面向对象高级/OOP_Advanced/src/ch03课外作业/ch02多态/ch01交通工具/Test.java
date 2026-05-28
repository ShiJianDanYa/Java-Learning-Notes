package ch03课外作业.ch02多态.ch01交通工具;

/**
 * ClassName: Test
 * Package: ch03课外作业.ch02多态.ch01交通工具
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 14:41
 * @Version: v1.0
 *
 */
public class Test {
	public static void main(String[] args) {
		//创建汽车对象
		Vehicle V1= new Car("小米",200);
		//创建自行车对象
		Vehicle V2 = new Bicycle("上海",8);
		//人
		Person p = new Person("李四",24,"男");
		System.out.println("人的信息："+p.getName()+" "+p.getAge()+" "+p.getSex());
		//方法
		p.useVehicle(V1);
		p.useVehicle(V2);
	}
}

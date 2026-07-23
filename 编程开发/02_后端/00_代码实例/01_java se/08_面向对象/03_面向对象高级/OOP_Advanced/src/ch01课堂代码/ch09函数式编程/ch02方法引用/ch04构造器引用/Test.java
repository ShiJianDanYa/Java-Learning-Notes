package ch01课堂代码.ch09函数式编程.ch02方法引用.ch04构造器引用;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch09函数式编程.ch02方法引用.ch04构造器引用
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/19 - 21:33
 * @Version: v1.0
 *
 */
public class Test {
	static void main(String[] args) {
		//目标：理解构造器引用。
		//创建了接口的匿名内部类对象
		/*CarFactory cf = new CarFactory() {
			@Override
			public Car getCar(String name) {
				return new Car(name);
			}
		};*/
		//简化后
		//CarFactory cf = name ->new Car(name);
		//构造器引用：类名::new
		CarFactory cf =Car::new;

		Car c1 = cf.getCar("奔驰");
		System.out.println(c1);
	}
}
@FunctionalInterface
interface CarFactory{
	Car getCar(String name);  //作用根据名字创建一个汽车对象返回
}

@Data   //@Data注解可以自动生成getter setter方法 无参构造器 toString方法等
@AllArgsConstructor //有参构造器 有了有参的无参自动取消
@NoArgsConstructor //无参构造器 所以又需要手动添加无参构造器
class Car{
	private String name;
}

package ch01课堂代码.ch09函数式编程.ch01Lambda;

/**
 * ClassName: LambdaDemo1
 * Package: ch01课堂代码.ch09函数式编程
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/19 - 08:38
 * @Version: v1.0
 *
 */
public class LambdaDemo1 {
	static void main(String[] args) {
		//目标：认识Lambda表达式：搞清楚其基本作用。
		Animal a = new Animal() {
			@Override
			public void cry() {
				System.out.println("🐱是喵喵喵");
			}
		};
		a.cry();
		//Lambda并不是可以简化全部的匿名内部类，Lambda只能简化函数式接口的匿名内部类。
		//错误示范
	/*	Animal a1 = () ->{
			System.out.println("🐱是喵喵喵");
		};
		a1.cry();*/
		/*Swim s1 = new Swim() {
			@Override
			public void swimmming() {
				System.out.println("学生游泳~");
			}
		};*/
		//Lambda只能简化函数式接口的匿名内部类。
		Swim s1 = () ->{
			System.out.println("学生游泳~");
		};
	  s1.swimmming();
	}
}

	abstract class Animal{
		public abstract void cry();
	}
	//函数式接口:只有一个抽象方法的接口
@FunctionalInterface // 声明函数式接口的注解。
	interface Swim{
		void swimmming();
	}


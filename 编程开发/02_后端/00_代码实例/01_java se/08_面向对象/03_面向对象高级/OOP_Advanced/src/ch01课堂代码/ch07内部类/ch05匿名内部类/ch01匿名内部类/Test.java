package ch01课堂代码.ch07内部类.ch05匿名内部类.ch01匿名内部类;
/**
 * ClassName: Test
 * Package: ch01课堂代码.ch07内部类.ch05匿名内部类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/29 - 11:15
 * @Version: v1.0
 *
 */
public class Test {
	public static void main(String[] args){
		//要求：在测试类中调用下面的goSwimming方法
		//传统方式调用goSwimming方法：
		//1.新建java文件，在文件当中新建Student类（实现，重写方法）
		//2.创建学生的对象
		Student s = new Student();
		//3.调用
		goSwimming(s);

		/*问题
		如果Student类我只要用到一次，那么这个java文件单独新建有点浪费
		我是否可以不新建这个java文件，只要里面的代码呢？
		匿名内部类的作用：少定义一个java文件

		匿名内部类的定义格式:
			new类名/接口名(){
				重写类/接口里面的方法;
			}
		匿名内部类的定义格式 = 没有名字的java类 + 继承/实现 + 重写方法 + 创建对象
		最终格式可以理解为：是一个没有名字的java类的对象


		没有名字的java类：大括号{...}
		Swim：就是这个没有名字的java类实现了swim接口
		重写方法：我们要在大括号当中重写swim所有的抽象方法
		创建对象：new关键字作用的是后面这个合格没有名字的java类，创建了他的对象


		整体：创建了一个Swim实现类的对象，只不过这个类没有名字而已
		 */
		// 多态
		Swim ss = new Student();
		//多态
		//第一种方式
		goSwimming(new Swim() {
			@Override
			public void swim() {
				System.out.println("学生在红海游泳");
			}
		});
		//第二种方式
		Swim s1 = new Swim() {
			@Override
			public void swim() {
				System.out.println("学生在蓝海游泳");
			}
		};
		goSwimming(s1);
	}
	//调用这个方法的时候，需要传递Swim这个接口的实现类对象
	public static void goSwimming(Swim s){
		s.swim();
	}
}

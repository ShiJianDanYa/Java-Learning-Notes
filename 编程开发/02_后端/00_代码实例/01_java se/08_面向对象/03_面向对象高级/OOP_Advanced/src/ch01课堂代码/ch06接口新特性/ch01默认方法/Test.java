package ch01课堂代码.ch06接口新特性.ch01默认方法;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch06接口新特性
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 13:58
 * @Version: v1.0
 *
 */
public class Test {
	/*
	接口中的默认方法
		作用：为了接口升级而存在的
		格式：public default 返回值类型方法名(参数列表）{...}

		注意事项
			1.默认方法不是抽象方法,所以不强制被重写.
			但是如果被重写,重写的时候去掉default 关键字
			2.public 可以省略，default 不能省略
			3.如果实现了多个接口，多个接口中存在相同名字的默认方法，
			子类就必须对该方法进行重写
	*/
	public static void main(String[] args) {

		//创建实现类的对象
		Interlmpl li = new Interlmpl();
		li.function();

	}
}

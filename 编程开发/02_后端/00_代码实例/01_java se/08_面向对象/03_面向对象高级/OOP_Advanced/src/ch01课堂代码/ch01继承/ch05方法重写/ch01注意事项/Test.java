package ch01课堂代码.ch01继承.ch05方法重写.ch01注意事项;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch01继承.ch05方法重写.ch01注意事项
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/21 - 20:27
 * @Version: v1.0
 *
 */
public class Test {
	public static void main(String[] args) {
		//final修饰变量、修饰类、修饰方法
		//final修饰类：这个类现在就是最终类，不能被继承。
		//final修饰方法：这个方法是最终的方法，不能被子类重写
	}
}
class Fu{
	public void method(){
		System.out.println("method方法执行了");
	}
	}

class Zi extends Fu{
	@Override
	 public void method(){
		System.out.println("子类重写method方法");
	}
}

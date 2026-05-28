package ch01课堂代码.ch06接口新特性.ch02静态方法;

import ch01课堂代码.ch06接口新特性.ch01默认方法.InterA;
import ch01课堂代码.ch06接口新特性.ch01默认方法.InterB;

/**
 * ClassName: Test1
 * Package: ch01课堂代码.ch06接口新特性.ch02静态方法
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 14:31
 * @Version: v1.0
 *
 */
public class Test1 {
	/*接口中的静态方法：
		作用：为了接口升级而存在的
		格式：public static 返回值类型方法名(参数列表）{}

	注意事项：
		1.静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
		2.public可以省略，static不能省略
		*/
	public static void main(String[] args) {
		Inter.method();
		//对象
		Interlmpl li = new Interlmpl();
		li.method();

	}
}

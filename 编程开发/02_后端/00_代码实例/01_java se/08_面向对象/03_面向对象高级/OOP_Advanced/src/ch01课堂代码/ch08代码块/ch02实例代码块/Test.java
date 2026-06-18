package ch01课堂代码.ch08代码块.ch02实例代码块;

import java.util.Arrays;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch08代码块.ch02实例代码块
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/18 - 18:50
 * @Version: v1.0
 *
 */
public class Test {
	private String name;
	private String[] direction = new String[4];
	//实例代码块：无static修饰。属于对象，每次创建对象时，都会优先执行一次。
	//基本作用：初始化对象的实例资源。
	{
		System.out.println("=========实例代码块执行了=========");
		name = "it盒马";
		direction[0] = "北";
		direction[1] = "南";
		direction[2] = "西";
		direction[3] = "东";
	}
	static void main(String[] args) {
		//实例代码块
		System.out.println("=========main方法执行了=========");
		new Test();
		new Test();
		new Test();
	}
}

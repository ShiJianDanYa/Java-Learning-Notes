package ch02课堂练习.ch01继承.ch03继承中的成员变量特点;

/**
 * ClassName: Test
 * Package: ch02课堂练习.ch01继承.ch03继承中的成员变量
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/21 - 15:29
 * @Version: v1.0
 *
 */
public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.ziShow();
	}

}
class Fu {
	String name ="Fu";
	String address = "南京";
}

class Zi extends Fu {
	String name = "Zi";

	public void ziShow() {
		//要求：输出结果为zi，下的代码如何书写？
		System.out.println(name);
		System.out.println(this.name);
		//要求：输出结果为Fu，下面的代码如何书写？
		System.out.println(super.name);
		// 要求：输出结果为南京，下面的代码如何书写？
		System.out.println(address);// 南京
		System.out.println(this.address);// 南京
		System.out.println(super.address);// 南京

	}
}
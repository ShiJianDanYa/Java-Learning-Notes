package ch01课堂代码.ch01继承.ch03继承中的成员变量特点;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch01继承.ch03继承中的成员变量
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/21 - 14:53
 * @Version: v1.0
 *
 */
public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.zishow();
	}
}
class Ye{
	String name = "Ye";
	}

class Fu {
	String name = "Fu";
}

class Zi extends Fu {
	String name = "zi";

	public void zishow() {
		String name = "zishow";
		System.out.println(name); // zishow
		System.out.println(this.name);// Zi
		System.out.println(super.name); // Fu
	}
}

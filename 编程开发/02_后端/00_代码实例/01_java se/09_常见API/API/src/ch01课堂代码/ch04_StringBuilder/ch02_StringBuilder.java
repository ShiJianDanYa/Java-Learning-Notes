package ch01课堂代码.ch04_StringBuilder;

/**
 * ClassName: ch02_StringBuilder
 * Package: ch01课堂代码.ch04StringBuilder
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/2 - 09:58
 * @Version: v1.0
 *
 */
public class ch02_StringBuilder {
	static void main(String[] args) {
		/*
		StringBuilder的构造方法：
		public StringBuilder()                  空参构造
		public StringBuilder(String str)        带参构造

		StringBuilder的常见成员方法：
		append(任意类型)     添加数据
		reverse()           反转
		int length()        获取长度
		toString            变回字符串
		*/
		//创建StringBuilder对象
		//空参构造
		StringBuilder sb = new StringBuilder();
		System.out.println("--"+sb+"--");
		//带参构造
		StringBuilder sb1 = new StringBuilder("hello world");
		System.out.println(sb1);
		//添加数据
		sb1.append("java");
		System.out.println(sb1);
		//反转
		sb1.reverse();
		System.out.println(sb1);
		//获取长度
		System.out.println(sb1.length());
		//变回字符串
		String str = sb1.toString();
		System.out.println(str);
	}
}

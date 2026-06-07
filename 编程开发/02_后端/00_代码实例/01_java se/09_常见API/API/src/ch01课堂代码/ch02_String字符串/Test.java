package ch01课堂代码.ch02_String字符串;

/**
 * ClassName: Test
 * Package: ch01课堂代码.ch02String字符串
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/1 - 09:30
 * @Version: v1.0
 *
 */
public class Test {
	/*
	第一种：直接赋值
	第二种：new关键字
	public String()                                  空白字符串，不含任何内容
	public String(String original)                   根据传入的字符串，创建新的字符串对象
	public String(char[l chs)public                  根据字符数组，创建字符串对象
	String(byte[l chs)                               根据字节数组，创建字符串对象
	*/
	static void main(String[] args) {
		//直接赋值  最简单 最常用
		String s1 = "hello world";
		System.out.println(s1);
		//new+构造方法的方式创建字符串对象
		//new+空参构造
		String s2 = new String();
		System.out.println("["+s2+"]");
		//new+有参构造
		//根据传入字符串的内容，创建一个新的字符串对象
		String a = "你好啊世界";
		String s3 = new String(a);
		System.out.println(s3);
		//new+有参构造(字符数组，创建字符串对象)
		char[] chs = {'是','在','下','无','敌','啦'};
		String s4 = new String(chs);
		System.out.println(s4);
		//new+有参构造(字节数组，创建字符串对象)
		//ASCII码表
		//97 = a
		//98 = b
		byte[] bytes = {97,98,99};
		String s5 = new String(bytes);
		System.out.println(s5);

	}
}

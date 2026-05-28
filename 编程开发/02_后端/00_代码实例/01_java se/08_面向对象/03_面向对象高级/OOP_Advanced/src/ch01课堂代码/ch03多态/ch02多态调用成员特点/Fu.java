package ch01课堂代码.ch03多态.ch02多态调用成员特点;

/**
 * ClassName: Fu
 * Package: ch01课堂代码.ch03多态.ch02多态调用成员特点
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 11:02
 * @Version: v1.0
 *
 */
public class Fu extends  Ye{
	String name ="Fu";
	public void Fushow(){
		System.out.println("父类Fushow方法被调用了");
	}
	public void show(){
		System.out.println("父类show方法被调");
	}
}

package ch01课堂代码.ch03多态.ch02多态调用成员特点;

/**
 * ClassName: Zi
 * Package: ch01课堂代码.ch03多态.ch02多态调用成员特点
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/27 - 11:16
 * @Version: v1.0
 *
 */
public class Zi extends  Fu{
	String name ="Zi";
	int age = 10;
	//字类独有方法
	public void Zishow(){
		System.out.println("子类方法的ziShow方法被调用了");
	}
	//字类重写父类方法
	@Override
	public void show(){
		System.out.println("子类重写的show方法被调用");
	}
}

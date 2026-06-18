package ch01课堂代码.ch04抽象类和抽象方法.ch03模版方法设计模式;

/**
 * ClassName: People
 * Package: ch01课堂代码.ch04抽象类和抽象方法.ch03模版方法设计模式
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/18 - 16:02
 * @Version: v1.0
 *
 */
//模板类
public abstract class People {
	//模板方法设计模式。
	public final void write(){
		System.out.println("我的爸爸");
		System.out.println("我爸爸是一个好人，我特别喜欢他，他对我很好，我来介绍一下：");
		//模板方法知道子类一定要写这个正文，但是每个子类写的信息是不同的，父类定义一个抽象方法
		//具体的实现交给子类来重写正文。
		writeMain();
		System.out.println("我爸爸真好，你有这样的爸爸吗？");
	}
	public  abstract void writeMain();

}

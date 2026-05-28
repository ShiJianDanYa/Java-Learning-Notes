package ch01课堂代码.ch05接口.ch02接口中成员特点;

/**
 * ClassName: Inter
 * Package: ch01课堂代码.ch05接口.ch02接口中成员特点
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 06:39
 * @Version: v1.0
 *
 */
public interface Inter {
	//成员变量：只能是常量。默认修饰符：public static final
	// int a; 默认屎常量 怎么能不赋值呢?
	//规则：某一些关键字是灰色，表示当前可以省略不写
	public static final int A = 10;
	//构造方法
	//因为接口不能创建对象，而且接口里面所有的成员变量都是常量，已经有数据了
	//无需创建的同时赋值
	//public Inter() {}

	//成员方法：只能是抽象方法。默认修饰符：public abstract
	void method();

}

package ch01课堂代码.ch06接口新特性.ch01默认方法;

/**
 * ClassName: Inter
 * Package: ch01课堂代码.ch06接口新特性
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 13:52
 * @Version: v1.0
 *
 */
public interface InterA {
	public abstract void method1();
	public abstract void method2();
	//新增默认格式
	//public default 返回值类型 方法名【形参）{方法体}
	 default void function(){
		System.out.println("InterA接口中新增的默认方法");
	}
}

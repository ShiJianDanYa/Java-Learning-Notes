package ch01课堂代码.ch06接口新特性.ch01默认方法;

/**
 * ClassName: InterB
 * Package: ch01课堂代码.ch06接口新特性
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 14:23
 * @Version: v1.0
 *
 */
public interface InterB {
	default void function(){
		System.out.println("InterB接口中新增的默认方法");
	}
}

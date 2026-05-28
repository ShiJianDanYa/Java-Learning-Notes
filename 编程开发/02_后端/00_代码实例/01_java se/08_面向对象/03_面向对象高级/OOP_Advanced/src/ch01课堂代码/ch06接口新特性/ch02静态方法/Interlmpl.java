package ch01课堂代码.ch06接口新特性.ch02静态方法;

import ch01课堂代码.ch06接口新特性.ch01默认方法.InterA;

/**
 * ClassName: Interlmpl
 * Package: ch01课堂代码.ch06接口新特性.ch02静态方法
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 14:34
 * @Version: v1.0
 *
 */
public class Interlmpl extends Fu implements Inter {
	/*虚方法表
	非static 非final 非private
	只有虚方法表里面的方法才能够被重写，
	方法重写的实际意义就是替换了虚方法表中记录方法的内存地址*/

	//此时相当于接口和实现类里面刚好有两个同名的方法而已，
	//但是不构成重写关系
	/*public static void method(){
		System.out.println("接口中重写静态方法");
	}*/
}

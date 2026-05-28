package ch01课堂代码.ch06接口新特性.ch01默认方法;

/**
 * ClassName: Interlmpl
 * Package: ch01课堂代码.ch06接口新特性
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/28 - 13:54
 * @Version: v1.0
 *
 */
public class Interlmpl implements InterA,InterB{
	@Override
	public void method1() {
		System.out.println("实现类重写的method1方法");
	}

	@Override
	public void method2() {
		System.out.println("实现类重写的method2方法");
	}

	@Override
	public void function(){
		System.out.println("实现类重写的function方法");
	}

}

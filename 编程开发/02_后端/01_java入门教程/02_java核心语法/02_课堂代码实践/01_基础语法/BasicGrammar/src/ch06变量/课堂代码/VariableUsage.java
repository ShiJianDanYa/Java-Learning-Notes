package ch06变量.课堂代码;

/**
 * ClassName: VariableUsage
 * Package: ch06变量
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/15 - 16:25
 * @Version: v1.0
 *
 */
public class VariableUsage {
	static void main(String[] args) {
		//1基本用法
		//定义变量，在进行输出
		int a=10;
		System.out.println("a的值："+a);//10
		System.out.println("a的值："+a);//10
		System.out.println("a的值："+a);//10
		System.out.println("-----------------------------");

		//2. 变量参与计算
		int b = 10;
		int c = 20;
		System.out.println("b的值："+ b);
		System.out.println("c的值："+ c);
		System.out.println("b+c的值："+b+c); //30
		System.out.println("-----------------------------");

		//3.修改变量记录的值
		a = 100;
		System.out.println("a修改后的值："+a);//100
		System.out.println("-----------------------------");
	}
}

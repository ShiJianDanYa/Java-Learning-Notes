package 课堂代码.ch03_循环结构.ch04_循环高级语法.ch03_循环嵌套;

/**
 * ClassName: ch01_循环嵌套
 * Package: 课堂代码.ch03_循环结构.ch04_循环高级语法.ch03_循环嵌套
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/26 - 20:29
 * @Version: v1.0
 *
 */
public class ch01_循环嵌套 {
	public static void main(String[] args){
		/*
		打印4行5列的*
		* * * * *
		* * * * *
		* * * * *
		* * * * *

		限定：每次只能输出个*

		提示
		System.out.println("*")；先打印，再换行
		System.out.print("*")；只打印，不换行
		*/

		//外行内列
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

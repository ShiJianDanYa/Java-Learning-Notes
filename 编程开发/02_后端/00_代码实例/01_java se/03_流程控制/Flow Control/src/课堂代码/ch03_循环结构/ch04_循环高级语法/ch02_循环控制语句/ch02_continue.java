package 课堂代码.ch03_循环结构.ch04_循环高级语法.ch02_循环控制语句;

/**
 * ClassName: ch02_continue
 * Package: 课堂代码.ch03_循环结构.ch04_循环高级语法.ch02_循环控制语句
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/26 - 14:10
 * @Version: v1.0
 *
 */
public class ch02_continue {
	public static void main(String[] args){
		for (int i = 1; i < 10; i++) {
			if(i == 5) continue;
			System.out.println(i);
		}
	}
}

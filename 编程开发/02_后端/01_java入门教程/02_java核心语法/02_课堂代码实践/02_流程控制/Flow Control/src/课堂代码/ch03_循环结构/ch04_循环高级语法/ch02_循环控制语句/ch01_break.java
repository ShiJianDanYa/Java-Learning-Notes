package 课堂代码.ch03_循环结构.ch04_循环高级语法.ch02_循环控制语句;

/**
 * ClassName: ch01_break
 * Package: 课堂代码.ch03_循环结构.ch04_循环高级语法.ch02_循环控制语句
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/25 - 15:30
 * @Version: v1.0
 *
 */
public class ch01_break {
	static void main(String[] args) {
		/*break关键字:
		不能单独出现的，只能写在switch或者循环当中，表示结束、跳出的意思
			
			
		循环的快速生成方式：次数.fori+回车*/

		for (int i = 0; i < 100; i++) {
			//看到break关键字，循环就直接结束了
			if(i==15) break;
			System.out.println(i);
		}
	}
}

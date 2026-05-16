package 课堂练习.ch04_循环高级用法.ch02_循环控制语句.ch01_break;

/**
 * ClassName: 循环嵌套和break
 * Package: 课堂练习.ch04_循环高级用法.ch02_循环控制语句.ch01_break
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/16 - 13:21
 * @Version: v1.0
 *
 */
public class 循环嵌套和break {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int i1 = 0; i1 < 3; i1++) {
				if(i1 == 1){
					break;
				}
				System.out.println("i1 = " + i1);
			}
		}
	}
}

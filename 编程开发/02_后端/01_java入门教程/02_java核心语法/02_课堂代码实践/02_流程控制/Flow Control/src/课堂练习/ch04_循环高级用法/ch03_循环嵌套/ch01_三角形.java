package 课堂练习.ch04_循环高级用法.ch03_循环嵌套;

/**
 * ClassName: ch01_三角形
 * Package: 课堂练习.ch04_循环高级用法.ch03_循环嵌套
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/26 - 20:37
 * @Version: v1.0
 *
 */
public class ch01_三角形 {
	public static void main(String[] args){
		//打印正三角形
		for (int i = 0; i < 5; i++) {
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		//打印倒三角形
		for (int i = 0; i < 5; i++) {
			for(int j=i;j<5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

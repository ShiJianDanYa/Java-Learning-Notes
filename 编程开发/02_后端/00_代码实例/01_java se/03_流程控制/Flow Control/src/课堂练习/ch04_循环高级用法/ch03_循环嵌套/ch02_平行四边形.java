package 课堂练习.ch04_循环高级用法.ch03_循环嵌套;

/**
 * ClassName: ch02_平行四边形
 * Package: 课堂练习.ch04_循环高级用法.ch03_循环嵌套
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/26 - 20:48
 * @Version: v1.0
 *
 */
public class ch02_平行四边形 {
	public static void main(String[] args){
		/*
		*   ******
		*  ******
		* ******
		* 提示空格 321
		* */

		for (int i = 2; i >=0; i--) {
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for (int k = 0; k < 5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

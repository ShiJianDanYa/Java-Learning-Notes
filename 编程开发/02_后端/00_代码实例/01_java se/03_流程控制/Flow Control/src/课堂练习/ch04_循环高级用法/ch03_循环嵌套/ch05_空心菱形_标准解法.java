package 课堂练习.ch04_循环高级用法.ch03_循环嵌套;

/**
 * ClassName: ch05_空心菱形_标准解法
 * Package: 课堂练习.ch04_循环高级用法.ch03_循环嵌套
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/4/27 - 16:34
 * @Version: v1.0
 *
 */
public class ch05_空心菱形_标准解法 {
	public static void main(String[] args){
		/* 打印空心菱形
		 *    *
		 *   * *
		 *  *   *
		 *   * *
		 *    *
		 *
		 * */
		// 上三角（含中间行）
		for (int i = 1; i <= 3; i++) {
			// 前导空格
			for(int j = 1; j <= 4 - i; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			// 中间空格（第1行不打印）
			if(i > 1){
				for(int k = 1; k <= 2 * i - 3; k++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		// 下三角
		for (int i = 1; i <= 2; i++) {
			// 前导空格
			for(int j = 1; j <= i + 1; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			// 中间空格
			if(i < 2){
				for(int k = 1; k <= 3 - 2 * i; k++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
